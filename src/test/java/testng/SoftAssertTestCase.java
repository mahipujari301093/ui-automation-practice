package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class SoftAssertTestCase {

 @Test
    public void sampleSoftAssert()

 {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.facebook.com/");

        // Create SoftAssert object
        SoftAssert softAssert = new SoftAssert();


        // 1. Title validation
        String actualTitle = driver.getTitle();
        System.out.println("Actual Title: " + actualTitle);

        softAssert.assertEquals(actualTitle, "Facebook – log in or sign uppp", "Title Mismatch");

        // 2. URL validation
        String actualURL = driver.getCurrentUrl();
        System.out.println("Actual URL: " + actualURL);
        softAssert.assertTrue(actualURL.contains("facebookkkk"), "URL does not contain 'facebook'");

        System.out.println("Soft Assert test case executed till the end and did not stop further execution.");
        //Mandatory step to call assertAll() at the end of Soft Assert
        softAssert.assertAll();
        driver.quit();
 }


}

/*
✅ What will happen with THIS code?

👉 Execution will continue till the end
👉 Test case will FAIL at assertAll()
👉 Both assertion failures will be reported together


1️⃣ Title validation
softAssert.assertEquals(actualTitle,
        "Facebook – log in or sign uppp",
        "Title Mismatch");

❌ This fails
✔ Failure is stored, execution continues

2️⃣ URL validation
softAssert.assertTrue(actualURL.contains("facebookkkk"),
        "URL does not contain 'facebook'");

❌ This also fails
✔ Failure is stored, execution continues

3️⃣ Print statement executes
System.out.println("Soft Assert test case executed till the end and did not stop further execution.");

✅ This line WILL be printed
➡ Proof that execution did NOT stop

**************************************************************************

❓ What if assertAll() is NOT called?

👉 The test case will PASS ✅
👉 Execution will complete fully
👉 All assertion failures will be IGNORED ❌

Why does this happen?
Because SoftAssert works like this:
Collect failures
Wait…
Throw them only when assertAll() is called
No assertAll() → No failure thrown
****************************************************************************

Correct & Clear Explanation

Soft Assert executes the remaining code even if a validation fails.
To mark the test case as FAILED, we must call assertAll() at the end.
If assertAll() is not called, the test case will PASS even though validations failed.

✔ This is exactly how TestNG SoftAssert works.

 */