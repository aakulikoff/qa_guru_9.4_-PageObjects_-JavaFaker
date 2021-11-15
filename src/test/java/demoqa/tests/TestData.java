package demoqa.tests;

import com.github.javafaker.Faker;

import static demoqa.utils.RandomUtils.getRandomString;

public class TestData extends TestBase{
    Faker faker = new Faker();



    public String
            firstname = getRandomString(10),
            lastName = faker.lordOfTheRings().character(),
            userEmail = faker.internet().emailAddress("testadress"),
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
