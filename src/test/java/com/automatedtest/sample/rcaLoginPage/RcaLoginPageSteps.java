package com.automatedtest.sample.rcaLoginPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class RcaLoginPageSteps {

    private RcaLoginPage rcaLoginPage;

    public RcaLoginPageSteps() {
        this.rcaLoginPage = new RcaLoginPage();
    }


    @And("^Set username (.*)$")
    public void setUsername(String username) {
        this.rcaLoginPage.setUsername(username);
    }

    @And("^Set password (.*)$")
    public void setPassword(String password) {
        this.rcaLoginPage.setPassword(password);
    }

    @And("Click access button")
    public void clickAccessButton() { this.rcaLoginPage.clickAccessButton();

    }

    @Given("A user navigates rca home page")
    public void aUserNavigatesRcaHomePage() {
        this.rcaLoginPage.goToRcaHomePage();
    }

    @Given("A user navigates rca login page")
    public void aUserNavigatesRcaLoginPage() {
        this.rcaLoginPage.goToRcaLoginPage();
    }

    @And("^Set credentials$")
    public void setCredentials(DataTable dt) {
        //Initialize data table
        this.rcaLoginPage.setCredentials(dt);

    }

}
