package binding;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/outline.feature", glue={"stepDefinition"} , format={"pretty", "html:target/cucumber"})

public class runTest {

}
