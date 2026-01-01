package testng;

import org.testng.Assert;
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

If login method passes → dependent method executes
If login method fails → dependent method is SKIPPED

 */