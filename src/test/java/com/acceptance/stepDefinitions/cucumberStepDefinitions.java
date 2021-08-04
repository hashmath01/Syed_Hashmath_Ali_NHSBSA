package com.acceptance.stepDefinitions;

import PageObjects.NHSElements;
import com.utils.SharedDriver;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class cucumberStepDefinitions {
WebDriver driver;
SharedDriver sharedDriver = new SharedDriver();
NHSElements nhsObj;

    @Given("^I am a citizen of the UK \"([^\"]*)\"$")
    public void I_am_citizen_of_the_UK(String BrowserName) throws InterruptedException {
      driver =  sharedDriver.lauchBrowser(BrowserName);
      this.driver = driver;

      driver.manage().window().maximize();
      driver.get("https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start");
      Thread.sleep(3000);
        nhsObj = new NHSElements(driver);
        nhsObj.cookies().click();
        nhsObj.start().click();
        nhsObj.country().click();
        nhsObj.next().click();


    }

    @When("I put my circumstances into the Checker tool$")
    public void I_put_my_circumstances_into_the_Checker_tool(){
        nhsObj.no().click();
        nhsObj.next().click();
        //Thread.sleep(2000);
        nhsObj.day().sendKeys("24");
        nhsObj.month().sendKeys("02");
        nhsObj.year().sendKeys("1989");
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();
        nhsObj.no().click();
        nhsObj.next().click();



    }

    @Then("I should get a result of whether I will get help or not$")
    public void I_should_get_a_result_of_whether_I_will_get_help_or_not(){

        String actualText = nhsObj.willHelp().getText();
        Assert.assertEquals("You could get help to pay for your NHS costs",actualText);


    }


}
