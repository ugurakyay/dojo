package PageObjects;

import framework.config.ConfigReader;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class StoryPageObject extends LoginPageObject{

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

    public void NewStory () throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/nav/a")).click();
        Thread.sleep(3000);


        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
        String nameWithTimeStamp = "Test_Automation_By_je_" + timeStamp;

        browser.findElement(By.xpath("//*[@id=\"prompt-form.name\"]")).sendKeys(nameWithTimeStamp);
        browser.findElement(By.xpath("//*[@id=\"prompt-form.description\"]")).sendKeys("For Test Automation By Jenkins");
        Thread.sleep(5000);
        // "Create" düğmesine tıkla
        browser.findElement(By.xpath("//button[contains(text(), 'Create')]")).click();

        //browser.findElement(By.xpath("//*[@id=\"headlessui-dialog-:rc:\"]/div/div[2]/div[2]/button[1]")).click();
        WebDriverWait wait = new WebDriverWait(browser, 10);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Story Builder')]"))).isDisplayed());

    }

    public void CloseStory() throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[1]/div/nav/a")).click();
        String timeStamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMddHHmm"));
        String nameWithTimeStamp = "Test_Automation_By_je_" + timeStamp;

        browser.findElement(By.xpath("//*[@id=\"prompt-form.name\"]")).sendKeys(nameWithTimeStamp);
        browser.findElement(By.xpath("//*[@id=\"prompt-form.description\"]")).sendKeys("For Test Automation By Jenkins");
        Thread.sleep(2000);
        browser.findElement(By.xpath("//button[text()='Cancel']")).click();
        Thread.sleep(3000);



    }




}
