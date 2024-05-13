/**
 * File : MainDAO.java
 * Deskripsi : Main program untuk akses DAO
 * Nama : Aulya Salsabila Khairunnisa
 * NIM  : 24060122140163
 */
public class MainDAO {
    public static void main(String args[]) {
        Person person = new Person("Indra");
        DAOManager m = new DAOManager();
        m.setPersonDAO(new MySQLPersonDAO());
        try {
            m.getPersonDAO().savePerson(person);
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}