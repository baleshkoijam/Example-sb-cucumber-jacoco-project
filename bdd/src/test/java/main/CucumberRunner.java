package main;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith (Cucumber.class)
@CucumberOptions (
        format= {"pretty","json:target/"},
        features= {"src/"},
        glue = {"stepdef"}
)
public class CucumberRunner {

}
