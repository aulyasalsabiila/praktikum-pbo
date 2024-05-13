/**
 * File : DAOManager.java
 * Deskripsi : pengelola DAO dalam program
 * Nama : Aulya Salsabila Khairunnisa
 * NIM  : 24060122140163
 */
public class DAOManager {
    private PersonDAO personDAO;

    public void setPersonDAO(PersonDAO person) {
        personDAO = person;
    }

    public PersonDAO getPersonDAO() {
        return personDAO;
    }
}