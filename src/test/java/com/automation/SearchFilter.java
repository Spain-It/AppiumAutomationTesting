package com.automation;

import com.pages.DragAndDropPage;
import com.pages.SearchPage;
import org.junit.Assert;
import org.junit.Test;

public class SearchFilter {

    DragAndDropPage drop = new DragAndDropPage();
    SearchPage searchPage = new SearchPage();

    @Test
    public void search() throws InterruptedException {

       drop.views.click();

       searchPage.scroll("Search View");

       searchPage.searchView.click();

       searchPage.filter.click();

       String text = "Colby";

       searchPage.searchBox.sendKeys(text);

       Thread.sleep(3000);

        Assert.assertEquals(text,searchPage.firstText.getText());

    }
}
