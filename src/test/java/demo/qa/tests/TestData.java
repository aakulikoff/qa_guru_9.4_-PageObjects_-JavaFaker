package demo.qa.tests;

import com.github.javafaker.Faker;
import demo.qa.utils.RandomUtils;

public class TestData {

    Faker faker = new Faker();
//    Faker faker = new Faker (new Locale("ru"));


    public String
            firstname = RandomUtils.getRandomString(10),
            lastName = faker.lordOfTheRings().character(),
            userEmail = RandomUtils.getRandomEmail(),
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
