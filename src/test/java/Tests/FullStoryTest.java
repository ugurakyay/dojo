package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryPageObject;
import PageObjects.StoryActionsPageObject;
import PageObjects.StoryStatesPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FullStoryTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private StoryPageObject Story;
    private StoryActionsPageObject Actions;
    private StoryStatesPageObject States;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        Story = new StoryPageObject();
        Actions = new StoryActionsPageObject();
        States = new StoryStatesPageObject();
        Allure.step("Page objects initialized");
    }

    @Test(description = "Test full story creation and manipulation")
    @Severity(SeverityLevel.CRITICAL)
    @Description("This test case verifies the full process of creating, manipulating, and deploying a story.")
    @Epic("Story Management")
    @Feature("Create and Manage Story")
    @Story("User should be able to create and manage a story successfully")
    public void FullStory() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        Story.NewStory();
        Allure.step("Creating a new story");

        States.addDetailsNormal();
        Allure.step("Adding normal state details");

        Actions.addEvent();
        Allure.step("Adding Event");

        Actions.addPlayerVarial();
        Allure.step("Adding player variable");

        Actions.requirement();
        Allure.step("Adding Requirement");

        Actions.stateAction();
        Allure.step("Performing state action");

        Actions.deleteStateAction();
        Allure.step("Deleting state action");

        States.addEndState();
        Allure.step("Adding End State");

        Actions.zoomOut();
        Allure.step("Zooming out");

        Actions.deployButton();
        Allure.step("Deploying the story");

        Actions.deployButton();
        Allure.step("UnDeploy Story");

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
