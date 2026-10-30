public class Interview_Questions {



/*

Selenium – Real-Time Scenario-Based Questions

1.How do you handle dynamic web elements? 
I use dynamic XPath or CSS selectors to identify elements whose attributes change frequently.

2.How do you handle elements that load slowly?
I use Explicit Wait (WebDriverWait) to wait until the required element is available.


3.How do you automate a web table?
I use findElements() with XPath to identify and iterate through table rows and columns.


4.How do you execute test cases in parallel?
I configure parallel execution using TestNG's parallel attribute in testng.xml.


5.How do you decide which test cases to automate?
I prioritize repetitive, stable, high-value test cases that need frequent regression testing.

6.How do you maintain automation scripts when UI changes?
I update the affected locators and page methods in the Page Object Model (POM).

7.How do you execute smoke and regression suites?
I use TestNG groups to organize test cases and execute smoke or regression suites separately.


8.What is the difference between get() and navigate().to()?
Both methods are used to open a webpage. get() directly opens a URL, while navigate().to() opens a URL using browser navigation.
driver.get("https://google.com");
driver.navigate().to("https://google.com");


9.How do you handle dynamic XPath?
I use XPath functions like contains(), starts-with(), and ends-with() to identify elements whose attributes change dynamically.

10.What is testng.xml?
testng.xml is the configuration file for TestNG that defines the test suite, test classes, and various test execution parameters.


11.What is DataProvider?
@DataProvider is a TestNG annotation used to execute the same test method with multiple sets of test data.


12.What is the difference between CSS Selector and XPath?
xpath is more flexible and can navigate both up and down the DOM tree.
while CSS Selector is faster and more readable but can only navigate down the DOM tree.


13. What is XPath? What is the diffeerence beetween abosolute and relative XPath?

Absolute XPath → Complete path from the root. E.g /html/body/div[1]/form/input -> Starts from the root in the DOM tree. 
Relative XPath → Directly locates the element using its properties.  E.g //input[@id='username'] -> Starts from anywhere in the DOM tree.

Absolute Xpath is not used because it is a long path and if any element is added or removed in the DOM tree, it will break the locator.
Relative Xpath is used because it is a short path and if any element is added or removed in the DOM tree, it will not break the locator.


14.What are Locators in Selenium?
Locators are used to identify and locate web elements on a web page, such as text boxes, buttons, links, and dropdowns.
Selenium provides 8 locators to identify web elements on a web page.
Locator	Example
1. ID	                    By.id("username")
2. Name	                    By.name("email")
3. Class Name	            By.className("login")
4. Tag Name	                By.tagName("input")
5. Link Text	            By.linkText("Login")
6. Partial Link Text        By.partialLinkText("Log")
7. CSS Selector	            By.cssSelector("#username")
8. XPath	                By.xpath("//input[@id='username']")























*/



}
