package com.pages;

import com.utilities.Driver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class DragAndDropPage {

    public DragAndDropPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.get()),this);
    }

    @AndroidFindBy(accessibility = "Views")
    public WebElement views;

    @AndroidFindBy(accessibility = "Drag and Drop")
    public WebElement dragDrop;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_1")
    public WebElement soldaire;

    @AndroidFindBy(id = "io.appium.android.apis:id/drag_dot_2")
    public WebElement sagdaire;

   @AndroidFindBy(id = "io.appium.android.apis:id/drag_result_text")
    public WebElement message;


   public void setDragDrop(WebElement kaynak, WebElement hedef){
       TouchAction action = new TouchAction(Driver.get());

       action.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(kaynak))).moveTo(ElementOption.element(hedef)).release().perform();

   }

}
