package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NHSElements {
    WebDriver driver;

        public NHSElements(WebDriver driver1) {
        System.out.println("Madhusudhan");
        this.driver = driver1;
    }


    public WebElement cookies() { return driver.findElement(By.xpath("//button[@id='nhsuk-cookie-banner__link_accept_analytics']"));}
    public WebElement start() { return driver.findElement(By.xpath("//input[@type='submit']"));}
    public WebElement country() { return driver.findElement(By.xpath("//label[@id='label-england']"));}
    public WebElement next() { return driver.findElement(By.xpath("//input[@value='Next']"));}
    public WebElement yes() { return driver.findElement(By.xpath("//label[@id='label-yes']"));}
    public WebElement no() { return driver.findElement(By.xpath("//label[@id='label-no']"));}
    public WebElement day() { return  driver.findElement(By.xpath("//input[@id='dob-day']"));}
    public WebElement month() { return driver.findElement(By.xpath("//input[@id='dob-month']"));}
    public WebElement year() { return driver.findElement(By.xpath("//input[@id='dob-year']"));}
    public WebElement YES_I_RECEIVED_UNIVERSAL_CREDIT() { return driver.findElement(By.xpath("///input[@value='YES_I_RECEIVED_UNIVERSAL_CREDIT']"));}
    public WebElement NOT_YET() { return  driver.findElement(By.xpath("///input[@value='NOT_YET']"));}
    public WebElement NO_I_GET_DIFFERENT_BENEFIT() { return driver.findElement(By.xpath("///input[@value='NO_I_GET_DIFFERENT_BENEFIT']"));}
    public WebElement TAX_CREDIT() { return driver.findElement(By.xpath("///input[@value='TAX_CREDIT']"));}
    public WebElement WORKING_TAX_CREDIT() { return driver.findElement(By.xpath("///input[@value='WORKING_TAX_CREDIT']"));}
    public WebElement willHelp() { return driver.findElement(By.xpath("//h1/span[2]"));}





}
