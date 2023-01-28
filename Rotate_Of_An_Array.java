import java.io.*;

public class Rotate_Of_An_Array{
    public static void inverse(int[] a, int i , int m){
        // write your code here
        // int m = a.length-1;
        //   int i= 0;
        while(i<m){
            int temp = a[i];
            a[i]= a[m];
            a[m] = temp;
            m--;
            i++;
        }
    }
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();

        for(int val: a){
            sb.append(val + " ");
        }
        System.out.println(sb);
    }

    public static void rotate(int[] a, int k){
        int m = a.length;
        k = k%m;  // k ko array ke lenght me lane ke liye
        if(k<0){ // k ki value yadi negative hai to positive banane ke liye
            k+=m;
        }
        inverse(a, 0, m-1);   // inverse whole array
        inverse(a, 0, k-1); // inverse 0 to diya huaa rotation value -1
        inverse(a, k, m-1);  // inverse diya huaa rotation value to array lenght -1
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());

        rotate(a, k);
        display(a);
    }

}