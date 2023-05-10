package com.ait.stepDefinitions;

import com.ait.pages.LoginPage;
import com.ait.pages.ProfilePage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import static com.ait.pages.BasePage.driver;

public class LoginPageSteps {
    @And("User enters valid data")
    public void enter_valid_data() {
        new LoginPage(driver).enterData("manul-j@gmail.com", "Manul1234$");
    }

    @And("User clicks on Login button")
    public void click_Login_button() {
        new LoginPage(driver).clickOnLoginButton();
    }

    @Then("User verifies SignOut button is displayed")
    public void verify_SignOut_button_displayed() {
        new ProfilePage(driver).isSignOutButtonDisplayed();
    }

    @And("User enters valid email and wrong password")
    public void enter_wrong_password(DataTable table) {
        new LoginPage(driver).enterWrongPassword(table);
    }

    @Then("User verifies Alert is appeared")
    public void verify_Alert_appeared() {
        new LoginPage(driver).isAlertPresent();
    }
}
