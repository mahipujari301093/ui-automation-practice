package element_validation_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Get_Attribute {

    public static void main(String[] args) throws InterruptedException {


    WebDriver driver = new ChromeDriver();
    driver.get("https://www.facebook.com/signup");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    WebElement name = driver.findElement(By.name("firstname"));
    name.sendKeys("Vishal");


    String enteredText = name.getAttribute("value");
    System.out.println(enteredText);

    Thread.sleep(2000);
    driver.quit();


    }


}

/*

🔥 Interview Questions (Based on Your Code)

Q1. Why did you use getAttribute("value")?
👉 Because textbox data is stored in the value attribute.



“Textbox values are stored in the value attribute, so getText() returns an empty string. To validate

entered data, we use getAttribute("value").”
 */