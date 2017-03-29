package UIutilities;

/**
 * Created by jeffradom on 2/22/17.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class UIutility1 {
    WebDriver driver;

    public UIutility1(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By by, WebDriver driver) {
        try {
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

}
