package landingpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import search.SearchItem;

import java.util.List;

public class SearchPage extends CommonAPI {

    @Test
    public void search() throws InterruptedException {
        List<String> itemList = SearchItem.getItemList();
        for (String item:itemList) {
            typeOnCss("#twotabsearchtextbox", item);
            Thread.sleep(2000);
            clearInputField("#twotabsearchtextbox");
        }
    }
}
