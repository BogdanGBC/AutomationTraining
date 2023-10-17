package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WindowPage extends BasePage {
    public WindowPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".analystic")
    private List<WebElement> tabOptions;
    @FindBy(css = "#Tabbed button")
    private WebElement tabOptionElement;
    @FindBy(css = "#Seperate>button")
    private WebElement windowOptionElement;
    @FindBy(css = "#Multiple>button")
    private WebElement tabsOptionElement;

    public void interectSingleTab (){
        tabOptions.get(0).click();
        System.out.println(driver.getTitle());
        tabOptionElement.click();
        System.out.println(driver.getTitle());
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);

    }
    public void interectSingleWindow(){
        tabOptions.get(1).click();
        windowOptionElement.click();
        System.out.println(driver.getTitle());
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);
    }
    public void interectMultipleTab(){
        tabOptions.get(2).click();
        tabsOptionElement.click();
        System.out.println(driver.getTitle());
        windowMethods.moveFocusSpecificTab(2);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(1);
        windowMethods.closeCurrentTab();
        windowMethods.moveFocusSpecificTab(0);
    }
}
