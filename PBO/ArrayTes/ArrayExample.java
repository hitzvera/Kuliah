package arrayTesPackage;

/**
 * @author Mujahid a.k.a hitzvera
 * date: 03 Jun, 2021
 */
public class ArrayExample {
    public static void main(String[] args) {
        String[] dataProdi;

        // latihan 1
        dataProdi = new String[]{"Administrasi",
                "Agroteknologi", "Teknik ELektro",
                "Bahasa Arab", "Bahasa Inggris",
                "Teknik informatika", "Fisika",
                "Kimia", "Biologi", "Managemen"
        };
        System.out.println("-- Latihan 1 --");
        System.out.println(dataProdi[1] + "\n" + dataProdi[3] + "\n" +  dataProdi[5]);
        System.out.println();
        System.out.println("-- Latihan 2 --");
        // latihan 2
        for(int i=0; i<dataProdi.length;i++)
        {
            if(i == 3)
                continue;
            System.out.println(dataProdi[i]);
        }
    }
}
