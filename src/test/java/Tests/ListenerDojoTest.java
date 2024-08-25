package Tests;

import PageObjects.ListenerPageObject;
import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ListenerDojoTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private ListenerPageObject listner;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        listner = new ListenerPageObject();
        Allure.step("Page objects initialized");
    }

    @Test(description = "Test Listener functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test case verifies the listener functionality within the Dojo.")
    @Epic("Dojo Management")
    @Feature("Listener")
    @Story("User should be able to interact with the listener in the Dojo")
    public void testLogin() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        listner.Listener();
        Allure.step("Interacting with the listener");

        login.logOut();
        Allure.step("Logging out from the application");
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
