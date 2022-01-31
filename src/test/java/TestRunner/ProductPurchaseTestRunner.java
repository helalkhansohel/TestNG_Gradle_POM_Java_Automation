package TestRunner;

import Pages.ProductPurchase;
import Setup.Setup;
import org.testng.annotations.Test;

public class ProductPurchaseTestRunner extends Setup {

    @Test(priority = 0,  description = "Select a product")
    public void selectMyProduct() throws InterruptedException {
        driver.get("https://envothemes.com/envo-ecommerce");
        ProductPurchase purchase=new ProductPurchase(driver);
        purchase.selectProduct();
    }
    @Test(priority = 1,  description = "Add product in cart")
    public void addCart() throws InterruptedException {
        ProductPurchase purchase=new ProductPurchase(driver);
       // purchase.addCart();
    }

}
