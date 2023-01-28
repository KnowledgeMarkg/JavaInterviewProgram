import java.util.Scanner;

public class Bar_Chart_Print_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        barChart(arr);
}
public  static void barChart(int []arr){

    int max=arr[0];
    for(int i=0; i<arr.length;i++){
        if(max<arr[i]){
            max=arr[i];
        }
    }

    for (int i=max; i>=1;i--){

        for(int j =0 ; j<arr.length;j++){

            if(i>arr[j]){
                System.out.print("\t");
            }
            else {
                System.out.print("*\t");
            }

        }
        System.out.println();
    }
}
}
