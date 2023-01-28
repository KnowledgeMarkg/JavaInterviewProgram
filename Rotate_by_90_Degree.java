/*
Rotate By 90 Degree
easy
1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*
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
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14
 */
import java.util.Scanner;
public class Rotate_by_90_Degree {
    public static void display(int [][]a){
        for(int i=0; i< a.length; i++){
            for(int j=0; j< a.length; j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int m = sc.nextInt();
        int [][]a =new int[n][n];
        for(int i=0; i<n ; i++){
            for(int j=0; j<n; j++){
                a[i][j]=sc.nextInt();
            }
        }
        // Transpose Of A Matrix
        for(int i=0; i<a.length-1;i++){
            for(int j=i+1; j<a.length; j++){
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] =temp;
            }
        }
        // reverse left to right ...
        int left =0;
        int right =a.length-1;
        while(left<right){
            for(int row =0 ; row< a.length;row++){
                int temp = a[row][left];
                a[row][left] = a[row][right];
                a[row][right] = temp;
            }
            left++;
            right--;
        }
        display(a);
    }

}
