import java.util.Scanner;

public class Array_Sub_Set {
    public static int decimal_to_Binary(int n, int base){
        int power =1;
        int ans=0;
        while (n>0) {
            int remainder = n % base;
            ans = ans + (remainder * power);
            power *= 10;
            n =n/base;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++){
            a[i] =sc.nextInt();
        }
        int total_sub_Array =(int) Math.pow(2,n);
        //System.out.println(total_sub_Array);
        for(int i=0; i<total_sub_Array; i++){
            int ans = decimal_to_Binary(i,2);
            int div = (int) Math.pow(10,n-1);
            for(int j=0; j<n; j++){
                int q = ans/div;
                int rm= ans%div;
                if(q==1){
                    System.out.print(a[j]+"\t");
                }
                else{
                    System.out.print("-\t");
                }
                ans=rm;
                div/=10;
            }
            System.out.println();
        }
    }
}
