package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SingInPage extends CrossPage {


    @FindBy(css = "#email")
    WebElement emailTextBox;
    @FindBy(css = "#password")
    WebElement passwordTextBox;
    @FindBy(xpath = "//button[contains(text(),'Log in')]")
    WebElement loginBtn;
    @FindBy(css = ".modal-v2__close-button")
    WebElement closeLoginBtn;
    @FindBy(css = "a.btn-as-link.btn-link:nth-child(1)")
    WebElement forgotPassBtn;
    @FindBy(css = ".form-field.error[data-fieldname^=\"email\"]")
    WebElement emailAlert;
    @FindBy(css = ".form-field.error[data-fieldname^=\"email\"]")
    WebElement loginAlert;
    @FindBy(css = ".btn-link.btn-with-icon")
    WebElement BackFromResetBtn;
    @FindBy(css = "forgot-password-success__body text-center")
    WebElement instructionMsg;
    @FindBy(css = "forgot-password-success__body text-center")
    WebElement sendAgainBtn;


    public SingInPage(WebDriver driver) {
        super(driver);
    }
}
