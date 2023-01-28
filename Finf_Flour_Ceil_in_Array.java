import java.util.Scanner;

public class Finf_Flour_Ceil_in_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0; i<n;i++){
            a[i] = sc.nextInt();
        }
        int left =0;
        int right = a.length-1;
        int data = sc.nextInt();
        int flour = -1;
        int ceil = -1;
        while (left<=right){
            int mid= (left+right)/2;
            if(a[mid]==data){
                flour = a[mid];
                ceil = a[mid];
                break;
            }
            else if(a[mid]<data){
                flour = a[mid];
                left = mid+1;
            }
            else{
                ceil = a[mid];
                right = mid-1;
            }
        }
        System.out.println(ceil);
        System.out.println(flour);
    }
}
