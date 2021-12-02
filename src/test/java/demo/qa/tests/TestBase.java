package demo.qa.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import demo.qa.pages.RegistrationPage;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Selenide.open;

public class TestBase extends TestData{

    RegistrationPage registrationPage = new RegistrationPage();

    @BeforeAll
    static void beforeAll () {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide());
        Configuration.startMaximized = true;
        Configuration.remote = "https://user1:1234@selenoid.autotests.cloud/wd/hub/";
    }

    @BeforeEach
    void openPracticeForm(){
        open("https://demoqa.com/automation-practice-form");
    }

}
