package tests;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.Test;

public class FillUserDataTest extends TestBase {
    Faker faker = new Faker();
    String userName = faker.name().firstName(),
            userSurname = faker.name().lastName(),
            userEmail = faker.internet().emailAddress(),
            userGender = "Female",
            userPhone = faker.phoneNumber().subscriberNumber(10),
            userBirthday = "04",
            userBirthMonth = "November",
            userBirthYear = "1984",
            subject = "Maths",
            hobbies = "Sports",
            picture = "frog.jpg",
            currentAddress = faker.address().fullAddress(),
            state = "NCR",
            city = "Delhi";
    @Test
    void successfulFillUserDataTest() {


        registrationPage.openPage()
                .setFirstName(userName)
                .setLastName(userSurname)
                .setEmail(userEmail)
                .setGender(userGender)
                .setPhone(userPhone)
                .setBirthDate(userBirthday, userBirthMonth, userBirthYear)
                .subjectsInput(subject)
                .hobbiesInput(hobbies)
                .uploadPicture(picture)
                .setCurrentAddress(currentAddress)
                .chooseState(state)
                .chooseCity(city)
                .pressSubmit();

        registrationPage.verifyResultsModalAppears()
                .verifyResults("Student Name", userName + " " + userSurname)
                .verifyResults("Student Email", userEmail)
                .verifyResults("Gender", userGender)
                .verifyResults("Mobile", userPhone)
                .verifyResults("Date of Birth", userBirthday + " " + userBirthMonth + "," +  userBirthYear)
                .verifyResults("Subjects", subject)
                .verifyResults("Hobbies", hobbies)
                .verifyResults("Picture", picture)
                .verifyResults("Address", currentAddress)
                .verifyResults("State and City", state + " " + city);

    }
}
