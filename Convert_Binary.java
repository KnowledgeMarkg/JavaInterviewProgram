import java.util.Scanner;

public class Convert_Binary {
    public static int getBinary(int x , int base) {
        int power = 1;
        int ans=0;
        while (x > 0) {
            int remainder = x % base;
            ans =ans+(remainder * power);
            power = power*10;
            x = x / base;
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number To Change into Binary");
        int num = sc.nextInt();
        System.out.println("Enter The Base like for binary = 2 , and For Octal =8");
        int base = sc.nextInt();
        int binary = getBinary(num, base);
        System.out.println(binary);
    }
}
