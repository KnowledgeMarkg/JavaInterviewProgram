import java.util.Scanner;

public class numberFrequency {
    public static int getFrequency(int x , int num){
        int count = 0;
        while(num>0){
            int remain = num%10;
            num = num/10;
            if(remain==x){
                count ++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Number");
        int num = sc.nextInt();
        System.out.println("Enter The Number To check Frequency");
        int x = sc.nextInt();
        int ans = getFrequency(x,num);
        System.out.println("Frequency of" +x+ "is: " +ans);
    }
}
