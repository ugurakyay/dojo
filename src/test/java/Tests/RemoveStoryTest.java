package Tests;

import PageObjects.LoginPageObject;
import PageObjects.RemoveStoryObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveStoryTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private RemoveStoryObject remove;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        remove = new RemoveStoryObject();
        Allure.step("Page objects initialized");
    }

    @Test(description = "Test remove story functionality")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test case verifies the functionality of removing a story from the application.")
    @Epic("Story Management")
    @Feature("Remove Story")
    @Story("User should be able to remove a story successfully")
    public void removeStory() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        remove.removeStory();
        Allure.step("Removing the story");

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
