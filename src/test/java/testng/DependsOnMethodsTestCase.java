package testng;

import org.testng.annotations.Test;

public class DependsOnMethodsTestCase {


    @Test
    public void login()
    {
        System.out.println("Login Successful");
        //Assert.fail(); // force failure
    }

    @Test(dependsOnMethods = "login")
    public void searchProduct()
    {
        System.out.println("Search Product");
    }

    @Test(dependsOnMethods = "searchProduct")
    public void addToCart()
    {
        System.out.println("Add To Cart");
    }

    @Test(dependsOnMethods = "addToCart")
    public void logout()
    {
        System.out.println("Logout");
    }

}


/*

Correct Statement (Interview Ready ⭐)

dependsOnMethods is used in TestNG when one test method depends on another test method to execute first.

login()          ❌ Failed
   ↓
searchProduct()  ⏭ Skipped
   ↓
addToCart()      ⏭ Skipped
   ↓
logout()         ⏭ Skipped

Why do we use dependsOnMethods?

We use dependsOnMethods when one test cannot be performed unless another test is completed successfully.


In my example, each test depends on the previous test. If login() fails, the remaining dependent tests will be skipped; only when login() passes will searchProduct() execute, followed by addToCart() and logout().




 */