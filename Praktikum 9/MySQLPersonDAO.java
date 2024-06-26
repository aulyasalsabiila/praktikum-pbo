import java.sql.*;
/**
 * File : MySQLPersonDAO.java
 * Deskripsi : implementasi PersonDao untuk MySQL
 * Nama : Aulya Salsabila Khairunnisa
 * NIM  : 24060122140163
 */
public class MySQLPersonDAO implements PersonDAO {
    public void savePerson(Person person) throws Exception {
        String name = person.getName();
        //membuat koneksi, nama db, user, password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3380/PBO","root","aulyasalsabila12");
        //kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);
        //tutup koneksi database
        con.close();
    }
}