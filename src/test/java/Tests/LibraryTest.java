package Tests;

import PageObjects.LibraryPageObject;
import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private LibraryPageObject library;

    @BeforeMethod
    public void setUp() {
        login = new LoginPageObject();
        library = new LibraryPageObject();
    }

    @Override
    public void navigateTo() {

    }

    @Test(description = "Test Library functionality")
    public void testLibrary() throws InterruptedException {
        login.navigateTo();
        login.login();
        library.ClickLibrary();
        library.actionTemplate();
        login.logOut();

    }


    @Override
    public boolean isPresent() {
        return false;
    }
}
