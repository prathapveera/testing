package com.seleniumlearning;

import com.genericmethods.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.util.List;

public class GetDescendants {

    @Test
    public void tc_02() throws InterruptedException {
        Utils utils=new Utils();
        WebDriver driver=utils.launchBrowser("chrome","https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);

        List<WebElement> allOptions=driver.findElements(By.xpath("//form//descendant::label"));
String ref="Email";
int elementNum=0;
       for(int i=0;i<=allOptions.size()-1;i++){
if(allOptions.get(i).getText().contains("Email")){ elementNum=i+1; break;};
    }
        System.out.println(elementNum);
String emailXpath="(//form//descendant::label)["+elementNum+"]/following-sibling::input";

driver.findElement(By.xpath(emailXpath)).sendKeys("Email sending");

    }



}
