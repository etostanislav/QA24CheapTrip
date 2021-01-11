package tests;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.MainPageHelper;

public class MainPageValidation extends TestBase {
    MainPageHelper mainPageHelper;
    String cityFrom = "Tel-Aviv";

    @BeforeMethod
    public void unitTests(){
        mainPageHelper = PageFactory.initElements(driver, MainPageHelper.class);
    }

    @Test(priority = 2)
    public void sloganIsDisplayedTest() throws InterruptedException {
        Thread.sleep(5000);
        assert mainPageHelper.sloganContainsText();
    }

    @Test(priority = 2)
    public void homeButtonIsDisplayedTest(){
        mainPageHelper.homeButtonIsDisplayed();
    }

    @Test(priority = 1, groups = {"smoke", "searchResult"})
    public void searchResultIsDisplayedTest(){
        mainPageHelper.inputCityInFromField(cityFrom);
//        mainPageHelper.inputCityInToField();
//        mainPageHelper.clickOnLetsGoButton();
//        assert mainPageHelper.resultIsDisplayed();
    }
}
