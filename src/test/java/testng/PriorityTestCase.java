package testng;

import org.testng.annotations.Test;

public class PriorityTestCase {


    @Test(priority = -1)
    public void openBrowser()
    {
        System.out.println("Open Browser");
    }

    @Test(priority = 0)
    public void login() {
        System.out.println("Login");
    }

    @Test(priority = 1)
    public void search() {
        System.out.println("Search");
    }

    @Test(priority = 2)
    public void addToCart() {
        System.out.println("Add To Cart");
    }

    @Test(priority = 3)
    public void logout() {
        System.out.println("Logout");
    }

}

/*
🧠 Real-Time Selenium Mapping (Easy to Remember)

| Priority | Method       |
| -------- | ------------ |
| -1       | Open Browser |
| 0        | Login        |
| 1        | Search       |
| 2        | Add to Cart  |
| 3        | Logout       |


🔑 Key Points to Remember

✔ Lower priority value runs first
✔ Negative priority executes before 0
✔ Default priority value is 0
✔ If two methods have same priority → alphabetical order

What is priority in TestNG?
priority is used to control the execution order of @Test methods
Lower number → executes first
Higher number → executes later


 */

