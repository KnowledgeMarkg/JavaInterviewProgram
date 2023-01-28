import java.util.Scanner;
public class nucleusQ {
    static int digitSum(int n) {
        int sum = 0;
        while (n != 0) {
            sum  = sum+ n % 10;
            n = n / 10;
        }
        return sum;
    }
    public static int getSmallestNum(int input1) {
        int res = 0;
        for (int i = input1; i < 1000; i++) {
            if (digitSum(i) == input1 && i % input1 == 0 && i>input1) {
                res = i;
                break;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = getSmallestNum(n);
        System.out.println("Number is: " + result);
    }
}
