package demoqa.tests;

import com.codeborne.selenide.*;
import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static demoqa.tests.TestBase.*;
import static io.qameta.allure.Allure.step;


public class PracticeFormTests extends TestBase{



    @Test
    void registrationFormTest () {
        step("Open and check registartion form test", () ->
            registrationPage.checkRegistartionPage());
        step("Set date of birth", () ->
                registrationPage.calendar.setDateOfBirth(monthOfBirth, yearOfBirth));

        step("Set user data", () -> {
                    registrationPage.setUserData(firstname, lastName, userEmail, userNumber)
                            .setGender(gender)
                            .setSubject(subject)
                            .setHobby(hobby)
                            .uploadImg(picture)
                            .setAdresses(currentAddress, state, city)
                            .submit()
                            .checkForm(firstname, lastName, userEmail, gender);
                });
        step ("Verify form result", () ->
                registrationPage.results.checkResultWindow());
    }
}
