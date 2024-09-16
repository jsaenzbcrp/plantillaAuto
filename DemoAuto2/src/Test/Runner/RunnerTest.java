package Test.Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber/cucumber-report.html", "json:target/cucumber/cucumber.json"},
        stepNotifications = true,
        features = {"src/Features"},
        glue = {"Test"},
        tags = "@testfeature"
)
public class RunnerTest {
    public RunnerTest(){}
}
