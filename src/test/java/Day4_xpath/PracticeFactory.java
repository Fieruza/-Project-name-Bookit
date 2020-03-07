package Day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class PracticeFactory {
    public static void main(String[] args) {
        //go to google

        WebDriver driver = WebDriverFactory.getDriver("Chrome"); //it was called in from
        //the utilities package
        driver.get("https://google.com");




    }
}
