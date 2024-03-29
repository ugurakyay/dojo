package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CancelStoryTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private StoryPageObject Story;


    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
        Story = new StoryPageObject();
    }


    @Test(description = "Test login functionality")
    public void CancelStory() throws InterruptedException {
        login.navigateTo();
        login.login();
        Story.CloseStory();
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
