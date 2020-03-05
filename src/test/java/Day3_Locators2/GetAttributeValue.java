package Day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();

        //I want to get the value of type attribute
        //type="text"--> getAttribute("attribute name")


        WebElement loginButton = driver.findElement(By.id("wooden_spoon"));
//you can either assign a new keyword or print out the w/o assigning
        String login= loginButton.getAttribute("class");

        System.out.println("The value of attribute is "+login);
    }
}
