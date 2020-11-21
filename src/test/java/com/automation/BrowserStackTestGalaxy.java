package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTestGalaxy {

    public static final String USERNAME = "vyom8";
    public static final String AUTOMATE_KEY = "TvmbhdtTsnmdxeWxeuaG";
    public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@hub-cloud.browserstack.com/wd/hub";

    @Test
    public void galaxyS10e() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps =new DesiredCapabilities();

        caps.setCapability("browserName", "android");
        caps.setCapability("device", "Samsung Galaxy S10e");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "9.0");
        caps.setCapability("build", "First Test With Class");
        caps.setCapability("project","apidemo");
        caps.setCapability("name", "vyom8's First Test");
        //caps.setCapability("app","bs://e95b204d2ce1c55df67a4958417b55f92721e224");
        caps.setCapability("browserName", "chrome");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL(URL),caps);

        Thread.sleep(5000);

        WebElement preference = driver.findElementByAccessibilityId("Preference");
        preference.click();

        Thread.sleep(2000);
        WebElement preferenceDependencies = driver.findElementByAccessibilityId("3. Preference dependencies");
        preferenceDependencies.click();

        WebElement checkBox = driver.findElementById("android:id/checkbox");
        checkBox.click();

        Thread.sleep(2000);

        WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
        wifiSetting.click();

        WebElement inputBox = driver.findElementById("android:id/edit");

        inputBox.sendKeys("appiumTest");

        WebElement okButton = driver.findElementById("android:id/button1");

        Assert.assertEquals("appiumTest",inputBox.getText());

        okButton.click();

        Thread.sleep(3000);


    }

}
