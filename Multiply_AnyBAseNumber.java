public class Multiply_AnyBAseNumber {
    public Multiply_AnyBAseNumber() {
    }

    public static int get_Product(int num1 , int num2, int b){
        int ans =0;
        int power = 1;
        int carry =0;
        while (num2>0){
            int d2 = num2%10;
            num2 = num2/10;
            int product =get_Multiply_anyBase_Number(num1, d2 , b);
            ans = getSumAnyBaseNumber(ans,product*power,b);
            power = power*10;
        }
        return ans;
    }
    public static int get_Multiply_anyBase_Number(int num1, int d1 , int base){
        int carry =0;
        int power = 1;
        int ans=0;
        while(num1>0 || carry!=0){
            int lb1 = num1%10;
            num1 = num1/10;
            int multi = (lb1*d1)+carry;
            int remainder = multi%base;
            int quotient = multi/base;
            ans = ans+(remainder*power);
            power*=10;
            carry= quotient;
        }
        return ans;

    }
    public static int getSumAnyBaseNumber(int num1, int num2 , int base){
        int power =1;
        int ans= 0;
        int carry = 0;
        while (num1!=0 || num2!=0 || carry!=0 ) {
            int lastDigit1 = num1 % 10;
            int lastDigit2 = num2 % 10;
            num1 = num1/10;
            num2 = num2/10;
            int sum = lastDigit1+lastDigit2+carry;
            int remainder = sum%base;
            int quotient = sum/base;
            ans+= (remainder*power);
            power*=10;
            carry= quotient;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = get_Product(1200,21,5);
        System.out.println(ans);
    }
}
