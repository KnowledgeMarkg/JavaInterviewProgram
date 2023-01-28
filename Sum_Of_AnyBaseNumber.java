public class Sum_Of_AnyBaseNumber {
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
        int ans = getSumAnyBaseNumber(724,72, 8);
        System.out.println(ans);
    }

}
