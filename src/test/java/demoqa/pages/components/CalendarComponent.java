package demoqa.pages.components;

import com.codeborne.selenide.SelenideElement;
import demoqa.pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.$;

public class CalendarComponent {
    private SelenideElement

            monthOfBirthSelect =     $(".react-datepicker__month-select"),
            yearOfBirthSelect =     $(".react-datepicker__year-select"),
            dayOfBirthSelect =     $("[aria-label='Choose Wednesday, August 3rd, 1988']");

    public void setDateOfBirth(String monthOfBirth, String yearOfBirth) {
        $("#dateOfBirthInput").click();
        monthOfBirthSelect.selectOption(monthOfBirth);
        yearOfBirthSelect.selectOption(yearOfBirth);
        dayOfBirthSelect.click();
    }
}
