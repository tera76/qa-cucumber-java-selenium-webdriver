package com.automatedtest.sample.infrastructure.driver;


import io.cucumber.java.Before;
import org.junit.rules.Timeout;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class Setup {

    public static WebDriver driver;

    @Before
    public void setWebDriver() throws Exception {

        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "chrome";
        }
        switch (browser) {
            case "chrome":
                ChromeOptions chromeOptions = new ChromeOptions();
                //  chromeOptions.addArguments("--headless", "--disable-gpu", "--window-size=1920,1200","--ignore-certificate-errors");
                chromeOptions.addArguments("--disable-gpu", "--window-size=2920,2200", "--ignore-certificate-errors");

                //     chromeOptions.addArguments("start-maximized");
                //     chromeOptions.addArguments("disable-infobars");
               // chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});
                System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver");
                chromeOptions.addArguments("window-position=0,-2000","--incognito");
                driver = new ChromeDriver(chromeOptions);



              //  driver.manage().window().maximize();
                driver.manage().timeouts().implicitlyWait(15,  TimeUnit.SECONDS);
                break;
            case "firefox":
                driver = new FirefoxDriver();
                driver.manage().window().maximize();
                break;
            default:
                throw new IllegalArgumentException("Browser \"" + browser + "\" isn't supported.");
        }
    }
}
