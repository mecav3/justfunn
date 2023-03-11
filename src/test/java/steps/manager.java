package steps;

import io.cucumber.java.en.When;
import data.DataSingleQuery;

public class manager {
    @When("check unapproved")
    public void checkUnapproved() {
        DataSingleQuery.getAwaitingApprovel();
    }
}
