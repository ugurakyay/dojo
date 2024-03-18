package Tests;

import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseWebAutomationTest {
    private LoginPageObject login;

    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
    }

    @Test(description = "Test login functionality")
    public void testLogin() throws InterruptedException {
        login.navigateTo();
        login.login();
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
