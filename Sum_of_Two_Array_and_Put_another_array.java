import java.util.Scanner;
public class Sum_of_Two_Array_and_Put_another_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1= sc.nextInt();
        int []arr1 = new int[n1];
        for(int i =0 ; i<n1; i++){
            arr1[i]=sc.nextInt();
        }
        int n2= sc.nextInt();
        int []arr2= new int[n2];
        for (int i = 0; i<n2 ; i++){
            arr2[i] = sc.nextInt();
        }
        int n3 = Math.max(n1,n2)+1;
        int []arr3 = new int[n3];
        int i = arr1.length-1;
        int j = arr2.length-1;
        int k = arr3.length-1;
        int carry=0;

        while (k>=0){
            int sum =0;
            if(i>=0){
                sum+=arr1[i];
            }
            if (j>=0){
                sum+=arr2[j];
            }
            sum+=carry;
            int remainder = sum%10;
            int Quotient = sum/10;
            arr3[k]= remainder;
            carry=Quotient;
            i--;
            j--;
            k--;
        }
        for(i=0 ; i<arr3.length; i++){
            if(i==0 && arr3[i]==0){
                // do nothing
            }
            else{
                System.out.println(arr3[i]);
            }
        }
    }

}
