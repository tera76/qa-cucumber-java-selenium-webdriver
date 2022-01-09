package com.automatedtest.sample.tera76LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class tera76LoginPageSteps {

    private tera76LoginPage tera76LoginPage;

    public tera76LoginPageSteps() {
        this.tera76LoginPage = new tera76LoginPage();
    }

    @Given("^A user navigates to tera76 login page$")
    public void aUserNavigateTotera76LoginPage() {
        this.tera76LoginPage.goTotera76LoginPage();
    }

    @And("^Set app autentication$")
    public void setAppAutentication(String username) {
        this.tera76LoginPage.setUsername(username);
    }

    @And("^Set username (.*)$")
    public void setUsername(String username) {
        this.tera76LoginPage.setUsername(username);
    }

    @And("^Set password (.*)$")
    public void setPassword(String password) {
        this.tera76LoginPage.setPassword(password);
    }

    @And("Click access button")
    public void clickAccessButton() { this.tera76LoginPage.clickAccessButton();
    }
}
