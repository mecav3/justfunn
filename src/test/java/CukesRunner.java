import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:cucumber-report.html",
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@wip"
)

public class CukesRunner {

}
