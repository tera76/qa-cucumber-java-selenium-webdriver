package com.automatedtest.sample.basepage;

import com.automatedtest.sample.infrastructure.driver.Setup;
import com.automatedtest.sample.infrastructure.driver.Wait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasePage {

    protected WebDriver driver;
    protected Wait wait;

    public BasePage() {
        this.driver = Setup.driver;
        this.wait = new Wait(this.driver);
      //  driver.manage().deleteAllCookies();
    }

    public void checkPageContainText(String text) {
        try {
            String bbb = driver.getPageSource();
            driver.findElement(By.xpath("//*[contains(.,'"+text+"')]"));
        } catch (Exception e) {
            Assert.fail("Text not in the page.");
        }
    }

    public void checkPageNotContainText(String text) {
        try {
            String bbb = driver.getPageSource();
            driver.findElement(By.xpath("//*[contains(.,'"+text+"')]"));
            Assert.fail("Text in the page.");
        } catch (Exception e) {

        }
    }





}
