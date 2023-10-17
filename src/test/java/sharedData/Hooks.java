package sharedData;

import PropertyUtility.PropertyUtility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Hooks extends SharedData{
    public PropertyUtility propertyUtility;

    @BeforeMethod
    public void prepareEnvironment(){
        initiateDriver();
        propertyUtility = new PropertyUtility("Tests.AlertTest");
    }

    @AfterMethod
    public void clearEnvironment(){

    }
}
