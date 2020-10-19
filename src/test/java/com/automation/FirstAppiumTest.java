package com.automation;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class FirstAppiumTest {


    @Test
    public void test1() throws MalformedURLException, InterruptedException {

        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();

        desiredCapabilities.setCapability("plartformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");
        desiredCapabilities.setCapability("app","C:\\Users\\Tahsin\\IdeaProjects\\AppiumAutomationTesting\\etsy.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);

        Thread.sleep(5000);
    }



}
