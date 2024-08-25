package Tests;

import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginWrongCredentialsTest extends BaseWebAutomationTest {

    private LoginPageObject login;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        Allure.step("Page objects initialized");
    }

    @Test(description = "Test login functionality with wrong credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test case verifies the behavior when attempting to log in with wrong credentials.")
    @Epic("Login")
    @Feature("Login Page")
    @Story("User should not be able to login with wrong credentials")
    public void WrongLogin() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.WrongCredentials();
        Allure.step("Attempting to log in with wrong credentials");
    }

    @Override
    public void navigateTo() {
        Allure.step("Navigating to the base URL of the application");
    }

    @Override
    public boolean isPresent() {
        Allure.step("Checking if the element is present");
        return false;
    }
}
