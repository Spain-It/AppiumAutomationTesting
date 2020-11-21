package com.automation;

import com.pages.DragAndDropPage;
import io.appium.java_client.TouchAction;
import org.junit.Assert;
import org.junit.Test;

public class DragAndDrop {

    DragAndDropPage dragdrop = new DragAndDropPage();

    @Test
    public void dragAndDrop(){

        dragdrop.views.click();

        dragdrop.dragDrop.click();

        dragdrop.setDragDrop(dragdrop.soldaire,  dragdrop.sagdaire);

        Assert.assertEquals("Dropped!",dragdrop.message.getText());

    }
}
