/**
 * RegistrationValidator.java 19/03/24
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Interface, berisi abstraksi Pendaftaran
 */
import java.util.regex.Pattern;
 
// Interface untuk validasi kolom isian pada registrasi akun
public interface RegistrationValidator {
    boolean validate(String input);
}