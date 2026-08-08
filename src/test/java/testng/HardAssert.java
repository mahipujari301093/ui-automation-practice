
package testng;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {



   @Test
    public void verifyTitle() {

        String actualTitle = "Home Page";
        String expectedTitle = "Home Page";

        // assertEquals()
        Assert.assertEquals(actualTitle, expectedTitle);

        // assertTrue()
        boolean isTitleDisplayed = true;
        Assert.assertTrue(isTitleDisplayed);

    }

}

/*

Simple flow

assertEquals() →  Actual = Expected → ✅ Pass
        ↓
assertTrue()   → Condition is true → ✅ Pass
        ↓
Test execution continues

If assertEquals() fails ❌, assertTrue() will not execute because this is a Hard Assertion.




Hard Assertion is used to verify the actual result against the expected result. If the assertion fails, test execution stops immediately.

Easy to remember:
Pass → Continue ✅ | Fail → Stop ❌


*/