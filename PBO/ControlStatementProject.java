package ControlStatementProject;
import java.util.Scanner;

/**
 * @author Mujahid a.k.a hitzvera
 * date: 27 May, 2021
 */
public class ControlStatementProject {

    String OddorEven(int x)
    {
        return (x%2==0) ? "Genap":"Ganjil";
    }

    boolean leapYear(int x)
    {
        if(x % 400 == 0) return true;
        else if (x % 100 == 0) return false;
        else if (x % 4 == 0) return true;
        else return false;
    }

    public static void main(String[] args) {
        // deklarasi
        Scanner scan = new Scanner(System.in);
        int month, year;
        ControlStatementProject controlStatementProject = new ControlStatementProject();

        //input dari user
        System.out.print("Masukan bulan: ");
        month = scan.nextInt();
        System.out.print("Masukan tahun: ");
        year = scan.nextInt();

        System.out.println("Informasi dari bulan ke-" + month + " Tahun " + year);
        // manggil fungsi odd atau even
        System.out.println("1. Merupakan bulan " + controlStatementProject.OddorEven(month));
        System.out.print("2. Jumlah ");
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 hari");
                break;

            case 2:
                if(controlStatementProject.leapYear(year))
                    System.out.println("29 hari");
                else
                    System.out.println("28 hari");
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 hari");
                break;

            default:
                System.out.println("Invalid input.");
                break;
        }
        if (controlStatementProject.leapYear(year)) System.out.println("3. Tahun kabisat!");
        else System.out.println("3. Bukan Tahun kabisat!");
    }
}
