package tests;

import com.github.javafaker.Faker;
import pages.RegistrationPage;
public class TestBase {
    Faker faker = new Faker();
    RegistrationPage registrationPage = new RegistrationPage();
    String userName = faker.name().firstName();
    String userSurname = faker.name().lastName();
    String userEmail = faker.internet().emailAddress();
    String userGender = "Female";
    String userPhone = faker.phoneNumber().subscriberNumber(10);
    String userBirthday = "04";
    String userBirthMonth = "November";
    String userBirthYear = "1984";
    String subject = "Maths";
    String hobbies = "Sports";
    String picture = "frog.jpg";
    String currentAddress = faker.address().fullAddress();
    String state = "NCR";
    String city = "Delhi";

}
