package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.junit.experimental.theories.Theories;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class ListenerPageObject extends PageObject{


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

    public void Listener() throws InterruptedException {
        Thread.sleep(4000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/nav/div/a[3]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section/div[1]/div[2]/button")).click();
        browser.findElement(By.xpath("//*[@id=\"listenerName\"]")).sendKeys("Test Listener");
        browser.findElement(By.xpath("//*[@id=\"description\"]")).sendKeys("test");
        browser.findElement(By.xpath("//*[@id=\"hostname\"]")).sendKeys("cwmp_json_topic?brokers=kafka:1111&groupId=ci-data");
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.TAB, Keys.ENTER).perform();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section/div[2]/div[4]/div[2]/div[3]/div[1]")).click();


    }

}
