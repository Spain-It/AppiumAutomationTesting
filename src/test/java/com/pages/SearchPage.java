package com.pages;

import com.utilities.Driver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.util.WeakHashMap;

public class SearchPage {

    public SearchPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()), this);
    }


    @AndroidFindBy(accessibility = "Search View")
    public WebElement searchView;

    @AndroidFindBy(accessibility = "Filter")
    public WebElement filter;

    @AndroidFindBy(id= "android:id/search_src_text")
    public WebElement searchBox;

    @AndroidFindBy(id= "android:id/text1")
    public WebElement firstText;




    public void scroll(String text) {
        Driver.get().findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"" + text + "\"));");
    }
}
