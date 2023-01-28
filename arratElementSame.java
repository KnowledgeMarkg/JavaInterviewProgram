import java.util.Scanner;

public class arratElementSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n ; i++){
            arr[i] =sc.nextInt();
        }
        int l = arr.length-1;
        boolean f = true;
        for (int i=0; i<arr.length/2; i++){
            if(arr[i] != arr[l]){
                f = false;
                break;
            }else{
                l= l-1;
            }
        }
        System.out.println(f);
    }
}
