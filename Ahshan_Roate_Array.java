
/*
Rotate An Array

easy

1. You are given a number n, representing the size of array a.

2. You are given n numbers, representing elements of array a.

3. You are given a number k.

4. Rotate the array a, k times to the right (for positive values of k), and to

the left for negative values of k.
Constraints

0 <= n < 10^4

-10^9 <= a[i], k <= 10^9
Format
Input

Input is managed for you
Output

Output is managed for you
Example

Sample Input:-
            1 2 3 4 5
            k=2;
Sample Output:-1
            3 4 5 1 2
*/

import java.util.Scanner;

public class Ahshan_Roate_Array {

    static int[] rightRotate(int arr[], int n, int k){
        int temp=arr[n-1];
        for(int i=n-1; i>0; i--){
            arr[i] = arr[i-1];
            arr[i-1] = temp;
        }
        return arr;
    }

    static int[] leftRotate(int arr[], int n, int k){
        int temp=arr[0];
        for(int i=0; i<n-1; i++){
            arr[i] = arr[i+1];
            arr[i+1] = temp;
        }
        return arr;
    }

    static int[] Rotate(int arr[], int n, int k){
        for(int i=0; i<Math.abs(k); i++){
            if(k>0){
                arr=rightRotate(arr, n, k);
            }else if(k<0){
                arr=leftRotate(arr, n, k);
            }else{
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        int n = Sc.nextInt();
        int arr[] = new int[n];
        for (int i=0; i<n; i++){
            arr[i]=Sc.nextInt();
        }
        int k = Sc.nextInt();
        arr = Rotate(arr, n, k);
        for (int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}