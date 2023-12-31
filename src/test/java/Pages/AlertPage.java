package Pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertPage extends BasePage {

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (className = "analystic")
    private List<WebElement> alertOptions;
    @FindBy (css = ".btn-danger")
    private WebElement buttonAlert;
    @FindBy(css = ".btn-primary")
    private WebElement buttonAlert2;
    @FindBy(css = ".btn-info")
    private WebElement buttonAlert3;

    public void interectOkAlert (){
        elementMethods.clickElement(alertOptions.get(0));
        elementMethods.clickElement(buttonAlert);
        alertMethods.alertOk();
    }
    public void interectOkCancelAlert (){
        elementMethods.clickElement(alertOptions.get(1));
        elementMethods.clickElement(buttonAlert2);
        alertMethods.alertCancel();
    }
    public void interectTextAlert(String value){
        elementMethods.clickElement(alertOptions.get(2));
        elementMethods.clickElement(buttonAlert3);
        alertMethods.alertText(value);
    }
}
