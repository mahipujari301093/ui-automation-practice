package dropdown_handling;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class With_Select_Tag2 {

    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();
        driver.get("https://demo.guru99.com/test/newtours/register.php");

         WebElement country = driver.findElement(By.xpath("//select[@name='country']"));
         Select sel = new Select(country);
         sel.selectByVisibleText("BHUTAN");

        // Get all options
        List<WebElement> allCountries = sel.getOptions();


        for (WebElement allCountry : allCountries) {

            System.out.println(allCountry.getText());


        }


    }


}
