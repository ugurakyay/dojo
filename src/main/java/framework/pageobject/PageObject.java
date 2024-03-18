package framework.pageobject;

import framework.utils.WebDriverUtils;
import org.openqa.selenium.WebDriver;

public abstract class PageObject {

    protected final WebDriver browser;

    public PageObject(WebDriver browser) {
        if (browser == null) {
            this.browser = WebDriverUtils.getBrowser();
        } else {
            this.browser = browser;
        }
    }

    public PageObject() {
        this(null);
    }

    public abstract void navigateTo();

    public abstract boolean isPresent();




}
