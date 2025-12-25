package dropdown_handling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class With_Select_Tag1 {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.opencart.com/index.php?route=account/register");
        driver.manage().window().maximize();
        System.out.println("Page title is: " + driver.getTitle());

        WebElement country = driver.findElement(By.id("input-country"));
        Select sel = new Select(country);

        sel.selectByVisibleText("Finland");

        driver.quit();
    }
}

/*

How do you handle dropdowns in Selenium?
If the dropdown uses <select> tag, we use Selenium Select class with methods like
selectByVisibleText, selectByValue, selectByIndex.
If it is not a <select> tag, we handle it using click and sendKeys.

 */