package arrayInObject;

/**
 * @author Mujahid a.k.a hitzvera
 * date: 03 Jun, 2021
 */
public class DataMahasiswa {
    public static void main(String[] args) {

        int maxSize = 100;
        ManageMahasiswa manageMahasiswa = new ManageMahasiswa(maxSize);
        manageMahasiswa.insert("1197050093", "Mujahid", 19);
        manageMahasiswa.insert("1197050090", "Farhan", 20);
        manageMahasiswa.insert("1197050001", "Hilmy", 20);
        manageMahasiswa.insert("1197050030", "Yude", 20);
        System.out.println("Data Mahasiswa: ");
        manageMahasiswa.display();
    }
}
