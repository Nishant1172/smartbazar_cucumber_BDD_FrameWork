package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\features\\search_item_list.feature", glue = {"stepDef"},
plugin = {"junit:target/junit/homejunit.xml"})
public class junitRunnerClass {

}
