package element_validation_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class IsSelected {

    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/signup");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement radioButton = driver.findElement(By.id("sex"));
        boolean beforeSelect = radioButton.isSelected();
        System.out.println("Before selecting radio button: " + beforeSelect);

        Thread.sleep(2000);

        radioButton.click();

        Thread.sleep(2000);

        boolean afterSelected =radioButton.isSelected();
        System.out.println("After selecting radio button: " + afterSelected);
        driver.quit();

    }

}

/*

Interview Explanation (Perfect Answer)

"isSelected() is used to verify whether a checkbox or radio button is selected or not."
and returns false if it is not selected.

WebElement radio = driver.findElement(By.xpath("//input[@type='radio']"));

if (radio.isSelected()) {
    System.out.println("Radio button is selected");
} else {
    System.out.println("Radio button is not selected");
}

 */