package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryActionsPageObject;
import PageObjects.StoryPageObject;
import PageObjects.StoryStatesPageObject;
import framework.BaseWebAutomationTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewStoryCreate2Test extends BaseWebAutomationTest {
    private LoginPageObject login;
    private StoryPageObject Story;

    private StoryStatesPageObject States;
    private StoryActionsPageObject Actions;


    @BeforeMethod
    public void setUp() {

        login = new LoginPageObject();
        Story = new StoryPageObject();
        States =new StoryStatesPageObject();
        Actions = new StoryActionsPageObject();
    }

    @Test(description = "Test login functionality")
    public void EndStateTest() throws InterruptedException{
        login.navigateTo();
        login.login();
        Story.NewStory();
        States.addEndState();
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
