package StepDefFF;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin= {"pretty", "html:target/cucumber-report.html",
		                            "json:target/cucumber-report.json"	
                           },
		monochrome=true ,
		features =  {
				"src/test/resources"
		}
		
		
		)
public class RunnerTest {

}
