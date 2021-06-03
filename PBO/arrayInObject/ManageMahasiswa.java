package arrayInObject;

/**
 * @author Mujahid a.k.a hitzvera
 * date: 03 Jun, 2021
 */
public class ManageMahasiswa {

    private Mahasiswa[] data;
    private int n;

    public ManageMahasiswa(int max)
    {
        data = new Mahasiswa[max];
        n = 0;
    }

    public void insert(String nim, String nama, int umur)
    {
        data[n] = new Mahasiswa(nim, nama, umur);
        n++;
    }

    public void display(){
        for(int i=0;i < n;i++)
        {
            System.out.println((i+1) + ". ");
            data[i].displayMhs();
        }
    }
}
