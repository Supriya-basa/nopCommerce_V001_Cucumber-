package testRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions
		(
		features= {".//Features/"},
		glue="stepDefinitions",
		dryRun=false,
		monochrome=true,
		plugin= {"pretty",
				"html:test-output"},
		tags= {"@sanity,@regression"}
		)
//,".//Features/Customers.feature
public class TestRunner {

}


//0ddc330314934f6dbaa3d0ee3c5bb903