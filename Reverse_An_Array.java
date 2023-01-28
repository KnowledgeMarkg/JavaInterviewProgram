import java.util.Arrays;
import java.util.Scanner;

public class Reverse_An_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i =0 ; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int m = arr.length-1;
        int i= 0;
        while(i<m){
            int temp = arr[i];
            arr[i]= arr[m];
            arr[m] = temp;
            //System.out.println(Arrays.toString(arr));
            m--;
            i++;

        }
    }
}
