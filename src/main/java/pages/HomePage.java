package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;
    private By inputField = By.id("number");
    private By calculateButton = By.id("getFactorial");
    private By result = By.id("resultDiv");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void setNumber(String number){
        driver.findElement(inputField).sendKeys(number);
    }

    public void clickCalculateButton(){
        driver.findElement(calculateButton).click();
    }

    public String getResult(){
        return driver.findElement(result).getText();
    }

    public void clearInput(){
        driver.findElement(inputField).clear();
    }

}
