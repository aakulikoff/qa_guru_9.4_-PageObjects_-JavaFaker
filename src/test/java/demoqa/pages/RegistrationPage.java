package demoqa.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {
    private final String RegistrationPageText = "Student Registration Form";
    private SelenideElement
            fromTitle =  $(".practice-form-wrapper"),
            firstNameInput =  $("#firstName"),
            lastNameInput =   $("#lastName"),
            userEmailInput =    $("#userEmail"),
            userNumberInput =     $("#userNumber"),
            monthOfBirthSelect =     $(".react-datepicker__month-select"),
            yearOfBirthSelect =     $(".react-datepicker__year-select"),
            dayOfBirthSelect =     $("[aria-label='Choose Wednesday, August 3rd, 1988']"),
            subjectInput =     $("#subjectsInput"),
            hobbyInput =     $("#hobbiesWrapper"),
            uploadImg =      $("#uploadPicture");

    public void checkRegistartionPage() {
       fromTitle.shouldHave(text(RegistrationPageText));
    }

    public RegistrationPage setUserData(String firstname, String lastName, String userEmail, String userNumber){
        firstNameInput.setValue(firstname);
        lastNameInput.setValue(lastName);
        userEmailInput.setValue(userEmail);
        userNumberInput.setValue(userNumber);

        return this;
    }

    public RegistrationPage setDateOfBirth(String monthOfBirth, String yearOfBirth) {
        $("#dateOfBirthInput").click();
        monthOfBirthSelect.selectOption(monthOfBirth);
        yearOfBirthSelect.selectOption(yearOfBirth);
        dayOfBirthSelect.click();

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

    public RegistrationPage checkResultWindow (String firstname, String lastName, String userEmail, String gender,
                                  String userNumber, String dayOfBirth, String monthOfBirth, String yearOfBirth,
                                  String subject, String hobby, String picture, String currentAddress, String state, String city ) {

        //        Проверка данных во всплывающем окне
        $(byText("Student Name")).parent()
                .shouldHave(text(firstname + " " + lastName));
//        $x("//td[text()='Student Name']").parent().shouldHave(text(firstname + " " + lastName));
        $x("//td[text()='Student Email']").parent().shouldHave(text(userEmail));
        $x("//td[text()='Gender']").parent().shouldHave(text(gender));
        $x("//td[text()='Mobile']").parent().shouldHave(text(userNumber));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text(dayOfBirth + " " + monthOfBirth + "," + yearOfBirth));
        $x("//td[text()='Subjects']").parent().shouldHave(text(subject));
        $x("//td[text()='Hobbies']").parent().shouldHave(text(hobby));
        $x("//td[text()='Picture']").parent().shouldHave(text(picture));
        $x("//td[text()='Address']").parent().shouldHave(text(currentAddress));
        $x("//td[text()='State and City']").parent().shouldHave(text(state + " " + city));

        return this;
    }

}
