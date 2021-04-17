package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AllFunctionality {

    LandingPage landingPage = null;
    SectionPage sectionPage = null;
    SearchPage searchPage = null;

    public void clickOnSectionMenu(WebDriver driver){
        landingPage = PageFactory.initElements(driver, LandingPage.class);
        landingPage.clickOnSectionMenu();
    }

    public void sectionMenu(WebDriver driver){
        clickOnSectionMenu(driver);
        sectionPage = PageFactory.initElements(driver, SectionPage.class);
        String headLineNews = sectionPage.goToBusinessPage(driver).getHeadLineNews();
        System.out.println(headLineNews);
    }
}
