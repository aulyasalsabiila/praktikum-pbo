/**
 * UserUseCase.java 19/03/24
 * Penulis   : Aulya Salsabila Khairunnisa
 * Deskripsi : Kelas abstrak, berisi abstraksi Penggunaan User
 */

// Implementasi dari UserRepository
public class UserUseCase implements UserRepository {
    @Override
    public void loginUser(String username, String password) {
        if (username.equals("aulyasalsabila") && password.equals("praktikumPBO_5")) {
            System.out.println("Halo, Selamat Datang!");
        } else {
            System.out.println("Maaf, Username atau Password yang Anda masukkan salah.");
        }
    }

    @Override
    public void logoutUser() {
        System.out.print("Terimakasih, Silahkan Datang Kembali!");
    }
}