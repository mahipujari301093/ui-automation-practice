package testng;

import org.testng.annotations.Test;

public class EnabledKeywordTestCase {


    @Test(enabled = true)
    public void login() {
        System.out.println("Login Test Executed");
    }

    @Test(enabled = false)
    public void payment() {
        System.out.println("Payment Test skipping because it's in under development");
    }

    @Test
    public void logout() {
        System.out.println("Logout Test Executed");
    }

}

/*

🔹 What is enabled in TestNG?

enabled is used to enable or disable a test method from execution.

⭐ Easy to remember

enabled = true → Test executes ✅
enabled = false → Test is skipped ⏭️


Why do we use it?

Suppose you have 10 test cases, but one test case is currently not required or has an issue.

Instead of deleting it, you can disable it:


 */