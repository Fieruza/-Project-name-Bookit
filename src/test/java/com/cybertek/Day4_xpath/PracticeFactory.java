package com.cybertek.Day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PracticeFactory {
    public static void main(String[] args) {
        //go to google

        WebDriver driver = WebDriverFactory.getDriver("Chrome"); //it was called in from
        //the utilities package
       // driver.get("https://google.com");


        driver.get("https://amazon.com");

 WebElement s= driver.findElement(By.xpath("(//span[@class='a-size-small " +
         "a-color-base aok-align-center aok-inline-block'])[6]"));
         System.out.println( s.getText());

    }
}
