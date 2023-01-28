import java.util.Scanner;

public class binomial {
    public static int factorial(int x) {
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Value Of binomial N");
        int n = sc.nextInt();
        System.out.println("Enter The Value Of binomial R");
        int r = sc.nextInt();

        int nf = factorial(n);
        int rf = factorial(r);
        int nrf = factorial(n-r);
        int ans = nf/(rf*nrf);
        System.out.println("Binomial of : " +n+"C"+r+ ":" +ans);
    }
}
