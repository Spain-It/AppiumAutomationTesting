package com.automation;


import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserChrome {

    @Test
    public void chromeTest() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("browserName","chrome");

        WebDriverManager.chromedriver().version("2.23").setup();
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,WebDriverManager.chromedriver().getBinaryPath());


        RemoteWebDriver driver = new RemoteWebDriver(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);



        driver.get("http://zero.webappsecurity.com/login.html");

        WebElement userName = driver.findElement(By.id("user_login"));

        WebElement password = driver.findElement(By.id("user_password"));

        WebElement submit = driver.findElement(By.xpath("//input[@name='submit']"));

        userName.sendKeys("username");
        password.sendKeys("password");
        Thread.sleep(2000);
        submit.click();

        Thread.sleep(5000);
    }

}
