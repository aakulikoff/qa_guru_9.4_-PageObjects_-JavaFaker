package demo.qa.tests;

import org.junit.jupiter.api.*;


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
                        .results.checkResultWindow();

    }

}
