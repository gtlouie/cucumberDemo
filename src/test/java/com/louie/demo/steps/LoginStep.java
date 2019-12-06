package com.louie.demo.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginStep {
    @Given("^I am on login page$")
    public void iAmOnLoginPage() {
        System.out.println("I am on login page");
    }

    @When("^I input name$")
    public void iInputName() {
        System.out.println("I input name");
    }
}
