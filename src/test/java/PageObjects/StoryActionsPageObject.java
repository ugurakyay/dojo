package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class StoryActionsPageObject extends PageObject { // Story Actions

    @Override
    public void navigateTo() {
        // Implement navigation if necessary
    }

    @Override
    public boolean isPresent() {
        return false; // Implement presence check if necessary
    }

    public void addEvent() throws InterruptedException {
        WebElement element = browser.findElement(By.xpath("//div[@class='flex pl-2 w-full flex-col justify-center items-start']"));
        element.click();
        Thread.sleep(1000);



        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.DOWN).perform();
        Thread.sleep(1000);

        browser.findElement(By.xpath("//option[contains(text(), 'preprod')]")).click();



        /*WebElement selectElement = browser.findElement(By.id("DB-964db7fa-90f1-4a16-ad4d-3f5031d00342-decisionBox-event-form.event"));
        Select select = new Select(selectElement);
        select.selectByVisibleText("preprod_cwmp_inform");

         */

        Thread.sleep(2000);

        actions.sendKeys("c").perform();
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[3]/div/div/button")).click();
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/button")).click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.DOWN).perform();
        actions.sendKeys("test").perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.SPACE).perform();
        Thread.sleep(2000);
        actions.sendKeys("I", "I").perform();
        actions.sendKeys(Keys.ENTER, Keys.TAB).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB, Keys.TAB, "5", Keys.TAB, Keys.TAB, Keys.ENTER).perform();
        Thread.sleep(3000);
    }

    public void zoomOut() throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[3]")).click();
            Thread.sleep(1000);
        }
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[4]/div[2]")).click();
    }

    public void requiredField() throws InterruptedException {
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[6]/div[2]")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(browser);
        actions.sendKeys("c", Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB, Keys.SPACE).perform();
        Thread.sleep(2000);
        browser.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[1]/div[2]/div/div/div[3]/button")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-dialog-overlay-:rfd:\"]")).click();
    }

    public void stateAction() throws InterruptedException {
        Thread.sleep(2000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[4]/div[1]/button[2]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[4]/div[1]/div[3]/div/div/button/div")).click();
        Thread.sleep(1000);
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
        Thread.sleep(1000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[4]/div[1]/div[2]/div/div/div/dl/div/div/dd/div/form/div[2]/button[2]")).click();
    }

    public void deployButton() throws InterruptedException {
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[2]/div/button[1]")).click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Run')]"))).isDisplayed());
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Undeployed')]"))).isDisplayed());
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
    }
}
