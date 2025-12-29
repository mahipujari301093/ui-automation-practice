package element_validation_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IsDisplayed {


    public static void main(String[] args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.amazon.in/");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    WebElement cart = driver.findElement(By.id("nav-cart"));
    boolean display  = cart.isDisplayed();
    System.out.println(display);
    Thread.sleep(2000);
    driver.quit();


    }
}




/*

 IsDisplayed() returns true if the web element is visible on the web page
 and returns false if the element is present in DOM but not visible
 IsDisplayed() checks whether a web element is visible on the page


 */