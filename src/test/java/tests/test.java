package tests;

import org.testng.annotations.Test;
import pageObject.CrossPage;

public class test extends BaseTest{
    @Test(description = "just testing")
    public void test1(){
        CrossPage crossPage=new CrossPage(driver);
        crossPage.approveCoockie();
        var destinationPage=crossPage.clickDestination();
        destinationPage.search("london");

    }

}
