package demoqa.tests;

import com.codeborne.selenide.*;
import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static demoqa.tests.TestBase.*;



public class PracticeFormTests extends TestBase{



    @Test
    void registrationFormTest () {
        registrationPage.checkRegistartionPage();
        registrationPage.calendar.setDateOfBirth(monthOfBirth, yearOfBirth);
        registrationPage.setUserData(firstname,lastName,userEmail,userNumber)
                        .setGender(gender)
                        .setSubject(subject)
                        .setHobby(hobby)
                        .uploadImg(picture)
                        .setAdresses(currentAddress,state,city)
                        .submit()
                        .checkForm(firstname,lastName,userEmail, gender)
                        .results.checkResultWindow(firstname,lastName,userEmail,gender,
                                userNumber, dayOfBirth,monthOfBirth,yearOfBirth,
                                subject,hobby,picture,currentAddress, state,city);

    }


}
