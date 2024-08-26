package Tests;

import PageObjects.LibraryPageObject;
import PageObjects.LoginPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryCreateTest extends BaseWebAutomationTest {

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

    @Test(description = "Test Library creation functionality")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test case verifies the functionality of creating a library event.")
    @Epic("Library Management")
    @Feature("Create Library Event")
    @Story("User should be able to create a library event successfully")
    public void LibraryCreate() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        library.ClickLibrary();
        Allure.step("Clicking on the Library");

        library.AddNewEvent();
        Allure.step("Adding a new event");

        //library.addNewEvent2();
        //Allure.step("Adding a second new event");

        library.dojoEvents();
        Allure.step("Clicking on Dojo events");

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
