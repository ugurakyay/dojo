package Tests;

import PageObjects.ListenerPageObject;
import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListenerTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private ListenerPageObject listner;
    private ChromeDriverService service;

    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
        listner= new ListenerPageObject();
    }

    @Test(description = "Test login functionality")
    public void testLogin() throws InterruptedException {
        login.navigateTo();
        login.login();
        listner.Listener();
        login.logOut();
    }

    @Override
    public void navigateTo() {
        // Uygulanacak kodu buraya ekleyin
    }

    @Override
    public boolean isPresent() {
        return false;
    }
}
