package com.stepdefinitions;

import java.util.List;

import com.beans.UserInfo;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class CucumberStepDefinitions {

	UserInfo userinfo = new UserInfo();
	@Given("username {string}")
	public void username(String username ) {
		userinfo.setUsername(username);
	}

	@Given("password {string}")
	public void password(String password) {
		userinfo.setPassword(password);
	}
	@Given("email {string}")
	public void email(String email) {
		userinfo.setEmail(email);

	}
	@Given("mobile {string}")
	public void mobile(String mobile) {
		userinfo.setMobile(mobile);
	}
	@Then("collect the data")
	public void collect_data() {
		System.out.println("username "+userinfo.getUsername());
		}
		
	}
	


