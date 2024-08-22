package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryActionsPageObject;
import PageObjects.StoryPageObject;
import PageObjects.StoryStatesPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewStoryCreateTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private StoryPageObject story;
    private StoryStatesPageObject Actions;

    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
        story = new StoryPageObject();
        Actions = new StoryStatesPageObject();
    }

    @Test(description = "Test login functionality")
    public void storyAddNormal() throws InterruptedException {
        login.navigateTo();
        login.login();
        story.NewStory();
        Actions.addDetailsNormal();
        login.logOut();
    }

    @Override
    public void navigateTo() {
        // Implement this if necessary
    }

    @Override
    public boolean isPresent() {
        return false; // Implement this if necessary
    }
}
