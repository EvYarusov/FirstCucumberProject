package com.ait.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[contains(.,'Sign Out')]")
    WebElement signOutButton;

    public ProfilePage isSignOutButtonDisplayed() {
        isElementDisplayed(signOutButton);
        return this;
    }

    @FindBy(css = "a:nth-child(5)")
    WebElement addLink;

    public ProfilePage clickOnAddLink() {
        click(addLink);
        return this;
    }

    @FindBy(css = "input:nth-child(1)")
    WebElement nameField;
    @FindBy(css = "input:nth-child(2)")
    WebElement lastNameField;
    @FindBy(css = "input:nth-child(3)")
    WebElement phoneField;
    @FindBy(css = "input:nth-child(4)")
    WebElement emailField;
    @FindBy(css = "input:nth-child(5)")
    WebElement addressField;
    @FindBy(css = "input:nth-child(6)")
    WebElement descrField;

    public ProfilePage enterValidContactData(
            String name, String lastName, String phone, String email, String address, String description
    ) {
        type(nameField, name);
        type(lastNameField, lastName);
        type(phoneField, phone);
        type(emailField, email);
        type(addressField, address);
        type(descrField, description);
        return this;
    }

    @FindBy(css = ".add_form__2rsm2 button")
    WebElement saveBtn;

    public ProfilePage clickOnSaveButton() {
        click(saveBtn);
        return this;
    }

    @FindBy(css = "h2")
    List<WebElement> contacts;

    public ProfilePage verifyContactCreated(String name) {
        isElementsListContainsText(contacts, name);
        return this;
    }
}
