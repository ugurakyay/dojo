package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;

public class StoryDetailPageObject extends PageObject { //Create Add Target State Story
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
    public void AddDetailsNormal() throws InterruptedException {
        Thread.sleep(5000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/div")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Add Target State']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"prompt-form.input\"]")).sendKeys("Test");
        browser.findElement(By.xpath("//*[@id=\"prompt-form.stateType\"]")).click();
        browser.findElement(By.xpath("//*[@id=\"prompt-form.stateType\"]/option[1]")).click();
        browser.findElement(By.xpath("//button[text()='OK']")).click();
    }

    public void AddEndState()throws InterruptedException{
        Thread.sleep(5000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/div")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Add Target State']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"prompt-form.input\"]")).sendKeys("Test");
        browser.findElement(By.xpath("//*[@id=\"prompt-form.stateType\"]/option[2]")).click();
        browser.findElement(By.xpath("//button[text()='OK']")).click();
    }

    public void OneEventState()throws InterruptedException{
        Thread.sleep(5000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/div")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Add Target State']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"prompt-form.input\"]")).sendKeys("Test");
        browser.findElement(By.xpath("//*[@id=\"prompt-form.stateType\"]/option[3]")).click();
        browser.findElement(By.xpath("//button[text()='OK']")).click();
    }

    public void AddDecisionbox()throws InterruptedException{
        Thread.sleep(5000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/div")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Add Decision Box']")).click();
        Thread.sleep(2000);
    }



}
