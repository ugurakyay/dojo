package PageObjects;

import framework.config.ConfigReader;
import framework.pageobject.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

public class RemoveStoryObject extends PageObject {
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

    public void removeStoryMultipleTimes(int repeatCount) throws InterruptedException {
        for (int i = 0; i < repeatCount; i++) {
            removeStory();
        }
    }

    public void removeStory() throws InterruptedException {
        Thread.sleep(3000);
        browser.findElement(By.xpath("//*[@id=\"headlessui-menu-button-:r8:\"]")).click();
        Thread.sleep(2000);
        Actions actions = new Actions(browser);
        actions.sendKeys(Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ARROW_DOWN, Keys.ENTER).perform();
        Thread.sleep(1000);
        actions.sendKeys(Keys.TAB, Keys.ENTER).perform();
    }

}

