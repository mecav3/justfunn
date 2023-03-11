package poms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class ManagerPage {
    public ManagerPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[data-target='#submenu-4']")
    public WebElement invoiceLink;

    @FindBy(linkText = "Purchase Invoice")
    public WebElement purchaseInvoiceLink;

    @FindBy(css = "select.form-select.form-select-sm")
    public WebElement select;

}
