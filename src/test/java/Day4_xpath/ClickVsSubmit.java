package Day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickVsSubmit {
    public static void main(String[] args) {

         /*
        Click()
        Submit()
        Task:
        1. Go to forgot password page on prictice.cybertkschool.com
           http://practice.cybertekschool.com/forgot_password
        2. Enter any email address
        3. Click "retrieve password" button
        4. Verify the url is: http://practice.cybertekschool.com/email_sent
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        //go to forgot password web page
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();

        // enter any email
        //locate the email box first
        WebElement emailbox = driver.findElement(By.name("email"));
        //enter email --< sendKeys()
        emailbox.sendKeys("abc@gamil.com");

        // click "retrieve password" bttb
        //locate the bttn first
        WebElement submitBttn = driver.findElement(By.id("form_submit"));
        //submit email by clicking the "retrive password"
        submitBttn.submit();

        //    Verify  --> Expected result  vs Actual result

        String expectedURL = "http://practice.cybertekschool.com/email_sent";
        String actualURL = driver.getCurrentUrl();

        if(expectedURL.equals(actualURL)){
            System.out.println("test is pass");
        }else {
            System.out.println("test is failed");
        }


        driver.close();


    }
}
