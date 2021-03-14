package calculate;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CalculateTests extends BaseTests {


    @Test
    public void testSuccessfulCalculation() throws InterruptedException {
        homePage.clearInput();
        homePage.setNumber("0");
        homePage.clickCalculateButton();
        Thread.sleep(1000);

        assertEquals(homePage.getResult(), "The factorial of 0 is: 1", "Result text is incorrect");

        homePage.clearInput();
        homePage.setNumber("3");
        homePage.clickCalculateButton();
        Thread.sleep(1000);

        assertEquals(homePage.getResult(), "The factorial of 3 is: 6", "Result text is incorrect");
    }

    @Test
    public void testFailingCalculation(){
        homePage.clearInput();
        homePage.setNumber("aaa");
        homePage.clickCalculateButton();

        assertEquals(homePage.getResult(), "Please enter an integer", "Error text is incorrect");
    }

    @Test
    public void testBigIntegerHandling() throws InterruptedException {
        homePage.clearInput();
        homePage.setNumber("980");
        homePage.clickCalculateButton();
        Thread.sleep(1000);

        assertEquals(homePage.getResult(), "The factorial of 980 is: Infinity", "Result text  is incorrect");
    }

    @Test
    public void testSpecialCharactersHandling(){
        homePage.clearInput();
        homePage.setNumber("!@#");
        homePage.clickCalculateButton();

        assertEquals(homePage.getResult(), "Please enter an integer", "Error text is incorrect");
    }
}
