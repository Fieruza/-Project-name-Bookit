package Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://practice.cybertekschool.com/");
        driver.manage().window().maximize();

        //for verify title we use --> getTitle()
        //for verify URL-->

        String expectedURL = "https://practice.cybertekschool.com/";

        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("PASS");
        }else{
            System.out.println("fail");
            System.out.println("I expected "+expectedURL);
            System.out.println("The actual URL is: "+actualURL);
        }
        driver.close();
    }
}
