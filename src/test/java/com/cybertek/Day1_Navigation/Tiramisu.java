package com.cybertek.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tiramisu {
    public static void main(String[] args) throws InterruptedException {

/*
1. Go to google webstite
2. save the title in a string variable
3. go to Etsy
4. save the Etsy Title in a String
5. Navigate back to previous page
6. Verify the title is same as step 2
7. Navigate forward to previous page
8.Verify the title is same as step 4
 */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com/");

        String expectedTitle = "Google";
        Thread.sleep(3000);

        driver.navigate().to("https://wwww.etsy.com/");

        String etsyExpectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        Thread.sleep(3000);
        driver.navigate().back(); // will end up in google

        String actualGoogleTitle = driver.getTitle();

        if (expectedTitle.equals(actualGoogleTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("fail");
            System.out.println("I expected " + expectedTitle);
            System.out.println("The actual URL is: " + actualGoogleTitle);

            Thread.sleep(3000);
        }
        driver.navigate().forward(); //etsy

        String etsyActualTitle = driver.getTitle();

        if (etsyExpectedTitle.equals(etsyActualTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("fail");
            System.out.println("I expected " + etsyExpectedTitle);
            System.out.println("The actual URL is: " + etsyActualTitle);

           // driver.navigate().refresh();
        }
    }
}