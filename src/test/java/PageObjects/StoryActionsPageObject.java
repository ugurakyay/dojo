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
        Thread.sleep(2000);
        WebElement element = browser.findElement(By.xpath("//div[@class='flex pl-2 w-full flex-col justify-center items-start']"));
        element.click();
        Thread.sleep(1000);

        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.DOWN).perform();
        Thread.sleep(1000);

        browser.findElement(By.xpath("//option[contains(text(), 'preprod')]")).click();

        Thread.sleep(2000);
        browser.findElement(By.xpath("//button[contains(text(), 'Update')]")).click();
        browser.findElement(By.xpath("//button[span[text()='Click to add condition']]")).click();



    }

    public void addPlayerVarial() throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("//label[@for='conditionForm']/following-sibling::input")).sendKeys("Test");
        browser.findElement(By.xpath("//option[contains(text(), 'Player Variable')]")).click();

        Thread.sleep(2000);
        // SVG'nin içindeki belirli bir path'i tespit eden XPath
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[7]")).click();
        browser.findElement(By.xpath("//button[contains(text(), 'Add New')]")).click();
        browser.findElement(By.id("playerVariableForm.name")).sendKeys("Test_Automation");
        browser.findElement(By.xpath("//select[@id='playerVariableForm.eventName']/option[@value='preprod_cwmp_inform']")).click();
        browser.findElement(By.xpath("//select[@id='playerVariableForm.parameterPath']/option[@value='preprod_cwmp_inform_IMEI']")).click();
        browser.findElement(By.xpath("//button[text()='OK']")).click();
        Thread.sleep(3000);
        browser.findElement(By.xpath("//select[contains(@id, 'decisionBox-event-form.lhvValue')]//option[text()='Test_Automation']")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.TAB,Keys.ENTER).perform();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//a[contains(@class, 'text-black') and contains(text(), 'greater than')]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//input[contains(@id, 'decisionBox-event-form.rhvValue')]")).sendKeys("4");
        browser.findElement(By.xpath("//button[contains(text(), 'Save')]")).click();

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
        browser.findElement(By.xpath("//button[contains(@class, 'flex-col') and .//div[text()='Test']]")).click();
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.ENTER).perform();

        browser.findElement(By.xpath("//button[.//span[text()='Click to add new action']]")).click();
        browser.findElement(By.xpath("//a[contains(text(), 'WaitAction')]")).click();
        browser.findElement(By.xpath("//input[@name='duration' and @data-path='DurationInfo.duration']")).sendKeys("Test");
        browser.findElement(By.xpath("//select[@name='timeUnit' and @data-path='DurationInfo.timeUnit']/option[@value='SECOND']")).click();
        browser.findElement(By.xpath("//button[contains(text(), 'Save') and contains(@class, 'bg-black')]")).click();

        browser.findElement(By.xpath("//div[contains(@class, 'cursor-pointer') and .//span[contains(text(), 'Click to add new action')]]")).click();
        browser.findElement(By.xpath("//a[contains(text(), 'CallServiceAction')]")).click();
        browser.findElement(By.xpath("//button[text()='Save' and contains(@class, 'bg-black')]")).click();

        WebElement zoomOutButton = browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[3]"));
        for (int i = 0; i < 5; i++) {
            zoomOutButton.click();
        }
//SendMailAction ekleme
        browser.findElement(By.xpath("//div[contains(@class, 'cursor-pointer') and .//span[contains(text(), 'Click to add new action')]]")).click();
        browser.findElement(By.xpath("//a[contains(text(), 'SendMailAction')]")).click();
        browser.findElement(By.xpath("//button[text()='Save' and contains(@class, 'bg-black')]")).click();

//StorePlayerVariableAction ekleme
        browser.findElement(By.xpath("//div[contains(@class, 'cursor-pointer') and .//span[contains(text(), 'Click to add new action')]]")).click();
        browser.findElement(By.xpath("//a[contains(text(), 'StorePlayerVariableAction')]")).click();
        browser.findElement(By.xpath("//button[contains(text(), 'Save') and contains(@class, 'bg-black')]")).click();

    }

    public void deleteStateAction() throws InterruptedException {
        browser.findElement(By.xpath("//button[text()='Delete']")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//button[text()='Delete']")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//button[text()='Delete']")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//button[text()='Delete']")).click();
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

    public void requirement() throws InterruptedException {
        browser.findElement(By.xpath("//div[@class='tooltip-content']/span\n")).click();
        Thread.sleep(5000);
        // Dropdown menüsünü açın
        WebElement dropdown = browser.findElement(By.xpath("//select"));
        dropdown.click();

// 'preprod_cwmp_inform' metnini içeren seçeneği seçin
        WebElement option = browser.findElement(By.xpath("//option[text()='preprod_cwmp_inform']"));
        option.click();



        browser.findElement(By.xpath("//input[@id='person-preprod_cwmp_inform_Temperature']\n")).click();
        browser.findElement(By.xpath("//button[text()='Save for current event']\n")).click();
    }
}
