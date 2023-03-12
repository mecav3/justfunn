package steps;

import data.DataSingleQuery;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import poms.ManagerPage;
import util.Driver;
import util.JS;

import java.util.List;

public class manager extends ManagerPage {

    @When("check {string} unapproved")
    public void checkUnapproved(String usr) {
        List<String> list = DataSingleQuery.getAwaitingApprovel(usr);
        System.out.println(list);
        if (list.size() < 1) {
            System.out.println("no awaiting, quiting method");
            return;
        }
        invoiceLink.click();
        purchaseInvoiceLink.click();
        Select select100 = new Select(select);
        select100.selectByValue("100");

        System.out.println(list.get(0));

        JS.scroll_into(Driver.getDriver(),
                Driver.getDriver().findElement(By.xpath("//td[.='" + list.get(0) + "']/following-sibling::td[6]//button[.='Approve']")));

        JS.click(Driver.getDriver(),
                Driver.getDriver().findElement(By.xpath("//td[.='" + list.get(0) + "']/following-sibling::td[6]//button[.='Approve']"))
        );
        select100.selectByValue("100");

    }
}
