import java.util.Scanner;

public class Two_D_Array_Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]a = new int[n][m];
        // Input of 2D Array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        // Print 2D Array
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
