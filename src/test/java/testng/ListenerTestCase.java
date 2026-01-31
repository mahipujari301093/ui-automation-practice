package testng;

import org.testng.annotations.Test;

public class ListenerTestCase {



    @Test(priority = 1)
    public void getDetails() {
        System.out.println("Get details test case");
    }

    @Test(priority = 2)
    public void setDetails() {
        System.out.println("Set details test case");
    }

    @Test(priority = 3)
    public void login() {
        System.out.println("Login test case");
    }

    @Test(priority = 4)
    public void home() {
        System.out.println("Home test case");
    }

    @Test(priority = 5)
    public void logout() {
        System.out.println("Logout test case");
    }

}

/*
✅ Step 1: Create a Test Class (Define Test Cases)

👉 This class contains only @Test methods
👉 No listener logic here

 */