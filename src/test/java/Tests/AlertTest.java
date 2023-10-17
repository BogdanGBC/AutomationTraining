package Tests;

import Pages.AlertPage;
import Pages.IndexPage;
import Pages.RegisterPage;
import org.testng.annotations.Test;
import sharedData.Hooks;
import sharedData.SharedData;

public class AlertTest extends Hooks {

    @Test
    public void metodaTest() {

        IndexPage indexPage = new IndexPage(getDriver());
        indexPage.clickSkipSignIn();

        RegisterPage registerPage = new RegisterPage(getDriver());
        registerPage.navigateToAlert();

        AlertPage alertPage = new AlertPage(getDriver());
        alertPage.interectOkAlert();
        alertPage.interectOkCancelAlert();
        alertPage.interectTextAlert("Bogdan");

    }

}
