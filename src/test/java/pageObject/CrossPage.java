package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CrossPage extends BasePage {


    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/a[1]")
    WebElement destBtn;
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/a[2]")
    WebElement magazineBtn;
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/a[3]")
    WebElement aboutUsBtn;
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/a[3]")
    WebElement singInBtn;
    @FindBy(xpath = "//button[contains(text(),'₪')]")
    WebElement currencyBtn;
    @FindBy(xpath = "//header/div[1]/a[1]/img[1]")
    WebElement MainBtn;
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]/img[1]")
    WebElement langBtn;
    @FindBy(css = ".cookies-policy-banner__button.btn")
    WebElement cookiesBnr;


    public CrossPage(WebDriver driver) {
        super(driver);
    }

    public DestinationPage clickDestination() {
        click(destBtn);
        return new DestinationPage(driver);
    }
}
