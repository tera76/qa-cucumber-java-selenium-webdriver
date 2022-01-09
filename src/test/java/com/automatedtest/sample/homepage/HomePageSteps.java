package com.automatedtest.sample.homepage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;

public class HomePageSteps {


    private HomePage homePage;

    public HomePageSteps() {
        this.homePage = new HomePage();
    }

    @Given("^A user navigates to HomePage \"([^\"]*)\"$")
    public void aUserNavigatesToHomePage(String country) {
        this.homePage.goToHomePage(country);
    }

    @Then("^Google logo is displayed$")
    public void googleLogoIsDisplayed() {
        this.homePage.checkLogoDisplay();
    }

    @And("^search bar is displayed$")
    public void searchBarIsDisplayed() {
        this.homePage.checkSearchBarDisplay();
    }

    @Then("^page title is \"([^\"]*)\"$")
    public void pageTitleIs(String title) {
        this.homePage.checkTitle(title);
    }

    @When("^a user searches for \"([^\"]*)\"$")
    public void aUserSearchesFor(String searchValue) {
        this.homePage.searchFor(searchValue);
    }

    @Then("^page should contain (.*)$")
    public void pageShouldContain(String title) {
        this.homePage.checkPageContainText(title);
    }

    @Then("^page should not contain (.*)$")
    public void pageShouldNotContain(String title) {
        this.homePage.checkPageNotContainText(title);
    }

    @Given("User click {string} button")
    public void userClickButton(String arg0) {
        this.homePage.clickByText(arg0);
    }




    @And("Wait few seconds")
    public void waitFewSeconds() {
        this.homePage.waitTwoSeconds();
    }

    @And("Wait more seconds")
    public void waitMoreSeconds() {
        this.homePage.waitTwoSeconds();
        this.homePage.waitTwoSeconds();
        this.homePage.waitTwoSeconds();
        this.homePage.waitTwoSeconds();
        this.homePage.waitTwoSeconds();
    }

    @And("^Page url should be (.*)$")
    public void pageUrlShouldBe(String expectedUrl) {
        this.homePage.checkUrl(expectedUrl);
    }
}
