package com.nextbasecrm.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class BrowserUtils {
    //Methods are static. Because we do not want to create an object to call those methods.
    // We just want to call those methods with class name. That is why they are static type

    /**
     * This method is used to pause the code for given seconds
     * It is static method we can call with class name
     * BrowserUtils.sleep(3);
     * @param //seconds
     */
    public static void sleep(int second){
        try{
            Thread.sleep(second * 1000);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    //Method info:
    //• Name: verifyTitle()
    //• Return type: void
    //• Arg1: WebDriver
    //• Arg2: String expectedTitle
    public static void verifyTitle(WebDriver driver, String expectedTitle){
        Assert.assertEquals(driver.getTitle(), expectedTitle);
    }

}
