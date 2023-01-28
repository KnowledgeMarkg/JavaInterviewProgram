import java.util.Scanner;

public class smallestNumberInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int small = arr[0];
        int secSmall = arr[0];
        for (int i = 0; i < n; i++) {
            if (small > arr[i]) {
                small = arr[i];
            }
        }
        for (int i=1; i<n; i++){
            if (secSmall > arr[i] && small < arr[i]) {
                secSmall = arr[i];
            }
        }
        System.out.println(small);
        System.out.println(secSmall);
    }
}
