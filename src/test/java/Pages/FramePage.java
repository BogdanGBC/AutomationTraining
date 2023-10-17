package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class FramePage extends BasePage{
    public FramePage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = ".analystic")
    private List<WebElement> frameOptions;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputSingleElement;
    @FindBy(xpath = "//input[@type='text']")
    private WebElement inputMultipleElement;

    public void interectSingleFrame(String value){
        elementMethods.clickElement(frameOptions.get(0));
        frameMathods.switchToFrame("singleframe");
        elementMethods.fillElement(inputSingleElement, value);
        frameMathods.switchToDefaultFrame();
    }

    public void interectMultiFrame(String value) {
        elementMethods.clickElement(frameOptions.get(1));
        frameMathods.switchToFrame(driver.findElement(By.xpath("//iframe[@src='MultipleFrames.html']")));
        frameMathods.switchToFrame(driver.findElement(By.xpath("//iframe[@src='SingleFrame.html']")));
        elementMethods.fillElement(inputMultipleElement, value);
        inputMultipleElement.sendKeys(value);
    }
}
