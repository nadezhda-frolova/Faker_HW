package tests;

import com.github.javafaker.Faker;
import pages.RegistrationPage;
public class TestBase {

    RegistrationPage registrationPage = new RegistrationPage();
    String userName;
    String userSurname;
    String userEmail;
    String userGender;
    String userPhone;
    String userBirthday;
    String userBirthMonth;
    String userBirthYear;
    String subject;
    String hobbies;
    String picture;
    String currentAddress;
    String state;
    String city;

}
