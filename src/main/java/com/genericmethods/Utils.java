package com.genericmethods;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Utils {

    public WebDriver launchBrowser(String browser,String url){
        WebDriver webDriver=null;
        switch (browser.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                webDriver=new ChromeDriver();
                break;
            case "ff":
                WebDriverManager.firefoxdriver().setup();
                webDriver=new FirefoxDriver();
                break;
            case "edge":
                WebDriverManager.edgedriver().setup();
                webDriver=new EdgeDriver();
                break;

        }
        webDriver.get(url);
        webDriver.manage().window().maximize();
       // webDriver.manage().timeouts().implicitlyWait(35, TimeUnit.SECONDS);
        return webDriver;
    }

    protected void clickElement(WebElement element){
        element.click();
    }

    protected void enterData(WebElement element,String data)
    {
        element.click();
        element.clear();
        element.sendKeys(data);
    }
}
