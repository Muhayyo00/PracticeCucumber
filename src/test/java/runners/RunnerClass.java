package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

//we need runwith to run cucumber with junit
@RunWith(Cucumber.class)
//cucumber options decide what to execute, where to execute
@CucumberOptions(
        //we use features to provide the path of the feature files
        //features="src/test/resources/features/",//to execute all the test cases
        features="src/test/resources/features/",
        //glue is the key word we use to find the gherkin step definitions
        //we provide the path of "steps" package where we have all steps definitions
        glue="steps",
        //dryRun=true-->scans all the step definitions and provides what step definition is missing
        //dryRun=false-->executes the codes
        dryRun=false,
        tags="@sprint3",
        plugin={"pretty"}
)

public class RunnerClass {

}
