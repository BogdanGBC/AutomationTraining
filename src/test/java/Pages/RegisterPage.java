package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage{

    public RegisterPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (xpath = "//a[text()='SwitchTo']")
    private WebElement switchToElement;
    @FindBy (xpath = "//a[text()='Alerts']")
    private WebElement alertElement;
    @FindBy(xpath = "//a[text()='Frames']")
    private WebElement frameElement;
    @FindBy(xpath = "//a[text()='Windows']")
    private WebElement windowElement;

    public void navigateToAlert (){
        elementMethods.moveToElement(switchToElement);
        alertElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
    }
    public void navigateToFrame (){
        elementMethods.moveToElement(switchToElement);
        frameElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Frames.html");
    }
    public void navigateToWindow (){
        elementMethods.moveToElement(switchToElement);
        windowElement.click();
        driver.navigate().to("https://demo.automationtesting.in/Windows.html");
    }

    public void registerProces(){
       // elementMethods.selectByText();
    }

}
