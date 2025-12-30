package TakeScreenshot;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.io.IOException;

public class TakeScreenshot_Example {

    public static void main(String[] args) throws IOException, InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com");

        // Step 1: Type casting driver to TakesScreenshot
        TakesScreenshot ts = (TakesScreenshot) driver;

        // Step 2: Use getScreenshotAs() method to capture screenshot ,Take screenshot and store in temp file
         File source  = ts.getScreenshotAs(OutputType.FILE);

        // Step 3: Specify the destination where we want to save the screenshot
        String path = System.getProperty("user.dir") + "\\Screenshots\\google.png";

        // Copies screenshot from temp memory to project folder
        File file = new File(path);

        // Step 4: Copy the screenshot from source to destination
        FileHandler.copy(source, file);

        Thread.sleep(3000);
        driver.quit();

    }

}

/*
STEP 1: Type Casting to TakesScreenshot
TakesScreenshot ts = (TakesScreenshot) driver;
🔹 Why this is required?

WebDriver does not directly support screenshots
ChromeDriver implements TakesScreenshot
Type casting allows access to screenshot methods

🧠 Interview Note:
We use type casting because WebDriver interface does not contain getScreenshotAs() method.


STEP 2: Capture Screenshot
File source  = ts.getScreenshotAs(OutputType.FILE);
Takes screenshot of current browser screen
Stores it in temporary memory
Returns a File object

Why OutputType.FILE?
Screenshot is stored as an image file

STEP 3: Destination Path
String path = System.getProperty("user.dir") + "\\Screenshots\\google.png";

What this line does:
System.getProperty("user.dir") → gives project root path (user.dir is used to make the path dynamic so it works on all machines.)
\\Screenshots\\google.png → folder + file name

📂 Create File Object
File file = new File(path);
🔹 How this works:
source → temp screenshot file
file → destination location
Copies screenshot from temp memory to project folder

❓ What is the use of FileHandler.copy() in Selenium?

👉 It copies the screenshot file from temporary memory to the desired destination folder.

 */