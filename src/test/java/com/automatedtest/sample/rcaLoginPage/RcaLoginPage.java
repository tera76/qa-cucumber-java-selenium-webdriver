package com.automatedtest.sample.rcaLoginPage;

import com.automatedtest.sample.basepage.BasePage;
import com.automatedtest.sample.infrastructure.driver.Wait;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Map;

public class RcaLoginPage extends BasePage {


    private static final String RCA_LOGIN_PAGE_URL = "https://mga-rca-web-dev.tera76tools.it/login";
    private static final String RCA_AUTH_HOME_PAGE_URL = "https://tera76:Wk3a5N@mga-rca-web-dev.tera76tools.it/";
   // ptoduction -  private static final String RCA_AUTH_HOME_PAGE_URL = "https://tera76assicura.tera76.com/";

    private static final String USERNAME_SELECTOR = "username";
    private static final String PASSWORD_SELECTOR = "password";
    private static final String ACCESS_BUTTON_SELECTOR = "//*[@id=\"root\"]/div/div[7]/div/form/div[3]/button";


    @FindBy(name = USERNAME_SELECTOR)
    private WebElement username;

    @FindBy(name = PASSWORD_SELECTOR)
    private WebElement password;

    @FindBy(xpath = ACCESS_BUTTON_SELECTOR)
    private WebElement accessButton;

    RcaLoginPage() {
        PageFactory.initElements(driver, this);
    }

    void goToRcaHomePage() {
        driver.get(RCA_AUTH_HOME_PAGE_URL);

    }



    void goToRcaLoginPage() {
        driver.get(RCA_AUTH_HOME_PAGE_URL);

    }

    void setUsername(String userValue) {
        username.sendKeys(userValue);

    }

    void setPassword(String passValue) {
        password.sendKeys(passValue);

    }

    public void clickAccessButton() {
        accessButton.click();
        wait.forLoading(30);

    }

    public void setCredentials(DataTable dt) {
        List<String> key = dt.column(0);
        List<String> value = dt.column(1);
        for (int i = 0; i < key.size(); i++) {
            if(key.get(i).toLowerCase().equals("username")) setUsername(value.get(i));
            if(key.get(i).toLowerCase().equals("password")) setPassword(value.get(i));

        }
    }
}

