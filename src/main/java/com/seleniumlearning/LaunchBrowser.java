package com.seleniumlearning;

import com.genericmethods.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LaunchBrowser {

@Test
public void tc_01(){
    Utils utils=new Utils();
    utils.launchBrowser("ff","https://demo.nopcommerce.com/");
}

}
