package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryActionsPageObject;
import PageObjects.StoryPageObject;
import PageObjects.StoryStatesPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FullStoryTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private StoryPageObject Story;

    private StoryActionsPageObject Actions;
    private StoryStatesPageObject States;

    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
        Story = new StoryPageObject();
        Actions =new StoryActionsPageObject();
        States=new StoryStatesPageObject();

    }
    @Test(description = "Test login functionality")
    public void FullStory() throws InterruptedException{
        login.navigateTo();
        login.login();
        Story.NewStory();
        States.addDetailsNormal();
        Actions.addEvent();
        Actions.addPlayerVarial();
        Actions.stateAction();
        Actions.deleteStateAction();
        Actions.zoomOut();
        Actions.deployButton();
        login.logOut();
    }
    @Override
    public void navigateTo() {

    }

    @Override
    public boolean isPresent() {
        return false;
    }
}
