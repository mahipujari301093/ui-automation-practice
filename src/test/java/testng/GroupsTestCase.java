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

Example:
Developer wants only smoke tests
QA wants regression tests
Release team wants sanity tests
Groups make this possible.

🔹 Why do we use Groups MOSTLY in TestNG?
Because in real projects, we do NOT run all tests every time.

🚨 Real Project Reality

Thousands of test cases
Limited execution time
Different test goals at different stages
Groups help us control what to run and when to run.


🔹 Interview-Perfect Answer ⭐

You can confidently say:

Yes, my understanding is correct.
In real projects with 1000+ test cases, groups help us categorize tests like smoke, sanity, and regression.
When developers request only smoke tests, we can execute only that group without running all tests, which avoids complexity and saves execution time.
That’s why groups are mostly used in real-time automation frameworks.


▶️ Execution with include in TestNG.XML structure
<groups>
    <run>
        <include name="smoke"/>
        <include name="regression"/>
    </run>
</groups>
************************************************
🔹 Exclude a Group
<groups>
    <run>
        <exclude name="smoke"/>
    </run>
</groups>

***********************************************

🔹Execute Groups Across Multiple Classes
<classes>
    <class name="tests.LoginTest"/>
    <class name="tests.CartTest"/>
    <class name="tests.PaymentTest"/>
</classes>

**********************************************************

🔹 What are include and exclude in TestNG?
Include → run only selected tests/groups
Exclude → skip selected tests/groups

🔹 Include / Exclude at Method Level
<methods>
    <include name="loginTest"/>
    <exclude name="logoutTest"/>
</methods>

 */