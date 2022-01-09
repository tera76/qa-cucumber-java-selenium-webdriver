package com.automatedtest.sample.rcaFastquotePage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class RcaFastquotePageSteps {

    private RcaFastquotePage rcaFastquotePage;

    public RcaFastquotePageSteps() {
        this.rcaFastquotePage = new RcaFastquotePage();
    }



    @And("Click help icon")
    public void clickHelpIcon() {
        this.rcaFastquotePage.clickHelpIcon();
    }

    @And("^Sidebar should contain following values$")
    public void sidebarShouldContainFollowingValues(DataTable dt) {
        this.rcaFastquotePage.checkSidebar(dt);
    }


    @And("^User set birthDate to (.*)$")
    public void userSetBirthDateTo(String birthDate) {
        this.rcaFastquotePage.setBirthDate(birthDate);
    }

    @And("^Set Check Data$")
    public void setCheckData(DataTable dt) {
        //Initialize data table
        this.rcaFastquotePage.setCheckData(dt);

    }

    @And("^Check Data should be$")
    public void getCheckData(DataTable dt) {
        //Initialize data table
        this.rcaFastquotePage.getCheckData(dt);

    }

    @And("User click OwnerAge checkbox")
    public void userClickOwnerAgeCheckbox() {
        this.rcaFastquotePage.clickOwnerAge_checkbox();
    }

    @And("User set Questionary checkbox to true")
    public void userSetQuestionaryTrue() {
        this.rcaFastquotePage.setQuestionary_checkbox();
    }

    @And("User set TermsAndCond checkbox to true")
    public void userSetTermAndCondCheckbox() {
        this.rcaFastquotePage.setTermAndCond_checkbox();
    }
}
