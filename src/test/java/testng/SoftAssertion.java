package testng;
import org.testng.asserts.SoftAssert;

import org.testng.annotations.Test;

public class SoftAssertion  {




@Test
    public void verifyDetails() {

        SoftAssert softAssert = new SoftAssert();

        String actualTitle = "Home Page";
        String expectedTitle = "Login Page";

        // Assertion 1 - Fails
        softAssert.assertEquals(actualTitle, expectedTitle);

        // Assertion 2 - Passes
        boolean isTitleDisplayed = true;
        softAssert.assertTrue(isTitleDisplayed);


        // Report all assertion failures
        softAssert.assertAll();




    }


}

/*

Soft Assertion is used to verify the actual and expected result. If an assertion fails, the test execution continues, and all assertion failures are reported at the end using assertAll().



SoftAssert softAssert = new SoftAssert();   -> Creates a Soft Assertion object.

softAssert.assertEquals(actualTitle, expectedTitle); -> Compares actual and expected values. It fails but execution continues.

softAssert.assertTrue(isTitleDisplayed); -> Checks if the condition is true. It passes and execution continues.

softAssert.assertAll(); -> Collects and reports all failed assertions.


*/