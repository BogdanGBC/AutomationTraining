package HelpMethods;

import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;

public class WindowMethods {

    private WebDriver driver;

    public WindowMethods(WebDriver driver) {
        this.driver = driver;
    }

    public void moveFocusSpecificTab(int index){
        List<String> windowList = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windowList.get(index));
        System.out.println(driver.getTitle());
    }
    public void closeCurrentTab(){
        driver.close();
    }

}
