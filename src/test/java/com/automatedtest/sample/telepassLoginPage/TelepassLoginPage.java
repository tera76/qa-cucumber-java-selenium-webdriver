package com.automatedtest.sample.tera76LoginPage;

import com.automatedtest.sample.basepage.BasePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.stream.IntStream;

public class tera76LoginPage extends BasePage {


    private static final String HOME_PAGE_URL = "https://www.tera76.com/KTI/login";

    private static final String USERNAME_SELECTOR = "username";
    private static final String PASSWORD_SELECTOR = "password";
    private static final String ACCESS_BUTTON_SELECTOR = "submitlogin";


    @FindBy(id = USERNAME_SELECTOR)
    private WebElement username;

    @FindBy(id = PASSWORD_SELECTOR)
    private WebElement password;

    @FindBy(id = ACCESS_BUTTON_SELECTOR)
    private WebElement accessButton;

    tera76LoginPage() {
        PageFactory.initElements(driver, this);
    }


    void goTotera76LoginPage(){
        driver.get(HOME_PAGE_URL);
        wait.sleep(2);
    }

    void setUsername(String userValue){
        username.sendKeys(userValue);

    }

    void setPassword(String passValue){
        password.sendKeys(passValue);

    }

    public void clickAccessButton() {
        accessButton.click();
    }
}

