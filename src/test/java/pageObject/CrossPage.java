package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CrossPage extends BasePage {

    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/a[1]")
    WebElement destBtn;
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/a[2]")
    WebElement magazineBtn;
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/a[3]")
    WebElement aboutUsBtn;
    @FindBy(xpath = "//header/div[1]/div[1]/nav[1]/a[3]")
    WebElement singInBtn;
    @FindBy(xpath = "//header/div[1]/a[1]/img[1]")
    WebElement mainBtn;
    @FindBy(xpath = "//header/div[1]/div[1]/div[1]/div[3]/div[1]/button[1]/img[1]")
    WebElement langBtn;
    @FindBy(css = ".cookies-policy-banner__button.btn")
    WebElement cookiesBnr;
    @FindBy(css = ".lang-switcher .nav__dropdown-menu button")
    List<WebElement> langChoice;
    @FindBy(css = ".lang-switcher .nav__dropdown-menu")
    WebElement language;
    @FindBy(xpath = "//button[contains(text(),'₪')]")
    WebElement currencyBtn;
    @FindBy(css = ".currency-switcher .nav__dropdown-menu button")
    List<WebElement> currencyChoice;
    @FindBy(css = ".currency-switcher .nav__dropdown-menu")
    WebElement currencyEl;


    public CrossPage(WebDriver driver) {
        super(driver);
    }

    public void approveCoockie() {
        click(cookiesBnr);
    }

    public DestinationsPage clickDestination() {
        click(destBtn);
        return new DestinationsPage(driver);
    }

    public MagazinePage clickMagazine() {
        click(magazineBtn);
        return new MagazinePage(driver);
    }

    public MainPage goToMainPage() {
        click(mainBtn);
        return new MainPage(driver);
    }

    public AboutPage clickAbout() {
        click(aboutUsBtn);
        return new AboutPage(driver);
    }

    public SingInPage clickSingIn() {
        click(singInBtn);
        return new SingInPage(driver);
    }

    public void changeLng(String lang) {
        hoverMouse(langBtn);
        waitForVisibleOfElement(language);
        for (WebElement el : langChoice) {
            if (el.getText().equalsIgnoreCase(lang)) {
                click(el);
                break;
            }

        }
    }

    public void changeCurrency(String currency) {
        hoverMouse(currencyBtn);
        waitForVisibleOfElement(currencyEl);
        for (WebElement el : currencyChoice) {
            if (el.getText().equalsIgnoreCase(currency)) {
                click(el);
                break;
            }

        }
    }
}
