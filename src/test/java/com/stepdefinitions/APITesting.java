package com.stepdefinitions;

import java.io.FileNotFoundException;
import java.io.IOException;
import com.utils.BasicUtils;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class APITesting extends BasicUtils {
	public static void main(String[] args) throws FileNotFoundException, IOException {
        RestAssured.baseURI = config_properties.getProperty("base-URL");
        Response response = RestAssured.get("intensity");
        System.out.println("Status Code: " + response.getStatusCode());
        System.out.println("Response Body: " + response.getBody().asString());
    }
}
