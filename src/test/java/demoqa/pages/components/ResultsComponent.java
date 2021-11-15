package demoqa.pages.components;

import demoqa.pages.RegistrationPage;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class ResultsComponent {

    public void checkResultWindow (String firstname, String lastName, String userEmail, String gender,
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

    }

}
