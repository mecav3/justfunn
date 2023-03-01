import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import steps.Driver;

import java.time.LocalTime;

public interface JSI {

    default void say(String s) {
        System.out.println(s + ".." + LocalTime.now().getSecond());
    }

    default void click(WebElement we) {
        ((JavascriptExecutor) Driver.getDriver())
                .executeScript("arguments[0].click()", we);
    }

}
