package com.cybertek.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://google.com");

        driver.navigate().to("https://www.google.com");

/*
navigate().back()-->
1. go to google 2. go to cybertek practice website
 */
        driver.get("https://www.google.com");
        driver.navigate().to("https://practice.cybertekschool.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().back();

        //navigate().forward()
        //go to practice website-->go to google--> back to practice website--> forward to google

        //driver.navigate().to("https://practice.cybertekschool.com/");
        //driver.navigate().to("https://www.google.com");
        //driver.navigate().back();
       // driver.navigate().forward();



    }
}
