package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import sharedData.SharedData;

import java.util.List;

public class RegisterTest extends SharedData {

    @Test
    public void metodaTest() {

        WebElement skipSignInElement = driver.findElement(By.id("btn2"));
        skipSignInElement.click();

        WebElement firstNameElement = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
        String firstNameValue = "Bogdan";
        firstNameElement.sendKeys(firstNameValue);

        WebElement lastNameElement = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
        String lastNameValue = "Groza";
        lastNameElement.sendKeys(lastNameValue);

        WebElement addressElement = driver.findElement(By.cssSelector("textarea[ng-model='Adress']"));
        String addressValue = "Soporului, nr. 17";
        addressElement.sendKeys(addressValue);

        WebElement emailElement = driver.findElement(By.cssSelector("input[type='email']"));
        String emailValue = "test@email.com";
        emailElement.sendKeys(emailValue);

        WebElement phoneElement = driver.findElement(By.cssSelector("input[type='tel']"));
        String phoneValue = "0712345678";
        phoneElement.sendKeys(phoneValue);

        WebElement genderElement = driver.findElement(By.cssSelector("input[value='Male']"));
        genderElement.click();

        List<WebElement> hobbiesOptions = driver.findElements(By.cssSelector("input[type='checkbox']"));
        for (int index = 0; index< hobbiesOptions.size(); index++ ){
            if (hobbiesOptions.get(index).getAttribute("value").equals("Cricket")
            || hobbiesOptions.get(index).getAttribute("value").equals("Movies")){
                hobbiesOptions.get(index).click();
            }

        }

        WebElement languageElement = driver.findElement(By.id("msdd"));
        languageElement.click();
        List<WebElement> lanquageOptions = driver.findElements(By.cssSelector(".ui-corner-all"));
        for (int index = 0; index < lanquageOptions.size(); index++){
            if(lanquageOptions.get(index).getText().equals("English")){
                lanquageOptions.get(index).click();
            }
        }
        genderElement.click();

        WebElement skillsElement = driver.findElement(By.id("Skills"));
        Select skillsDropdown = new Select(skillsElement);
        skillsDropdown.selectByVisibleText("Android");

        WebElement contryElement = driver.findElement(By.className("select2-selection__arrow"));
        contryElement.click();

        WebElement country2Element = driver.findElement(By.className("select2-search__field"));
        country2Element.sendKeys("India");
        country2Element.sendKeys(Keys.ENTER);

        WebElement yearElement = driver.findElement(By.id("yearbox"));
        Select yearDropdown = new Select(yearElement);
        yearDropdown.selectByValue("1990");

        WebElement monthElement = driver.findElement(By.id("select[placeholder='Month']"));
        Select monthDropdown = new Select(monthElement);
        monthDropdown.selectByVisibleText("April");

        WebElement dayElement = driver.findElement(By.id("daybox"));
        Select dayDropdown = new Select(dayElement);
        dayDropdown.selectByValue("16");

        WebElement firstPasswordElement = driver.findElement(By.id("firstpassword"));
        firstPasswordElement.sendKeys("admin");

        WebElement secondPasswordElement = driver.findElement(By.id("secondpassword"));
        secondPasswordElement.sendKeys("admin");

        WebElement submintElement = driver.findElement(By.id("submitbtn"));
        submintElement.click();

//        driver.quit();
    }
}
