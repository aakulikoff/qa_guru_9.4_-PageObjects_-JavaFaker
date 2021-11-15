package demoqa.tests;

import com.github.javafaker.Faker;

import java.util.Locale;

import static demoqa.utils.RandomUtils.*;

public class TestData extends TestBase{
    Faker faker = new Faker();
//    Faker faker = new Faker (new Locale("ru"));



    public String
            firstname = getRandomString(10),
            lastName = faker.lordOfTheRings().character(),
            userEmail = getRandomEmail(),
            userNumber = faker.phoneNumber().subscriberNumber(10),
            gender = "Female",
            monthOfBirth = "August",
            yearOfBirth = "1988",
            dayOfBirth = "3",
            subject = "Arts",
            picture = "pic.jpg",
            hobby = "Music",
            currentAddress = faker.gameOfThrones().city() + faker.witcher().location(),
            state = "NCR",
            city = "Delhi";
}
