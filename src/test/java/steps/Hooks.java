package steps;

import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import steps.Driver;

// hooks general implementaion to all methods
// @Before / @After - each and every SCENARIO in our project (unless we specify with @TAGS)
// Background is for business side & related to feature file - before each scenario
public class Hooks {
    //
//    @Before(order = 2)
//    public static void setupScenario() {
//        System.out.println("setting things @Before");
//    }
//
//    @Before(value = "@DB", order = 1)
//    public static void setupScenarioDB() {
//        System.out.println("setting things @Before");
//    }
//
//    @Before("@login")
//    public static void setupScenarioforlogin() {
//        System.out.println("setting things @Before");
//    }
//
    @After
    public void teardownscenario(Scenario scenario) {
        System.out.println("---closing browser @After");

//        if (scenario.isFailed()) {
//            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
//            scenario.attach(screenshot, "image/png", scenario.getName());
//        }

      //  Driver.closeDriver();
    }
//
//    @BeforeStep
//    public void setup() {
//        System.out.println("before step setup @BeforeStep");
//    }
//
//    @AfterStep
//    public void aftersetup() {
//        System.out.println("before step setup @AfterStep");
//    }
}
