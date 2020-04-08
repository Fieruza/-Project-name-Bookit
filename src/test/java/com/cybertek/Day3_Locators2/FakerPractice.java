package com.cybertek.Day3_Locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakerPractice {
    public static void main(String[] args) {

        //create Faker object

        Faker fakeData = new Faker() ;

        //I need firstname

        String name = fakeData.name().firstName();
        System.out.println(name);

        /*
    1. go to login page http://practice.cybertekschool.com/login
    2. enter invalid username
    3. enter invalid password
    4. Verify the error massage "Your username is invalid!"
     */

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();

        Faker faker = new Faker();
        String username = faker.name().fullName();
        String password = faker.app().author();

        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);

        driver.findElement(By.id("wooden_spoon")).click();


    }
}
