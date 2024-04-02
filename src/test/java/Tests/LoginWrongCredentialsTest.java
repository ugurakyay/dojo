package Tests;

import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWrongCredentialsTest extends BaseWebAutomationTest {

    private LoginPageObject login;

    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
    }

    @Test(description = "Test login functionality")
    public void WrongLogin() throws InterruptedException {
        login.navigateTo();
        login.WrongCredentials();

    }





    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }
}
