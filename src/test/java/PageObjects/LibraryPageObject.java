package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LibraryPageObject extends PageObject {
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
        return false;
    }

    public void ClickLibrary() throws InterruptedException {
        Thread.sleep(6000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/nav/div/a[2]")).click();
    }

    public void AddNewEvent() throws InterruptedException {
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div/div[1]/div/div[1]/button")).click();
        browser.findElement(By.xpath("//*[@id=\"headlessui-dialog-:r1t:\"]/div/div[2]/div[2]/button[2]")).click();
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
        String nameWithTimeStamp = "Test_Automation_By_je_" + timeStamp;
        browser.findElement(By.xpath("//*[@id=\"eventName\"]")).sendKeys(timeStamp);
        browser.findElement(By.xpath("//*[@id=\"headlessui-dialog-:r1v:\"]/div/div[2]/div[1]/div[2]/div/div/div[3]/div/div/div[1]/div[2]/div")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"react-select-3-option-3\"]")).click();
        browser.findElement(By.xpath("//*[@id=\"headlessui-dialog-:r1v:\"]/div/div[2]/div[2]/button[1]")).click();

    }

    public void addNewFolder() throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div/div[1]/div/div[3]/div[5]/span/button")).click();
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
        String nameWithTimeStamp = "Test_Automation_By_je_" + timeStamp;
        browser.findElement(By.xpath("//*[@id=\"prompt-form.input\"]")).sendKeys(nameWithTimeStamp);
        browser.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[3]/button[1]")).click();
        Thread.sleep(5000);
    }

    public void actionTemplate () throws InterruptedException {
        Actions actions = new Actions(browser);

         ///html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div/div[1]/div/div[3]/div[1]/nav/div/a/button/svg
        browser.findElement(By.xpath("//*[@id=\"headlessui-disclosure-button-:rh:\"]")).click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB,Keys.ENTER).perform();
        Thread.sleep(1000);
        Thread.sleep(2000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div/div[1]/div/div[3]/div[3]/nav/div/div/div[1]/div/div[3]/a/div[1]/span")).click();
        //browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div/div[1]/div/div[3]/div[3]/nav/div/div/div[1]/div/div[1]/a")).click();
        Thread.sleep(3000);
        actions.moveToElement(browser.findElement(By.tagName("body"))).click().sendKeys(Keys.END).perform();
        Thread.sleep(2000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div/div[2]/div/div[2]/div/div/div/div[3]/div/div/dl/div/div/dd/div/form/div[1]/div[1]/div/div/textarea")).click();
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div/div[2]/div/div[2]/div/div/div/div[3]/div/div/dl/div/div/dd/div/form/div[1]/div[1]/div/div/textarea")).sendKeys("{}");
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div/div[2]/div/div[2]/div/div/div/div[3]/div/div/dl/div/div/dd/div/form/div[2]/button")).click();
        //browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div/div[2]/div/div[2]/div/div/div/div[3]/div/div/dl/div/div/dd/div/form/div[2]/button")).click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB, Keys.ENTER,Keys.TAB,Keys.TAB, Keys.ENTER).perform();
        Thread.sleep(2000);
        browser.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[3]/button[1]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-disclosure-button-:rh:\"]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-disclosure-button-:rf:\"]")).click();
        actions.sendKeys(Keys.TAB, Keys.TAB, Keys.TAB, Keys.ENTER).perform();
        Thread.sleep(2000);


    }


}
