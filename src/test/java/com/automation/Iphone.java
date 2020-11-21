package com.automation;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Iphone {

    public static final String USERNAME = "vyom9";
    public static final String AUTOMATE_KEY = "dDGj9drqafVz9j1zjapu";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void iphone11Pro() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 11 Pro");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "13");
        caps.setCapability("build","First Iphone Test");
        caps.setCapability("name", "iphone 11 pro test");
        caps.setCapability("app","bs://ad42379b88fb99471af9a1da7cbdf8abf20fbf0e");

        IOSDriver<IOSElement> driver = new IOSDriver<IOSElement>(new URL(URL),caps);

        Thread.sleep(3000);

    }

}

