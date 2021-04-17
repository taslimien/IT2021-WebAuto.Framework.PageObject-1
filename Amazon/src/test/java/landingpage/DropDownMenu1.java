package landingpage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class DropDownMenu1 extends CommonAPI {

    @Test
    public void dropDownMenu1(){
        List<WebElement> webElements = driver.findElements(By.cssSelector(".nav-search-dropdown.searchSelect option"));
        for (WebElement element:webElements){
            System.out.println(element.getText());
        }
    }
}
