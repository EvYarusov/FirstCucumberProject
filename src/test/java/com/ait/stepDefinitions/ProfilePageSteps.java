package com.ait.stepDefinitions;

import com.ait.pages.ProfilePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

import static com.ait.pages.BasePage.driver;

public class ProfilePageSteps {
    @And("User clicks on ADD link")
    public void click_ADD_link() {
        new ProfilePage(driver).clickOnAddLink();
    }

    @And("User enters valid data in Add contact form")
    public void enter_valid_contact_data() {
        new ProfilePage(driver).enterValidContactData(
                "Mark",
                "Karlov",
                "1234567890",
                "mark@gm.co",
                "Marder str.",
                "friend will be friend"
        );
    }
    @And("User clicks on Save button")
    public void click_Save_button() {
        new ProfilePage(driver).clickOnSaveButton();
    }
    @Then("User verifies Contact is added")
    public void verify_Contact_added() {
        new ProfilePage(driver).verifyContactCreated("Mark");
    }
}
