import java.util.Scanner;

public class transpose_Of_Matrix {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                a[i][j] = sc.nextInt();
            }

        }
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------------------------");
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                a[j][i] = a[i][j];
            }
        }
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
