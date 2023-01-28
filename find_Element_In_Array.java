import java.util.Scanner;

public class find_Element_In_Array {
    public static int findElement(int []arr ,int d){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==d){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr= new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        System.out.println(findElement(arr, d));
    }
}
