package poms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import util.Driver;

public class EmployeePage {
    public EmployeePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(css = "a[data-target='#submenu-4']")
    public WebElement invoiceLink;

    @FindBy(linkText = "Purchase Invoice")
    public WebElement purchaseInvoiceLink;

    @FindBy(tagName = "h2")
    public WebElement purchaseInvoiceListHeader;

    @FindBy(tagName = "h3")
    public WebElement createNewPurchaseInvoiceHeader;

    @FindBy(id = "companyCreateLink")
    public WebElement companyCreateLink;

    @FindBy(id = "vendor")
    public WebElement selectVendor;

    @FindBy(name = "action")
    public WebElement saveVendor;

    @FindBy(id = "product")
    public WebElement selectProduct;

    @FindBy(id = "quantity")
    public WebElement quantity;

    @FindBy(id = "price")
    public WebElement price;

    @FindBy(id = "tax")
    public WebElement tax;

    @FindBy(xpath = "//button[@value='addItem']")
    public WebElement buttonAddItem;

}
