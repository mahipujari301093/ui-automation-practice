package testng;

import org.testng.annotations.*;

public class AnnotationTestCase {

    // 1. Runs once before the entire test suite ( Example: DB connection)
    @BeforeSuite
    public void beforeSuite()
    {
        System.out.println("Before Suite: Setting up test suite...");
    }

    // 2. Runs before any test in <test> tag in testng.xml(Example : Browser configuration)
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("Before Test: Preparing test environment...");
    }

    // 3. Runs once before the first method in the current class(Example: Launch browser)
    @BeforeClass
    public void beforeClass()
    {
        System.out.println("Before Class: Launching browser...");
    }

    // 4. Runs before each @Test method (Example: Login to application)
    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("Before Method: Logging in...");
    }

    // 5. The actual test case 1
    @Test
    public void testCase1()
    {
        System.out.println("Test Case 1: Verify home page");
    }

    // 6. The actual test case 2
    @Test
    public void testCase2()
    {
        System.out.println("Test Case 2: Verify user profile");
    }

    // 7. Runs after each @Test method (Example: Logout from application, screenshots of failure)
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("After Method: Logging out...");
    }

    // 8. Runs once after all methods in the current class(Example: Close browser)
    @AfterClass
    public void afterClass()
    {
        System.out.println("After Class: Closing browser...");
    }

    // 9. Runs after all tests in <test> tag(Example: Clear test data)
    @AfterTest
    public void afterTest()
    {
        System.out.println("After Test: Cleaning up test environment...");
    }

    // 10. Runs once after all tests in the suite(Example: Close DB connection)
    @AfterSuite
    public void afterSuite()
    {
        System.out.println("After Suite: Test suite execution completed.");
    }


}

/*
🔹 Execution Flow Diagram
Before Suite
    ↓
Before Test
    ↓
Before Class
    ↓
Before Method
    ↓
Test Case 1
    ↓
After Method
    ↓
Before Method
    ↓
Test Case 2
    ↓
After Method
    ↓
After Class
    ↓
After Test
    ↓
After Suite












 */