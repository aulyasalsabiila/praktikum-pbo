/**
 * UserRepository.java 19/03/24
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Interface, berisi abstraksi Login dan Logout
 */

// Interface untuk operasi pada pengguna
public interface UserRepository {
    void loginUser(String username, String password);
    void logoutUser();
}