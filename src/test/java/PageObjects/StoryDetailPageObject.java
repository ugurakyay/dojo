package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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

    public void AddAction() throws InterruptedException {
        Thread.sleep(2000);
        //browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/button")).click();
        WebElement element = browser.findElement(By.xpath("//div[@class='flex pl-2 w-full flex-col justify-center items-start']"));

        // Elemente tıkla
        element.click();
        Thread.sleep(1000); // Bekleme süresi

        // Actions sınıfını kullanarak iki kez TAB tuşuna bas
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.TAB, Keys.TAB).perform();
        Thread.sleep(1000); // Bekleme süresi

        // "c" harfini gönder
        actions.sendKeys("c").perform();

        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[3]/div/div/button")).click();
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div[3]/div[2]/button")).click();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB, Keys.TAB).perform();
        actions.sendKeys("test").perform();
        //actions.sendKeys(Keys.TAB, Keys.TAB, Keys.SPACE).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB,Keys.TAB, Keys.SPACE).perform();
        Thread.sleep(2000);
        actions.sendKeys("I","I").perform();
        actions.sendKeys(Keys.ENTER,Keys.TAB).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.ENTER).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(2000);
        actions.sendKeys(Keys.TAB).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB,Keys.TAB,"5",Keys.TAB,Keys.TAB,Keys.ENTER).perform();
        Thread.sleep(3000);
    }

    public void ZoomOut() throws InterruptedException {
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[3]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[3]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[3]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[3]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[3]")).click();
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[4]/div[2]")).click();
    }

    public void RequiredField() throws InterruptedException {
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[1]/div[2]/div[6]/div[2]")).click();
        //Thread.sleep(2000);
        //browser.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[1]/div[2]/div/div/div[1]/select")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(browser);
        actions.sendKeys("c",Keys.ENTER).perform();
        actions.sendKeys(Keys.TAB,Keys.SPACE).perform();
        Thread.sleep(2000);
        browser.findElement(By.xpath("/html/body/div[3]/div/div/div/div/div[2]/div[1]/div[2]/div/div/div[3]/button")).click();
        Thread.sleep(2000);
    }

    public void StateAction() throws InterruptedException {
        Thread.sleep(2000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[4]/div[1]/button[2]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[4]/div[1]/div[3]/div/div/button/div")).click();
        Thread.sleep(1000);
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
        Thread.sleep(1000);
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[5]/div/div[1]/div/div/div[2]/div[4]/div[1]/div[2]/div/div/div/dl/div/div/dd/div/form/div[2]/button[2]")).click();
    }

    public void DeployButton() throws InterruptedException {
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[2]/div/button[1]")).click();
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(browser, 10);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Deployed')]"))).isDisplayed());
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Run')]"))).isDisplayed());
        browser.findElement(By.xpath("/html/body/div[1]/div[1]/div[2]/div/div/div/div/main/div[3]/div[2]/div/button[1]")).click();
        Thread.sleep(2000);
        Assert.assertTrue(wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Undeployed')]"))).isDisplayed());



    }



}
