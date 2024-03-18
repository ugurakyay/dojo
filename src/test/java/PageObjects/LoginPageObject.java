package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;

//Login olur.
public class LoginPageObject extends PageObject {
    @Override
    public void navigateTo() {browser.get(ConfigReader.getInstance().getHost());
    }

    @Override
    public boolean isPresent() {
        return false;
    }

    public void Loginpage() throws InterruptedException {
        browser.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("test");
        browser.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("test");
        browser.findElement(By.name("login")).click();
        Thread.sleep(2000);

    }
}
