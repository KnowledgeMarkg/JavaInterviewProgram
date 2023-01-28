import java.util.Scanner;

public class findNumberType {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter 20 Number");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int pos= 0, eve=0, odd=0, neg=0, zero=0;
        for (int i=0; i<n ;i++){
            if(arr[i] > 0){
                pos++;
            } else if (arr[i]<0) {
                neg--;
            } else if (arr[i]==0) {
                zero++;
            } else if (arr[i]%2==0) {
                eve++;
            }else{
                odd++;
            }
        }
        System.out.println("Number OF Positive Integer In Array: " +pos);
        System.out.println("Number OF Negative Integer In Array: " +neg);
        System.out.println("Number OF Even Integer In Array: " +eve);
        System.out.println("Number OF Odd Integer In Array: " +odd);
        System.out.println("Number OF Zero Integer In Array: " +zero);
    }
}
