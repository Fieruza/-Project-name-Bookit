package com.cybertek.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
    public static void main(String[] args) {


    /*
    1. go to VyTrack login page
    2. write username   data: storemanager52
    3. write password  UserUser122
    4. click login button
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://app.vytrack.com/user/login");

        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");


        WebElement loginButton = driver.findElement(By.id("_submit"));
        loginButton.click();

        /*
        Verify that you are in the home page
         */

        String expectedURL = "https://app.vytrack.com/";
        String actualURL = driver.getCurrentUrl();
        if (expectedURL.equals(actualURL)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("Actual :" + actualURL);
        }
        String expectedResult  = "Dashboard";
        String actualResult = driver.getTitle();
        if (expectedResult.equals(actualResult)){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("Expected "+expectedResult);
            System.out.println("Actual "+actualResult);

        }
}}