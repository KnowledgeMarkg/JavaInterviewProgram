import java.util.Scanner;
/*
Saddle Price
easy
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix.
2. You are required to find the saddle price of the given matrix and print the saddle price.
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Example
Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
Sample Output
41
 */
public class Saddle_price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [][]a = new int[n][n];
        for(int i=0; i<n;i++){
            for(int j=0; j<n; j++){
                a[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            int min= a[i][0];
            int column=0;
            for(int col=1;col<n;col++){
                if(a[i][col]<min){
                    min=a[i][col];
                    column =col;
                }
            }
            // Varification
            boolean ans =true;
            for(int row=0; row<n;row++){
                if(a[row][column]>min){
                    ans = false;
                    break;
                }
        }
            if(ans==true){
                System.out.println(min);
                return;
            }
        }
        System.out.println("Invalid input");
    }
}
