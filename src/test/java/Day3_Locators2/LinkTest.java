package Day3_Locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTest {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");
        driver.manage().window().maximize();

        WebElement example3 = driver.findElement(By.linkText("Example 3: Element on page that " +
                "is hidden and become visible after 5 seconds"));

         String textVersionOfExample3 = example3.getText();

        System.out.println(textVersionOfExample3);

        //linkText vs partialLinkText
        //I want to locate partial of Example3

       // WebElement =

    }
}
