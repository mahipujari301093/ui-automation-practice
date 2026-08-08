package browserlaunch;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Launch_Browser_Login {

    public static void main(String[]args) throws InterruptedException {

    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.saucedemo.com/");

    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    driver.manage().window().maximize();

    String title = driver.getTitle();
    System.out.println("Title: " + title);

    String url = driver.getCurrentUrl();
    System.out.println("URL: " + url);

    driver.findElement(By.id("user-name")).sendKeys("standard_user");
    driver.findElement(By.id("password")).sendKeys("secret_sauce");
    driver.findElement(By.id("login-button")).click();


    Thread.sleep(3000);
    driver.quit();


    }

}


/*

WebDriver driver = new ChromeDriver(); upcasting? // child class object and parent reference variable

1. Class Relationship

In Selenium:

        WebDriver (Interface)
              ↑
              |
        ChromeDriver (Class)

ChromeDriver implements the WebDriver interface.

Internally, it looks like:

public class ChromeDriver implements WebDriver
{
    // WebDriver methods implementation

    driver.get("https://www.saucedemo.com/");
    driver.getTitle();
    driver.getCurrentUrl();
}



*/