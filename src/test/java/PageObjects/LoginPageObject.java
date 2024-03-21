package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LoginPageObject extends PageObject {
    @Override
    public void navigateTo() {
        String url = ConfigReader.getInstance().getHost();
        if (url != null && !url.isEmpty()) {
            browser.get(url);
        } else {
            throw new RuntimeException("Target URL is not provided or invalid.");
        }
    }

    @Override
    public boolean isPresent() {
        // Implement the logic to check if login page is present
        // Return true if present, otherwise false
        return false;
    }

    public void login() throws InterruptedException {

        Thread.sleep(5000);
        String userName = ConfigReader.getInstance().getUserName();
        String password = ConfigReader.getInstance().getPassword();
        browser.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys(userName);
        browser.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(password);
        browser.findElement(By.name("login")).click();

        WebDriverWait wait = new WebDriverWait(browser, 10);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Collections')]"))).isDisplayed());



    }

    @Override
    public void logOut() throws InterruptedException {
        Thread.sleep(5000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:r0:\"]/img")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-menu-items-:rb:\"]")).click();
        Thread.sleep(5000);
        browser.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/button[1]")).click();
        Thread.sleep(5000);




    }
}
