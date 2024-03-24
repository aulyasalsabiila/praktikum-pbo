/**
 * MUser.java 19/03/24
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Kelas abstrak, berisi abstraksi Main
 */
import java.util.Scanner;

// Kelas utama yang berisi metode main
public class MUser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for registration
        System.out.print("Enter your username     : ");
        String username = scanner.nextLine();

        System.out.print("Enter your name         : ");
        String name = scanner.nextLine();

        System.out.print("Enter your phone number : ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your email        : ");
        String email = scanner.nextLine();

        System.out.print("Enter your password     : ");
        String password = scanner.nextLine();

        // Clear input buffer
        scanner.nextLine();

        // Validate registration input
        RegistrationValidator usernameValidator = new UsernameValidator();
        RegistrationValidator nameValidator = new NameValidator();
        RegistrationValidator phoneNumberValidator = new PhoneNumberValidator();
        RegistrationValidator emailValidator = new EmailValidator();
        RegistrationValidator passwordValidator = new PasswordValidator();

        boolean isUsernameValid = usernameValidator.validate(username);
        boolean isNameValid = nameValidator.validate(name);
        boolean isPhoneNumberValid = phoneNumberValidator.validate(phoneNumber);
        boolean isEmailValid = emailValidator.validate(email);
        boolean isPasswordValid = passwordValidator.validate(password);

        if (isUsernameValid && isNameValid && isPhoneNumberValid && isEmailValid && isPasswordValid) {
            // Registration successful
            System.out.println("Registration successful!");

            // Clear input buffer
            scanner.nextLine();
            
            // Proceed with login if registration is successful
            System.out.print("Enter your username for login: ");
            String loginUsername = scanner.nextLine();

            System.out.print("Enter your password for login: ");
            String loginPassword = scanner.nextLine();

            // Clear input buffer
            scanner.nextLine();

            // Perform login
            UserUseCase userUseCase = new UserUseCase();
            userUseCase.loginUser(loginUsername, loginPassword);

            // Setelah operasi yang diperlukan dilakukan, panggil metode logout
            userUseCase.logoutUser();
        } else {
            // Registration failed
            System.out.println("Registration failed. Please check your inputs and try again.");
        }

        scanner.close();
    }
}