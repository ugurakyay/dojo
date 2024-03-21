package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.List;

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


    public void logOut() throws InterruptedException {
        Thread.sleep(5000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/header/div/div/div[3]/div")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-menu-items-:rb:\"]")).click();

        Thread.sleep(5000);
        browser.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[2]/button[1]")).click();
        Thread.sleep(5000);
    }

    public void WrongCredentials() throws InterruptedException {
        Thread.sleep(5000);

        browser.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("wrong");
        browser.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("wrong");
        browser.findElement(By.name("login")).click();

        WebDriverWait wait = new WebDriverWait(browser, 10);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Invalid username or password.')]"))).isDisplayed());
    }

    public void EmptyCredentials() throws InterruptedException {
        Thread.sleep(5000);

        browser.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("");
        browser.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("");
        browser.findElement(By.name("login")).click();

        WebDriverWait wait = new WebDriverWait(browser, 10);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Invalid username or password.')]"))).isDisplayed());
    }
}
