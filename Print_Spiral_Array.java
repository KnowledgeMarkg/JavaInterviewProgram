import java.util.Scanner;

/*
Spiral Display
easy
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.
Constraints
1 <= n <= 10^2
1 <= m <= 10^2
-10^9 <= e1, e2, .. n * m elements <= 10^9
Example

Sample Input
3
5
11
12
13
14
15
21
22
23
24
25
31
32
33
34
35
Sample Output
11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
 */
public class Print_Spiral_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]a = new int[n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int r_Min=0;
        int r_Max = n-1;
        int c_Min =0;
        int c_Max =m-1;
        int count =0;
        while (count<n*m){
            //left boundary
            for(int row =r_Min; row<=r_Max && count<n*m; row++){
                System.out.println(a[row][c_Min]);
                count++;
            }
            c_Min++;
            //bottom boundary
            for(int cols=c_Min; cols<=c_Max && count<n*m;cols++){
                System.out.println(a[r_Max][cols]);
                count++;
            }
            r_Max--;
            //right boundary
            for(int row=r_Max;row>=r_Min && count<n*m;row--){
                System.out.println(a[row][c_Max]);
                count++;
            }
            c_Max--;
            // upper boundary
            for(int cols=c_Max; cols>=c_Min && count<n*m;cols--){
                System.out.println(a[r_Min][cols]);
                count++;
            }
            r_Min++;
        }
    }
}
