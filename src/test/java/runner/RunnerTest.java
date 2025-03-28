package runner;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(features="src/test/resources/features/CreateTaskExampleTable.feature"
        ,glue= {"steps"}
        ,plugin= {"pretty","html:target/cucumber-html-report.html"})
public class RunnerTest extends BaseTest {
}