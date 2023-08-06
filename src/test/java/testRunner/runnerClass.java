package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src\\test\\resources\\features", glue = {"stepDef","hooks"},
    plugin = {"pretty","html:target/cucumber-report/homepage.html"},monochrome = false)
    public class runnerClass extends AbstractTestNGCucumberTests {

}
