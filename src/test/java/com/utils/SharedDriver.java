package com.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SharedDriver {
WebDriver driver;

public WebDriver lauchBrowser(String browsername){

    switch (browsername){
        case "chrome":
            System.setProperty("webdriver.chrome.driver","C:/Users/44744/Downloads/NHS1-master/NHS1-master/src/test/resources/Drivers/chromedriver.exe");
            driver = new ChromeDriver();
            break;
        case "firefox":
            System.setProperty("webdriver.gecko.driver","C:\\Users\\44744\\Downloads\\NHS1-master\\NHS1-master\\src\\test\\resources\\Drivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            break;
        default:
            System.setProperty("webdriver.chrome.driver","C:\\Users\\44744\\Downloads\\NHS1-master\\NHS1-master\\src\\test\\resources\\Drivers\\chromedriver.exe");
            driver = new ChromeDriver();

    }
    return  driver;
}


}
