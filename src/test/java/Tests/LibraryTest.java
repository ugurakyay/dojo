package Tests;

import PageObjects.LibraryPageObject;
import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryTest extends BaseWebAutomationTest {

    private LoginPageObject login;
    private LibraryPageObject library;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        library = new LibraryPageObject();
        Allure.step("Page objects initialized");
    }

    @Test(description = "Test Library functionality")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test case verifies the basic functionality of interacting with the library.")
    @Epic("Library Management")
    @Feature("Interact with Library")
    @Story("User should be able to interact with the library successfully")
    public void testLibrary() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        library.ClickLibrary();
        Allure.step("Clicking on the Library");

        library.actionTemplate();
        Allure.step("Interacting with action templates");

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
