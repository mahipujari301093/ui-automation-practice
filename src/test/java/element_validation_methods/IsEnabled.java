package element_validation_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IsEnabled {

    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement searchBox =driver.findElement(By.id("twotabsearchtextbox"));
        boolean isEnabled = searchBox.isEnabled();
        System.out.println(isEnabled);
        driver.quit();

    }

}

/*
 isEnabled() returns true if the web element is enabled (interactive)
 and returns false if the element is disabled

 isEnabled() is commonly used to check whether input fields,
 buttons, checkboxes, or radio buttons are enabled or disabled

 */