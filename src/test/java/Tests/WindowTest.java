package Tests;

import Pages.IndexPage;
import Pages.RegisterPage;
import Pages.WindowPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class WindowTest extends SharedData {

    @Test
    public void metodaTest() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.navigateToWindow();

        WindowPage windowPage = new WindowPage(driver);
        windowPage.interectSingleTab();
        windowPage.interectSingleWindow();
        windowPage.interectMultipleTab();

    }
}
