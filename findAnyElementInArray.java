import java.util.Scanner;

//1.You are given a number n, representing the size of array a.
//        2.You are given n distinct numbers, representing elements of array a.
//        3. You are given another number d.
//        4. You are required to check if d number exists in the array a and at what index (0 based). If found print the index, otherwise print -1.
//        Input Format
//        A number n
//        n1
//        n2
//        .. n number of elements
//        A number d
//        Output Format
//        A number representing index at which d is found in array a and -1 if not found
public class findAnyElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]= sc.nextInt();
        }
        int d = sc.nextInt();
        int idx =-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==d){
                idx= i;
                break;
            }
        }
        System.out.println(idx);
    }
}
