import com.bridgelabz.UserRegistration.UserRegistrationInput;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationInput userRegistrationInput = new UserRegistrationInput();

    @Test
    public void givenValidFirstName_shouldReturnTrue() {
        boolean result = userRegistrationInput.isFirstNameValid("Prem");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInvalidFirstName_shouldReturnFalse() {
        boolean result = userRegistrationInput.isFirstNameValid("prem");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenValidLastName_shouldReturnTrue() {
        boolean result = userRegistrationInput.isLastNameValid("Kumbhar");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInvalidLastName_shouldReturnFalse() {
        boolean result = userRegistrationInput.isFirstNameValid("kumbhar");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenValidEmail_shouldReturnTrue() {
        boolean result = userRegistrationInput.isEmailValid("premk123@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInvalidEmail_shouldReturnFalse() {
        boolean result = userRegistrationInput.isEmailValid("premk123gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenValidMobileNumber_shouldReturnTrue() {
        boolean result = userRegistrationInput.isMobileNumberValid("7350447788");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInvalidMobileNumber_shouldReturnFalse() {
        boolean result = userRegistrationInput.isMobileNumberValid("73504477");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenValidPassword_shouldReturnTrue() {
        boolean result = userRegistrationInput.isPasswordValid("Prem@123");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenInvalidPassword_shouldReturnFalse() {
        boolean result = userRegistrationInput.isPasswordValid("prem123");
        Assertions.assertFalse(result);
    }
}