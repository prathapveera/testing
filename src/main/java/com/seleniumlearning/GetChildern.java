package com.seleniumlearning;

import com.genericmethods.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GetChildern {

    @Test
    public void tc_02() throws InterruptedException {
        Utils utils=new Utils();
        WebDriver driver=utils.launchBrowser("chrome","https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);

        List<WebElement> allOptions=driver.findElements(By.xpath("//select[@name='DateOfBirthDay']/child::*"));

        for(WebElement element:allOptions){
            System.out.println(element.getText());
        }


    }

}
