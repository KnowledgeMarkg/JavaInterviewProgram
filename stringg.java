import java.util.Scanner;

public class stringg {
    public static void main(String[] args) {
//        Scanner sc  = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int len = s.length();
        int[] arr = new int[len];
        for(int i=0;i<len;i++){
            arr[i] = Integer.parseInt(String.valueOf(s.charAt(i)));
        }

        int num = Integer.parseInt(s);
        while(num>0){
            StringBuilder temp = new StringBuilder();
            for(int i=0;i<len;i++){
                if(arr[i]>0){
                    temp.append(1);
                } else {
                    temp.append(0);
                }
                arr[i]--;
            }
            System.out.println(temp);
            int var = Integer.parseInt(temp.toString());
            num-=var;
        }
    }
}
