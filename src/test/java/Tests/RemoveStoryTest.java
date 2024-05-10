package Tests;

import PageObjects.LoginPageObject;
import PageObjects.RemoveStoryObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveStoryTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private RemoveStoryObject remove;

    @BeforeMethod

    public void setUp(){

        login = new LoginPageObject();
        remove = new RemoveStoryObject();

    }



    @Test(description = "Test Remove story functionality")
    public void removeStory() throws InterruptedException {
        login.navigateTo();
        login.login();
        remove.removeStory();
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
