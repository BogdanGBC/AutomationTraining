package Pages;

import ObjectData.LoginObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "input[placeholder='E mail']")
    private WebElement emailElement;
    @FindBy(css = "input[placeholder='Password']")
    private WebElement passwordElement;
    @FindBy(id = "enterbtn")
    private WebElement enterElement;
    @FindBy(id = "errormsg")
    private WebElement errorElement;


    public void loginInvalid(LoginObject loginObject){
        elementMethods.fillElement(emailElement, loginObject.getEmail());
        elementMethods.fillElement(passwordElement, loginObject.getPassword());
        elementMethods.clickElement(enterElement);
        elementMethods.validateTextElement(errorElement, loginObject.getErrorMessage());
    }
}
