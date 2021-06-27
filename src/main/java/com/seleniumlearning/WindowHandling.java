package com.seleniumlearning;

import com.genericmethods.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class WindowHandling {
    public static void main(String[] args) {
        Utils utils=new Utils();
        WebDriver driver=utils.launchBrowser("chrome","https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
String rowXpath="//th[text()='Company']/ancestor::thead/following-sibling::tbody/tr";
List<WebElement> allRows=driver.findElements(By.xpath(rowXpath));

for(int r=0;r<=allRows.size()-1;r++){
    String colXpath="//th[text()='Company']/ancestor::thead/following-sibling::tbody/tr["+(r+1)+"]/td";
    List<WebElement> allCols=driver.findElements(By.xpath(colXpath));

    for(int c=0;c<=allCols.size()-1;c++) {
        String data="//th[text()='Company']/ancestor::thead/following-sibling::tbody/tr["+(r+1)+"]/td["+(c+1)+"]";
        System.out.println(driver.findElement(By.xpath(data)).getText());
    }

}

    }
}
