package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPageHelper extends PageBase {
    public MainPageHelper(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "slogan")
    WebElement slogan;
//    WebElement slog = driver.findElement(By.className(""));

    @FindBy(css = ".mat-button-wrapper .material-icons")
    WebElement homeButton;

    @FindBy(id="mat-input-0")
    WebElement fromField;


    public boolean sloganContainsText() {
        return slogan.getText().contains("CHEAP TRIP. PAY LESS, VISIT MORE!");
    }

    public boolean homeButtonIsDisplayed() {
        return homeButton.isDisplayed();
    }

    public void inputCityInFromField(String city) {
        fromField.sendKeys(city);
    }
}
