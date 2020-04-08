package com.cybertek.Day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args) {

        //Locator ID
        /*
        Click inspect--> click on arrow on top left to choose your element
        <input type="text" placeholder="" name="username" id="okta-signin-username"
        value="fieruzt@gmail.com" aria-label="" autocomplete="off">
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekschool.okta.com/");

        /*
        write email to the text box
        1. Find the text box first --> findElement
         */

        WebElement emailBox= driver.findElement(By.id("okta-signin-username"));

        emailBox.sendKeys("fieruzt@gmail.com");

        //write your password to the password text box

        driver.findElement(By.id("okta-signin-password")).sendKeys("Selamey88@");
    }

}
