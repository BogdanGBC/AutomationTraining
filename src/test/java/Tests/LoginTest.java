package Tests;

import ObjectData.LoginObject;
import Pages.IndexPage;
import Pages.LoginPage;
import PropertyUtility.PropertyUtility;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class LoginTest extends SharedData {

    @Test
    public void metodaTest() {
        PropertyUtility propertyUtility = new PropertyUtility("LoginTest");
        LoginObject loginObject = new LoginObject(propertyUtility.getAllData());


        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSignIn();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginInvalid(loginObject);


    }

}
