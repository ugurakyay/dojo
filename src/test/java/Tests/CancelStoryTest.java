package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CancelStoryTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private StoryPageObject Story;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        Story = new StoryPageObject();
        Allure.step("Page objects initialized");
    }

    @Test(description = "Test cancel story functionality")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test case verifies the functionality of canceling a story in the application.")
    @Epic("Story Management")
    @Feature("Cancel Story")
    @Story("User should be able to cancel a story successfully")
    public void CancelStory() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        Story.CloseStory();
        Allure.step("Closing the story");

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
