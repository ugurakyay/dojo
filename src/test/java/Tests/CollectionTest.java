package Tests;

import PageObjects.LoginPageObject;
import PageObjects.CollectionsPageObject;
import framework.BaseWebAutomationTest;
import io.qameta.allure.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CollectionTest extends BaseWebAutomationTest {
    private LoginPageObject login;
    private CollectionsPageObject collection;

    @BeforeMethod
    @Step("Setup test environment")
    @Description("This step initializes the test environment and sets up the necessary page objects.")
    public void setUp() {
        login = new LoginPageObject();
        collection = new CollectionsPageObject();
        Allure.step("Page objects initialized");
    }

    @Test(description = "Test Collection functionality")
    @Severity(SeverityLevel.NORMAL)
    @Description("This test case verifies the functionality of adding and sorting collections in the application.")
    @Epic("Collection Management")
    @Feature("Manage Collections")
    @Story("User should be able to add and sort collections successfully")
    public void addCollection() throws InterruptedException {
        login.navigateTo();
        Allure.step("Navigating to login page");

        login.login();
        Allure.step("Logging into the application");

        collection.addCollection();
        Allure.step("Adding a new collection");

        collection.sortCollectionNewst();
        Allure.step("Sorting collection by newest");

        collection.sortCollectionOldest();
        Allure.step("Sorting collection by oldest");

        collection.sortCollectionA_Z();
        Allure.step("Sorting collection A to Z");

        collection.sortCollectionZ_A();
        Allure.step("Sorting collection Z to A");

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
