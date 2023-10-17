package Tests;

import Pages.FramePage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;
import sharedData.SharedData;

public class FrameTest extends SharedData {

    @Test
    public void metodaTest() {

        IndexPage indexPage = new IndexPage(driver);
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(driver);
        registerPage.navigateToFrame();

        FramePage framePage = new FramePage(driver);
        framePage.interectSingleFrame("test");
        framePage.interectMultiFrame("test");

    }
}
