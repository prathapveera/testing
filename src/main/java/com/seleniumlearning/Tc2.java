package com.seleniumlearning;

import com.genericmethods.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Tc2 {

    @Test
    public void tc_02() throws InterruptedException {
        Utils utils=new Utils();
        WebDriver driver=utils.launchBrowser("chrome","https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();

        WebDriverWait wait=new WebDriverWait(driver,35);
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='FirstName']")));
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='FirstName']")));
      element.sendKeys("Firstname");
    }

}
