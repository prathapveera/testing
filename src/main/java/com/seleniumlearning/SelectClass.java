package com.seleniumlearning;

import com.genericmethods.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        Utils utils=new Utils();
        WebDriver driver=utils.launchBrowser("chrome","https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        WebElement day=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select select=new Select(day);
        select.selectByIndex(13);
        Thread.sleep(2000);
        select.selectByValue("9");
        Thread.sleep(2000);
        select.selectByVisibleText("13");
    }
}
