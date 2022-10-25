package com.nextbasecrm.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
// Method #1 info:
//• Name: login_crm()
//• Return type: void
//• Arg1: WebDriver
    public static void login_crm(WebDriver driver){
//        3. Enter valid username // hr2@cydeo.com
        WebElement username = driver.findElement(By.name("USER_LOGIN"));
        username.sendKeys("hr2@cydeo.com");

//        4. Enter valid password // UserUser
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("UserUser");

//        5. Click to Log In button
        WebElement loginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        loginBtn.click();
    }

// Method #2 info:
//• Name: login_crm()
//• Return type: void
//• Arg1: WebDriver
//• Arg2: String username
//• Arg3: String password
    public static void login_crm(WebDriver driver, String username, String password){
        driver.findElement(By.name("USER_LOGIN")).sendKeys(username);
        driver.findElement(By.name("USER_PASSWORD")).sendKeys(password);
        driver.findElement(By.xpath("//input[@value='Log In']")).click();
    }
}
