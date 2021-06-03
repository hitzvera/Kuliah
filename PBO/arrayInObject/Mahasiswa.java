package arrayInObject;

/**
 * @author Mujahid a.k.a hitzvera
 * date: 03 Jun, 2021
 */
public class Mahasiswa {

    private String nimMhs;
    private String nameMhs;
    private int umurMhs;

    public Mahasiswa()
    {
        nimMhs = "";
        nameMhs = "";
        umurMhs = 0;
    }

    public Mahasiswa(String nimMhs, String nameMhs, int umurMhs)
    {
        this.nimMhs = nimMhs;
        this.nameMhs = nameMhs;
        this.umurMhs = umurMhs;
    }

    public void displayMhs() {
        System.out.println("NIM: " + nimMhs);
        System.out.println("Nama: " + nameMhs);
        System.out.println("Umur: " + umurMhs);
    }

    public String getNimMhs() {
        return nimMhs;
    }

    public void setNimMhs(String nimMhs) {
        this.nimMhs = nimMhs;
    }

    public String getNameMhs() {
        return nameMhs;
    }

    public void setNameMhs(String nameMhs) {
        this.nameMhs = nameMhs;
    }

    public int getUmurMhs() {
        return umurMhs;
    }

    public void setUmurMhs(int umurMhs) {
        this.umurMhs = umurMhs;
    }
}
