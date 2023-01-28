public class Binary_To_Decimal {
    public static int getDecimal(int b, int base){
        int power=0;
        int ans = 0;
        while(b>0){
            int remainder = b%10;
            b= b/10;
            ans = (int) ((int) ans+(remainder*(Math.pow(2,power))));
            power++;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = getDecimal(111010,2);
        System.out.println(ans);
    }
}
