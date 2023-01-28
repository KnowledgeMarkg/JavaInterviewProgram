public class Difference_Of_AnyBaseNUmber {
    public static int getDifference_AnyBaseNumber(int n2, int n1, int base){
        int power=1;
        int borrow = 0;
        int ans =0;
        while (n2>0){
            int lb1 = n1%10;
            int lb2 = n2%10;
            n1=n1/10;
            n2 = n2/10;
            int difference = lb2-lb1-borrow;
            if(difference<0){
                borrow=1;
                difference+=base;
            }
            else {
                borrow=0;
            }
            ans+=(difference*power);
            power*=10;
        }
        return ans;
    }

    public static void main(String[] args) {
        int ans = getDifference_AnyBaseNumber(724,72,8);
        System.out.println(ans);
    }
}
