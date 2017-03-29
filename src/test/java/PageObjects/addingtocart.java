package PageObjects;

/**
 * Created by jeffradom on 2/9/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class addingtocart {
    WebDriver driver;

//private WebDriver driver = new FirefoxDriver();

public String cartID = "nav-cart-count" ;
public String ShopNowButtonXpath = "//a[@class='click_region']";

    public addingtocart(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSite() {
        driver.get("http://www.amazon.com");
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable(getCartID()));
    }

    public void clickCart() throws InterruptedException{
        driver.findElement(By.id(cartID)).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
///        wait.until(ExpectedConditions.elementToBeClickable(getShowNowButtonXpath2()));
        Thread.sleep(3000);
    }

    public WebElement getCartID() {
        return driver.findElement(By.id(cartID));
    }
    public By getShowNowButtonXpath() {
        return (By.xpath(ShopNowButtonXpath));
    }
    public WebElement getShowNowButtonXpath2() {
        return driver.findElement(By.xpath(ShopNowButtonXpath));
    }

}
