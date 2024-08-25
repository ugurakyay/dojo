package Tests;

import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseWebAutomationTest {

    private LoginPageObject login;

    @BeforeMethod
    @Step("Setup test environment")
    public void setUp() {
        login = new LoginPageObject();
    }

    @Test(description = "Test login functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test case verifies the login functionality of the application.")
    @Epic("Login")
    @Feature("Login Page")
    @Story("User should be able to login and logout successfully")
    public void testLogin() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        login.logOut();
        Allure.step("Logging out from the application");
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
