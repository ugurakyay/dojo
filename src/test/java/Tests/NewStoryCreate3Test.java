package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryPageObject;
import PageObjects.StoryStatesPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewStoryCreate3Test extends BaseWebAutomationTest {
    private LoginPageObject login;
    private StoryPageObject Story;

    private StoryStatesPageObject States;
    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
        Story = new StoryPageObject();
        States=new StoryStatesPageObject();
    }

    @Test(description = "Test login functionality")
    public void EndStateTest() throws InterruptedException{
        login.navigateTo();
        login.login();
        Story.NewStory();
        States.oneEventState();
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
