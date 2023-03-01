import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:cucumber-report.html", "json:target/cucumber.json", "junit:target/junit/junit-report.xml"},
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@wip",
        publish = true
)

public class CukesRunner {

}
