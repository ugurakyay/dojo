package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class StoryStatesPageObject extends PageObject { //Create Add Target State Story

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

    public void addDetailsNormal() throws InterruptedException {
        Thread.sleep(10000);
        browser.findElement(By.cssSelector("#root > div.h-full.flex > div.flex-1.flex.flex-col.overflow-hidden > div > div > div > div > main > div:nth-child(6) > div > div.react-flow__renderer > div > div > div.react-flow__nodes > div.react-flow__node.react-flow__node-DecisionBox.nopan.selectable > div > div.w-full.pl-2.pr-4.pb-3.relative.box-border.flex.flex-col.justify-center.items-start.border-black.border-x-\\[2px\\].z-40 > div:nth-child(5) > div")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Add Target State']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"prompt-form.input\"]")).sendKeys("Test");
        browser.findElement(By.xpath("//*[@id=\"prompt-form.stateType\"]")).click();
        browser.findElement(By.xpath("//*[@id=\"prompt-form.stateType\"]/option[1]")).click();
        browser.findElement(By.xpath("//button[text()='OK']")).click();
    }

    public void addEndState() throws InterruptedException {
        browser.findElement(By.cssSelector("div.w-full.relative.box-border.flex.flex-col.justify-center.items-start.border-black > div:nth-child(6) > div button\n")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Add Target State']")).click();
        browser.findElement(By.xpath("//input[@id='prompt-form.input']")).sendKeys("Automation");
        browser.findElement(By.xpath("//select[@id='prompt-form.stateType']/option[text()='End State']")).click();
        browser.findElement(By.xpath("//button[text()='OK']\n")).click();

    }

    public void oneEventState() throws InterruptedException {
        Thread.sleep(5000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/div")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Add Target State']")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"prompt-form.input\"]")).sendKeys("Test");
        browser.findElement(By.xpath("//*[@id=\"prompt-form.stateType\"]/option[3]")).click();
        browser.findElement(By.xpath("//button[text()='OK']")).click();
    }

    public void addDecisionBox() throws InterruptedException {
        Thread.sleep(5000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[4]/div")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//a[text()='Add Decision Box']")).click();
        Thread.sleep(2000);
    }
}
