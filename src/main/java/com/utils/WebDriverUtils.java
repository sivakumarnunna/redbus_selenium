package com.utils;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;

public class WebDriverUtils {

	public static WebDriver driver;
	static {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	public void openURL(String name) {
		driver.get("https://www." + name + ".in");
	}
	
	public void setText(String text,String value) {
		construct_xpath(text).sendKeys(value);
	}
	public boolean verifyElementPresent(String name) {
		if (driver.findElements(By.xpath("//*[text()='" + name + "']")).size() > 0) {
			return true;
		}
		return false;
	}
	public boolean verifyTextPresent(String name) {
		if (driver.findElements(By.xpath("//*[text()='" + name + "']")).size() > 0) {
			return true;
		}
		return false;
	}
	public WebElement construct_xpath(String property, String name) {
		return driver.findElement(By.xpath("//*[@"+property+"='" + name + "']"));
		}
	public WebElement construct_xpath(String name) {
		return driver.findElement(By.xpath("//*[text()='" + name + "']"));
		}
	public WebElement construct_xpath(String tag,String property, String name) {
		return driver.findElement(By.xpath("//"+tag+"[@"+property+"='" + name + "']"));
		}

	public void click(String name) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(construct_xpath(name))).click();
	}
	public BufferedImage takeScreenShot(WebDriver driver, String imagename) throws IOException {
		TakesScreenshot scrshot = ((TakesScreenshot)driver);
		File srcFile = scrshot.getScreenshotAs(OutputType.FILE);
        File DestFile=new File("image/actual/"+imagename+".png");
        FileUtils.copyFile(srcFile, DestFile);
		return ImageIO.read(DestFile);

	}
	public void compareImage(WebElement element,String image)
			throws IOException, InterruptedException {
		BufferedImage act_image = takeScreenShot(element,image);
		BufferedImage exp_image = ImageIO.read(new File("image/sot/"+image+".png"));
		
		ImageDiffer imd = new ImageDiffer();
		boolean hasDiff = false;
		int diffSize = imd.makeDiff(act_image, exp_image).getDiffSize();
		Assert.assertFalse(hasDiff," screen validation failed at "+image+" and diff size is "+diffSize);
	}
	public BufferedImage takeScreenShot(WebElement element,String imagename) throws IOException {
		File srcFile = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
        File DestFile=new File("image/actual/"+imagename+".png");
        FileUtils.copyFile(srcFile, DestFile);
		return ImageIO.read(DestFile);
	}
	public void selectText(WebElement we,String value) {
		Select sel = new Select(we);
		sel.selectByValue("Cancel Ticket");
	}
	
	
	
}
