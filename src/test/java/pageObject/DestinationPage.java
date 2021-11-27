package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DestinationPage extends CrossPage{
    @FindBy(css=".react-autosuggest__input.destinations-header__input")
    WebElement searchBox;
    @FindBy(xpath="//button[contains(text(),'Search')]")
    WebElement searchBtn;

    public DestinationPage(WebDriver driver) {
        super(driver);
    }
    public void search(String destination){
        waitForVisibleOfElement(searchBox);
        fillText(searchBox,destination);
        waitForVisibleOfElement(searchBtn);
        click(searchBtn);
    }
}
