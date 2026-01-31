package testng;

import org.testng.annotations.Test;

public class InvocationCountTestCase {


    @Test(invocationCount = 4)
    public void printMessage()

    {
        System.out.println("Test executed");
    }



}

/*

👉 In short:
invocationCount is used to run the same test method multiple times automatically.
 */