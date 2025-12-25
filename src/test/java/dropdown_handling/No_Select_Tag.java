package dropdown_handling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class No_Select_Tag {


    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://syntaxprojects.com/no-select-tag-dropdown-demo.php?utm_source=chatgpt.com");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//div[@class='btn btn-primary dropdown-toggle']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//ul//li[normalize-space()='Peru']")).click();

        Thread.sleep(2000);
        driver.quit();


/*
 normalize-space() is used to handle extra spaces and line breaks in text nodes, making XPath more reliable and stable.


 */


















    }
















}
