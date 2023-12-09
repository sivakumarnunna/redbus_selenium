package com.stepdefinitions;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.utils.WebDriverUtils;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;

public class RedbusStepDefinitions extends WebDriverUtils {

	@Given("open website {string}")
	public void open_url(String name) {
		openURL(name);
	}

	@Given("find below tabs")
	public void find_tabs(DataTable table) throws IOException {
		List<String> tabs = table.asList(String.class);
		for (String tab : tabs) {
			System.out.println(tab);
			Assert.assertEquals(verifyElementPresent(tab), true, tab + " not present");
		}
	}

	@Given("clicked on {string}")
	public void click_element(String text) {
		click(text);
	}

	@Given("verify image header")
	public void verify_image() throws IOException, InterruptedException {
		WebElement element = driver.findElement(By.xpath("//header"));
		takeScreenShot(element, "redbus_header");
		compareImage(element, "redbus_header");
	}
	@Given("verify search buses")
	public void verify_search_bus() throws IOException, InterruptedException {
		WebElement element = driver.findElement(By.xpath("//*[@class='sc-ckVGcZ ikHMPa']"));
		takeScreenShot(element, "redbus_search");
		compareImage(element, "redbus_search");
	}
	@Given("verify image Cab Rental")
	public void verify_cab_rental() throws IOException, InterruptedException {
		WebElement element = construct_xpath("class", "ld301i23Zx8IXiuZmK4d");
		takeScreenShot(element, "redbus_cab_rental");
		compareImage(element, "redbus_cab_rental");
	}
	@Given("verify image Cancel Ticket")
	public void verify_cancel_ticket() throws IOException, InterruptedException {
		WebElement element = construct_xpath("class", "cancellation-form-main");
		takeScreenShot(element, "redbus_cancel_ticket");
		compareImage(element, "redbus_cancel_ticket");
	}
	@Given("select {string}")
	public void select_dropdown(String value) throws IOException, InterruptedException {
		WebElement element = construct_xpath("Account");
		selectText(element,value);
		
	}
	@Given("verify text:")
	public void verify_text(DataTable dt) throws IOException, InterruptedException {
		List<String> ls = dt.asList();
		  for(String st : ls) {
			verifyTextPresent(st);
		  }
		
	}
}
