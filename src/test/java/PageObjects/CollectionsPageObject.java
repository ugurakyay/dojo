package PageObjects;

import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class CollectionsPageObject extends PageObject {
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }
    public void addCollection () throws InterruptedException {
        Thread.sleep(7000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section[1]/div[1]/div[2]")).click();
        browser.findElement(By.xpath("//*[@id=\"prompt-form.input\"]")).sendKeys("Test");
        Thread.sleep(3000);
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.TAB,Keys.ENTER).perform();


    }
    public void removeCollection () throws InterruptedException {
        Thread.sleep(5000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:r1:\"]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-menu-item-:r22:\"]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:r1s:\"]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-menu-item-:r3e:\"]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-dialog-:r3f:\"]/div/div[2]/div[2]/button[1]")).click();
    }

    public void sortCollectionNewst () throws InterruptedException {
        Thread.sleep(5000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section[1]/div[1]/div[3]/div[1]/div[1]")).click();
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section[1]/div[1]/div[3]/div[1]/div[2]/div/div/div[1]")).click();
    }

    public void sortCollectionOldest () throws InterruptedException {
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section[1]/div[1]/div[3]/div[1]/div[2]/div/div/div[2]")).click();
        Thread.sleep(2000);
    }
    public void sortCollectionA_Z() throws InterruptedException {
        Thread.sleep(1000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section[1]/div[1]/div[3]/div[1]/div[2]/div/div/div[3]")).click();
    }

    public void sortCollectionZ_A() throws InterruptedException {
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section[1]/div[1]/div[3]/div[1]/div[2]/div/div/div[4]")).click();
        Thread.sleep(2000);
        browser.findElement(By.xpath("//*[@id=\"root\"]/div[1]/div[2]/div/div/div/div/main/section[1]/div[1]/div[3]/div[1]/div[1]")).click();

    }


}
