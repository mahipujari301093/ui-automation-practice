package testng;

import org.testng.annotations.Test;

public class GroupsTestCase {


    @Test(groups = "smoke")
    public void loginTest()
    {
        System.out.println("Login Test - Smoke");
    }

    @Test(groups = "smoke")
    public void logoutTest()
    {
        System.out.println("Logout Test - Smoke");
    }

    @Test(groups = "regression")
    public void addToCartTest()
    {
        System.out.println("Add To Cart - Regression");
    }

    @Test(groups = "regression")
    public void paymentTest()
    {
        System.out.println("Payment - Regression");
    }

    @Test(groups = {"smoke", "regression"})
    public void searchTest()
    {
        System.out.println("Search Test");
    }

}

/*
🔹 Main Reasons We Use Groups (Very Important ⭐)

1️⃣ Run only REQUIRED tests

Simple real-time understanding

Suppose we have 1000+ test cases. We don't want to execute all of them every time.

We categorize them into groups:

1000+ Test Cases
       ↓
 ┌─────┼──────────┐
Smoke  Sanity   Regression





==================================================================


▶️ Execution with include in TestNG.XML structure

<groups>
    <run>
        <include name="smoke"/>
    </run>
</groups>


<groups>
    <run>
        <exclude name="regression"/>
    </run>

👉 This will execute only the Smoke test cases, instead of all 1000+ tests.


include → Run only smoke group
exclude → Skip regression group



 */