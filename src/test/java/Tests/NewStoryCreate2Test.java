package Tests;

import PageObjects.LoginPageObject;
import PageObjects.StoryDetailPageObject;
import PageObjects.StoryPageObject;
import framework.BaseWebAutomationTest;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewStoryCreate2Test extends BaseWebAutomationTest {
    private LoginPageObject login;
    private StoryPageObject Story;

    private StoryDetailPageObject Details;


    @BeforeMethod
    public void setUp() {

        login = new LoginPageObject();
        Story = new StoryPageObject();
        Details =new StoryDetailPageObject();
    }

    @Test(description = "Test login functionality")
    public void EndStateTest() throws InterruptedException{
        login.navigateTo();
        login.login();
        Story.NewStory();
        Details.AddEndState();
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
