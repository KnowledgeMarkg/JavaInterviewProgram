import java.util.Scanner;

public class span_Of_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i]= sc.nextInt();
        }
        int max=arr[0];
        for(int i=0; i<n;i++){
            if(max<arr[i]){
                 max=arr[i];
            }
        }
        int min = arr[0];
        for(int i=0; i<n ; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        int difference = max-min;
        System.out.println(difference);
    }
}
