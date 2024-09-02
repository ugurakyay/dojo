package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryActionsPageObject;
import PageObjects.StoryPageObject;
import PageObjects.StoryStatesPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewStoryCreate2Test extends BaseWebAutomationTest {
    private LoginPageObject login;
    private StoryPageObject Story;

    private StoryStatesPageObject States;
    private StoryActionsPageObject Actions;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        Story = new StoryPageObject();
        States = new StoryStatesPageObject();
        Actions = new StoryActionsPageObject();
        Allure.step("Page objects initialized");
    }

    @Test(description = "Test End State functionality in a new story")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test case verifies the functionality of adding an End State to a new story.")
    @Epic("Story Management")
    @Feature("Manage Story States")
    @Story("User should be able to add an End State to a new story")
    public void EndStateTest() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        Story.NewStory();
        Allure.step("Creating a new story");


        States.addEndState();
        Allure.step("Adding an End State to the story");

        Actions.deleteStory();
        Allure.step("Delete Story");

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
