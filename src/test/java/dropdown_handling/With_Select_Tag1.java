package dropdown_handling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class With_Select_Tag1 {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://practice.expandtesting.com/dropdown?utm_source=chatgpt.com");
        driver.manage().window().maximize();

        // Handling country dropdown with Select class
        WebElement dropdown = driver.findElement(By.id("country"));
        Select sel = new Select(dropdown);
        sel.selectByVisibleText("Brazil");

        // Handling elements per page dropdown with Select class
        WebElement dob = driver.findElement(By.id("elementsPerPageSelect"));
        Select sel1 = new Select(dob);
        sel1.selectByValue("10");

        // Handling dropdown with index
        WebElement Dropdown1 = driver.findElement(By.id("dropdown"));
        Select sel2 = new Select(Dropdown1);
        sel2.selectByIndex(2);


        Thread.sleep(2000);
        driver.quit();


    }
}

/*

How do you handle dropdowns in Selenium?
If the dropdown uses <select> tag, we use Selenium Select class with methods like
selectByVisibleText, selectByValue, selectByIndex.
If it is not a <select> tag, we handle it using click and sendKeys.

 */