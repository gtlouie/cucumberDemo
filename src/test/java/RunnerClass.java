import  cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin ={"pretty",
                "html:target/cucumber-report/",
                "json:target/cucumber-report/cucumber.json"
        },
        features={"src/test/java/resources/features"},
        glue ={"com.louie.demo.steps"},
        tags = {"@Sprint1"}


        )
public class RunnerClass {
}