package demoqa.tests;

import com.codeborne.selenide.Configuration;
import demoqa.pages.RegistrationPage;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class TestBase extends TestData{

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll () {
        Configuration.startMaximized = true;
    }

    @BeforeEach
    void openPracticeForm(){
        open("https://demoqa.com/automation-practice-form");
    }

}
