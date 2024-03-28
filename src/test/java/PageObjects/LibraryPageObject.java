package PageObjects;

import framework.BaseWebAutomationTest;
import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;

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

    public void ClickLibrary(){
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
}
