package TestSuites;

/**
 * Created by jeffradom on 2/9/17.
 */

import PageObjects.addingtocart;
import UIutilities.UIutility1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class Suite1 {
//public WebDriver driver = new FirefoxDriver();

//	@AfterMethod
//	public void beforeTest() {
//		driver.quit();
//	}
String cartID = "nav-cart-count" ;

    public WebDriver driver;

    @BeforeMethod(alwaysRun = true)
    public void setup(){
        driver = new FirefoxDriver();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

    @Test(enabled = true , priority = 1)
    public void gotoPage() {
        addingtocart myaddingtocart = new addingtocart(driver);
        myaddingtocart.navigateToSite();
        Assert.assertTrue(myaddingtocart.getCartID().isDisplayed(), "No Cart image visible");
    }

    @Test(enabled = true , priority = 1)
    public void clickOnCart() throws InterruptedException {
        addingtocart myaddingtocart = new addingtocart(driver);
        UIutility1 myUIutility1 = new UIutility1(driver);
        myaddingtocart.navigateToSite();
        myaddingtocart.clickCart();
        Assert.assertTrue(driver.getPageSource().contains("Your Shopping Cart is empty"), "cart click didn't work");
        Assert.assertTrue(myUIutility1.isElementPresent(myaddingtocart.getShowNowButtonXpath(), driver), "cart click didn't work");
    }
}