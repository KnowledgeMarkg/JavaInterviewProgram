import java.util.Scanner;

public class Find_Sub_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int si=0; si<n; si++){
            a[si]=sc.nextInt();
        }
        for(int si=0; si<n; si++){
            for(int ei=si; ei<n;ei++){
                for(int i =si ; i<=ei; i++){
                    System.out.print(a[i]);
                }
                System.out.println();
            }
        }
    }
}
