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

Why do we use it?

Suppose you want to run the same test 4 times to check whether it works consistently.

Instead of writing the same test 4 times:


 */