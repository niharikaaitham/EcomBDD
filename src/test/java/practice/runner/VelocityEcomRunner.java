package practice.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
        features={"src/test/resources/features"},
        glue= {"practice/stepDefinitions","practice.hooks"},
        publish = true,
        plugin = {"pretty"}
)
public class VelocityEcomRunner extends AbstractTestNGCucumberTests{

}
