package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends CrossPage{


    @FindBy(xpath = "//span[contains(text(),'Where?')]")
    WebElement WhereBtn;
    @FindBy(xpath = "//input[@id='react-select-search-bar.from-input']")
    WebElement fromBtn;
    @FindBy(xpath = "//span[contains(text(),'To:')]")
    WebElement toBtn;


    public MainPage(WebDriver driver) {
        super(driver);
    }
}
