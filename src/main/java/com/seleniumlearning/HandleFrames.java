package com.seleniumlearning;

import com.genericmethods.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HandleFrames {
    public static void main(String[] args) {
        Utils utils=new Utils();
        WebDriver driver=utils.launchBrowser("chrome","https://paytm.com/");
        driver.findElement(By.xpath("//div[text()='Log In/Sign Up']")).click();

        WebElement frame=driver.findElement(By.xpath("//iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.xpath("//span[normalize-space(text())='Watch Video']")).click();
        driver.switchTo().defaultContent();
    }
}
