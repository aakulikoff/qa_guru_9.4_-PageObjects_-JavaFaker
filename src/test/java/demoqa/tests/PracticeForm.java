package demoqa.tests;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static demoqa.tests.TestData.*;

public class PracticeForm extends TestBase{


    @Test
    void registrationFormTest () {
        registrationPage.checkRegistartionPage();
        registrationPage.setUserData(firstname,lastName,userEmail,userNumber)
                        .setGender(gender)
                        .setDateOfBirth(monthOfBirth,yearOfBirth)
                        .setSubject(subject)
                        .setHobby(hobby)
                        .uploadImg(picture)
                        .setAdresses(currentAddress,state,city)
                        .submit()
                        .checkForm(firstname,lastName,userEmail, gender)
                        .checkResultWindow(firstname,lastName,userEmail,gender,
                                userNumber, dayOfBirth,monthOfBirth,yearOfBirth,
                                subject,hobby,picture,currentAddress, state,city);





    }
}
