package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class HardAssertionFirstTestCase {

@Test()
    public void verifyAmazonSearchTitle()
{

    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.get("https://www.amazon.in/");

    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
    driver.findElement(By.id("nav-search-submit-button")).click();
    String actualTitle = driver.getTitle();
    System.out.println("Actual Title: " + actualTitle);

    // Hard Assertion(validation of actual title with expected title)
    // Actual and expected results are matching here so test case will be passed
    Assert.assertEquals("Amazon.in : Mobile" , actualTitle);
    System.out.println("Title Verified Successfully");

    // Actual and expected results are not matching here so test case will be failed and next code will not be executed
   // Assert.assertEquals("Amazon.in : Laptop" , actualTitle);
   // System.out.println("Title Verified Successfully");

    System.out.println("End of Test Case: Assertion passed - further code executed");
    driver.quit();

}

}

/*
✅ Corrected & Polished Explanation (Interview-Ready)

Assert.assertEquals() method is used to validate the expected result with the actual result.
If the validation matches, the test execution continues.
If the validation fails, the hard assertion stops the execution immediately and the remaining code will
not be executed.

 */