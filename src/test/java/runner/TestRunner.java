package runner;

import base.BaseTest;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"classpath:features/create-task.feature",
                "classpath:features/create-tasks.feature"},
        glue = "steps",
        plugin = {"pretty", "html:target/cucumber-html-report.html"})
public class TestRunner extends BaseTest {
    // this class is necessary to run cucumber tests from terminal
}