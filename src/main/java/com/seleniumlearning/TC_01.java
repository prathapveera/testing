package com.seleniumlearning;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class TC_01 {
    @Test
    public void launchBrowser(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String url="https://demo.nopcommerce.com";
        driver.get(url);
        driver.manage().window().maximize();
        driver.findElement(By.linkText("Register")).click();

        WebElement day=driver.findElement(By.name("DateOfBirthDay"));
        Select select=new Select(day);
        select.selectByVisibleText("2");

        driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys("FirstName");



    }
}
