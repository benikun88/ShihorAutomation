package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends CrossPage{

    @FindBy(css = ".col.profile-details__header-title")
    List<WebElement> titles;
    @FindBy(css = ".profile-details__btn.btn")
    List<WebElement> editlist;
//.css-11unzgr .rs-select__option for open list in My preferences
    public ProfilePage(WebDriver driver) {
        super(driver);
    }
    public void editItem(String name) {
        int index = 0;
        for (WebElement el : titles) {
            if (el.getText().equalsIgnoreCase(name)) {
                break;
            }
            index++;
        }
        click(editlist.get(index));
        sleep(2000);
    }

}
