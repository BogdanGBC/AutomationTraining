package Pages;

import HelpMethods.AlertMethods;
import HelpMethods.ElementMethods;
import HelpMethods.FrameMethods;
import HelpMethods.WindowMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    public WebDriver driver;
    public ElementMethods elementMethods;
    public AlertMethods alertMethods;
    public WindowMethods windowMethods;
    public FrameMethods frameMathods;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
        elementMethods = new ElementMethods(driver);
        alertMethods = new AlertMethods(driver);
        windowMethods = new WindowMethods(driver);
        frameMathods = new FrameMethods(driver);
    }
}
