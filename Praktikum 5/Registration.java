/**
 * Registration.java 19/03/24
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Interface, berisi abstraksi Pendaftaran
 */

// Importing Pattern class from java.util.regex package
import java.util.regex.Pattern;

// Implementasi untuk validasi kolom isian username
class UsernameValidator implements RegistrationValidator {
    @Override
    public boolean validate(String input) {
        return !input.isEmpty();
    }
}

// Implementasi untuk validasi kolom isian name
class NameValidator implements RegistrationValidator {
    @Override
    public boolean validate(String input) {
        // Regular expression for validating name format
        String nameRegex = "^[a-zA-Z ]+$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(nameRegex);

        // Match the input name with the regex pattern
        return pattern.matcher(input).matches();
    }
}

// Implementasi untuk validasi kolom isian phone_number
class PhoneNumberValidator implements RegistrationValidator {
    @Override
    public boolean validate(String input) {
        // Check if input is not empty and consists of digits only
        return !input.isEmpty() && input.matches("[0-9]+");
    }
}

// Implementasi untuk validasi kolom isian email
class EmailValidator implements RegistrationValidator {
    @Override
    public boolean validate(String input) {
        // Regular expression for validating email format
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(emailRegex);

        // Match the input email with the regex pattern
        return pattern.matcher(input).matches();
    }
}

// Implementasi untuk validasi kolom isian password
class PasswordValidator implements RegistrationValidator {
    @Override
    public boolean validate(String input) {
        // Check if password length is at least 8 characters
        if (input.length() < 8) {
            return false;
        }

        // Check if password contains at least one lowercase letter
        boolean hasLowerCase = !input.equals(input.toUpperCase());

        // Check if password contains at least one uppercase letter
        boolean hasUpperCase = !input.equals(input.toLowerCase());

        // Check if password contains at least one digit
        boolean hasDigit = input.matches(".*\\d.*");

        // Return true if password meets all criteria
        return hasLowerCase && hasUpperCase && hasDigit;
    }
}

// Implementasi untuk registrasi melalui Google
class GoogleRegistration implements RegistrationValidator {
    @Override
    public boolean validate(String email) {
        return email.equals("pboa1@gmail.com");
    }
}

// Implementasi untuk registrasi melalui Facebook
class FacebookRegistration implements RegistrationValidator {
    @Override
    public boolean validate(String email) {
        return email.equals("pboa1@gmail.com");
    }
}

// Implementasi untuk registrasi melalui Apple
class AppleRegistration implements RegistrationValidator {
    @Override
    public boolean validate(String email) {
        return email.equals("pboa1@gmail.com");
    }
}