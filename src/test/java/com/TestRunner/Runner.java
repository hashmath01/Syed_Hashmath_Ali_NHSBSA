package com.TestRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\44744\\Downloads\\NHS1-master\\NHS1-master\\src\\test\\resources\\features"
        ,glue={"com.acceptance.stepDefinitions"}
)

public class Runner {

}
