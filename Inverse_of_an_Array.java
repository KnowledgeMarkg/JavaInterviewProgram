import java.util.Arrays;
import java.util.Scanner;

public class Inverse_of_an_Array {
    public static void inverse(int []a,int n){
        for(int i =0; i<n ;i++){
            int d = a[i];
            a[d] = i;
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a= new int[n];
        for (int i = 0; i < n; i++) {
//            int []b = new int[n];
//            b[i] = sc.nextInt();
//            if(b[i]>n){
//                System.out.println("Enter the element less than size of an array");
//            }
//            else{
//                a[i] = b[i];
//            }
            a[i] = sc.nextInt();
        }
        inverse(a, n);
    }
}
