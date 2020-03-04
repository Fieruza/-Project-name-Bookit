package Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitleVerify {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to etsy--> data URL: http://www.etsy.com/

        driver.get("http://www.etsy.com/");

        String expectedTitle = "Etsy- Shop for handmade, vintage, custom, and unique gifts for everyone";

        String actualTitle = driver.getTitle();

        if (expectedTitle.equalsIgnoreCase(actualTitle)) {

            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("I expected " + expectedTitle);
            System.out.println(expectedTitle+ " vs " + actualTitle);
        }
       // driver.close();
    }
}
