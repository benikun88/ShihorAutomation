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
    @FindBy(css = ".form-error[data-fieldname^=\"non_field_errors\"]")
    WebElement loginAlert;
    @FindBy(css = ".btn-link.btn-with-icon")
    WebElement BackFromResetBtn;
    @FindBy(css = ".btn-link.btn-with-icon")
    WebElement sendBtn;
    @FindBy(css = ".text-center:nth-child(2)")
    WebElement instructionMsg;
    @FindBy(css = "button.btn-as-link")
    WebElement sendAgainBtn;
    @FindBy(css = "#name")
    WebElement firstNameTextBox;
    @FindBy(css = "#surname")
    WebElement lastNameTextBox;
    @FindBy(css = "label[for$=\"sign-up-form__accept-terms\"]")
    WebElement termsCheckBox;
    @FindBy(xpath = "//button[contains(text(),'Create profile')]")
    WebElement createProfileBtn;
    @FindBy(xpath = "//span[contains(text(),'Sign up')]")
    WebElement singUpBtn;
    @FindBy(css = "a.btn-as-link.btn-link > span:nth-child(1)")
    WebElement backTologin;

    public SingInPage(WebDriver driver) {
        super(driver);
    }

    public void setEmail(String email) {
        fillText(emailTextBox, email);
    }

    public void setPassword(String password) {
        fillText(passwordTextBox, password);
    }

    public void setName(String name) {
        fillText(passwordTextBox, name);
    }

    public void setLastName(String lastName) {
        fillText(passwordTextBox, lastName);
    }

    public void CreateProfile(String firstName, String lastName, String email, String password) {
        setName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        click(termsCheckBox);
        click(createProfileBtn);
    }
    public void CreateProfileWithoutTerms(String firstName, String lastName, String email, String password) {
        setName(firstName);
        setLastName(lastName);
        setEmail(email);
        setPassword(password);
        click(createProfileBtn);
    }


    public void login(String email, String password) {
        setEmail(email);
        setPassword(password);
        click(loginBtn);
    }

    public void clickForgotPassword() {
        click(forgotPassBtn);
    }

    public void resetPassword(String email) {
        fillText(emailTextBox, email);
        click(sendBtn);
    }

    public String getInstructionsMsg() {
        return getT(instructionMsg);
    }

    public String getEmailALert() {
        return getT(emailAlert);
    }

    public String getloginError() {
        return getT(loginAlert);
    }
    public void returnToLogin(){
        click(backTologin);
    }


}
