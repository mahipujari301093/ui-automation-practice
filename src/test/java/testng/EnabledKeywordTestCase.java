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

enabled = true → Test case will execute (default)

enabled = false → Test case will be skipped

👉 It is mainly used when:

Test case is under development

Test case has a known bug

You temporarily want to skip a test

🔹 Interview Question ⭐

Q: Does priority work if enabled = false?
A: ❌ No. TestNG skips the test completely.

@Test(priority = 2, enabled = false)
public void addToCart()
{
    System.out.println("Add To Cart");
}

 */