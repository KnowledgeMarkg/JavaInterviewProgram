import java.util.Scanner;
public class splitAnArray {
    public static void printArra(int arr[]){
        for (int var :arr){
            System.out.print(var);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
        System.out.println("Number OF Element in Array oR Size Of An Array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] =sc.nextInt();
        }
        int n1 = arr.length;
        System.out.println("Enter position to split.");
        int pos = sc.nextInt();
        if(pos>0 && pos<n1) {
            int[] arr1 = new int[pos];
            int[] arr2 = new int[n1 - pos];
        int l=0;
            for(int i =0; i<pos; i++){
                arr1[i] = arr[i];
            }
            for(int k = 0 ; k<n1-pos; k++){
                arr2[k] = arr[k+pos];
            }
            printArra(arr1);
            printArra(arr2);
        }else {
            System.out.println("Invalid position.");
        }
    }
}
