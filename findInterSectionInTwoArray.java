import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class findInterSectionInTwoArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The 1st Number Of Element in Array");
        int n = sc.nextInt();
        int[] arr1 = new int[n];
        for (int i=0; i<n; i++){
            arr1[i] = sc.nextInt();
        }
        System.out.println("Enter The 2nd Number Of Element in Array");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        for (int i=0; i<m; i++){
            arr2[i] = sc.nextInt();
        }
//        for (int i=0; i<n; i++){
//            for(int j =0 ; j<m; j++){
//                if(arr1[i]==arr2[j]){
//                    System.out.println(arr1[i]);
//                }
//            }
//        }
//        Arrays.sort(arr1);
//        int i=0, j=0;
//        while (i<arr1.length && j<arr2.length){
//            if(arr1[i]==arr2[j]) {
//                System.out.println(arr1[i]);
//                i++;
//                j++;
//            } else if (arr1[i]>arr2[j]) {
//                j++;
//            }else {
//                i++;
//            }
//        }
        HashSet<Integer> set1 = new HashSet<>();
        for(int val : arr1){
            set1.add(val);
        }
        for (int val : arr2){
            if(set1.contains(val)){
                System.out.println(val);
                set1.remove(val);
            }
        }
    }
}
