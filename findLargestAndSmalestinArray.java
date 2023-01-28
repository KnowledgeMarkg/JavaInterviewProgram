import java.util.Scanner;

public class findLargestAndSmalestinArray {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Number OF Element In Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        int largest = arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]<arr[0]){
                small = arr[i];
            }
            if(arr[i]>arr[0]){
                largest = arr[i];
            }
        }
        System.out.println("smallest Number: " +small);
        System.out.println("Largest Number: " +largest);
    }
}
