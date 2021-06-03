package twoDImensionalArray;

/**
 * @author Mujahid a.k.a hitzvera
 * date: 03 Jun, 2021
 */
public class twoDimensionalArray {
    public static void main(String[] args) {
        int[][] a = {{1,3,4},{3,4,5}};
        int[][] b = {{1,3,4},{3,4,5}};
        int[][] hasil = new int[2][3];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                hasil[i][j] = a[i][j] + b[i][j];
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }
    }
}
