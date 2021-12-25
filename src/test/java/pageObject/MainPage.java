package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MainPage extends CrossPage{


    @FindBy(css = ".react-autosuggest__input.destinations-header__input")
    WebElement serachBox;
    @FindBy(css = ".destinations-header__suggestion .destinations-header__suggestion-wrapper")
    List <WebElement> serachlist;
    @FindBy(css = ".button.btn-secondary.btn.btn-with-icon")
    WebElement serachBtn;
    @FindBy(xpath = "//span[contains(text(),'View all destinations')]")
    WebElement viewDestintionBtn;
    @FindBy(xpath = "//span[contains(text(),'View all articles')]")
    WebElement viewArticlesBtn;



    public MainPage(WebDriver driver) {
        super(driver);
    }




    public DestinationsPage clickDestination() {
        click(destBtn);
        return new DestinationsPage(driver);
    }

}
