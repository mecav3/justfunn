package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import util.CR;
import util.Driver;

public class logins {

    @Given("user at login page")
    public void userAtLoginPage() {
        Driver.getDriver().get(CR.get("url"));
    }

    @When("user enters password")
    public void user_enters_password() {
        Driver.getDriver().findElement(By.id("password")).sendKeys(CR.get("pass"));
    }

    @Then("user clicks login button")
    public void user_clicks_login_button() {
        Driver.getDriver().findElement(By.id("login-submit")).click();
    }

    @Then("user should be logged in")
    public void userShouldSeeTheCompanyList() {
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("(//img)[2]")).isDisplayed());
    }

    @When("user enters {string} username")
    public void userEntersUsername(String usr) {
        Driver.getDriver().findElement(By.id("username")).sendKeys(usr);
    }

}

