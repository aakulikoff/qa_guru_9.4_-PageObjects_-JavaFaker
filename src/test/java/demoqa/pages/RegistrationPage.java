package demoqa.pages;

import com.codeborne.selenide.SelenideElement;
import demoqa.pages.components.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    public CalendarComponent calendar = new CalendarComponent();
    public ResultsComponent results = new ResultsComponent();
    private final String RegistrationPageText = "Student Registration Form";
    private SelenideElement
            fromTitle =  $(".practice-form-wrapper"),
            firstNameInput =  $("#firstName"),
            lastNameInput =   $("#lastName"),
            userEmailInput =    $("#userEmail"),
            userNumberInput =     $("#userNumber"),
            subjectInput =     $("#subjectsInput"),
            hobbyInput =     $("#hobbiesWrapper"),
            uploadImg =      $("#uploadPicture");

    public RegistrationPage checkRegistartionPage() {
       fromTitle.shouldHave(text(RegistrationPageText));

        return this;
    }

    public RegistrationPage setUserData(String firstname, String lastName, String userEmail, String userNumber){
        firstNameInput.setValue(firstname);
        lastNameInput.setValue(lastName);
        userEmailInput.setValue(userEmail);
        userNumberInput.setValue(userNumber);

        return this;
    }


    public RegistrationPage setGender(String gender) {
        $(byText(gender)).click();

        return this;
    }


    public RegistrationPage setSubject(String subject) {
        subjectInput.val(subject).pressEnter();

        return this;
    }

    public RegistrationPage setHobby(String hobby) {
        hobbyInput.$(byText(hobby)).click();
//        $(byText(hobby)).click();

        return this;
    }

    public RegistrationPage uploadImg(String picture) {
        uploadImg.uploadFromClasspath("img/" + picture);

        return this;
    }

    public RegistrationPage setAdresses(String currentAddress, String state, String city) {
        $("#currentAddress").val(currentAddress);
        $("#state").scrollTo().click();
        $("#stateCity-wrapper").$(byText(state)).click();
//        $(byText(state)).click();
        $("#city").click();
//        $(byText(city)).click();
        $("#stateCity-wrapper").$(byText(city)).click();

        return this;
    }

    public RegistrationPage submit () {
        $("#submit").click();

        return this;
    }

    public RegistrationPage checkForm (String firstname, String lastName, String userEmail, String gender) {
        $("#example-modal-sizes-title-lg").shouldHave(text("Thanks for submitting the form"));
        $(".table-responsive").shouldHave(text(firstname + " " + lastName),
                text(userEmail), text(gender));

        return this;
    }

}
