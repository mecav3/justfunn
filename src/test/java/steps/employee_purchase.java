package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import poms.EmployeePage;
import util.Driver;
import util.JS;

public class employee_purchase {
    EmployeePage lp = new EmployeePage();

    @When("user clicks invoices")
    public void user_clicks_invoices() {
        lp.invoiceLink.click();
    }

    @Then("user clicks purchase invoice")
    public void user_clicks_purchase_invoice() {
        lp.purchaseInvoiceLink.click();
        Assert.assertEquals(lp.purchaseInvoiceListHeader.getText(), "Purchase Invoice List");
    }

    @Then("user click create purchase invoice")
    public void user_click_create_purchase_invoice() {
        JS.click(Driver.getDriver(), lp.companyCreateLink);
        Assert.assertEquals(lp.createNewPurchaseInvoiceHeader.getText(), "Create New Purchase Invoice");
    }

    @Then("user creates new purchase invoice")
    public void user_creates_new_purchase_invoice() {
        new Select(lp.selectVendor).selectByIndex(1);
        lp.saveVendor.click();

        new Select(lp.selectProduct).selectByIndex(1);

        lp.quantity.sendKeys("19");
        lp.price.sendKeys("100");
        lp.tax.sendKeys("10");
        lp.buttonAddItem.click();

        String e_invoice = Driver.getDriver().findElement(By.id("invoiceNo")).getAttribute("value");
    }
}

