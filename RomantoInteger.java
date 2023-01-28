import java.util.HashMap;
import java.util.Scanner;

//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//        Symbol       Value
//        I             1
//        V             5
//        X             10
//        L             50
//        C             100
//        D             500
//        M             1000
//        For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
public class RomantoInteger {
    public static int romanToInteger(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n=s.length();
        int output=0;
        for(int i=0;i<n;i++)
        {
            if(i<n-1 && map.get(s.charAt(i))<map.get(s.charAt(i+1)))
            {
                output+= map.get(s.charAt(i+1))-map.get(s.charAt(i));
                i++;
            }
            else
            {
                output+=map.get(s.charAt(i));
            }
        }
        return output;
    }
    public static void main(String[] args) {
//        String romanNumber="MCMXCIV";
//        int result = romanToInteger(romanNumber);
//
//        System.out.println("The Roman Number is: "+romanNumber);
//        System.out.println("Its Integer Value is: "+result);
//
//        System.out.println();

//        romanNumber="DCCXCIX";
        Scanner  sc = new Scanner(System.in);
        String romanNumber = sc.next();
      int result = romanToInteger(romanNumber);

        System.out.println("The Roman Number is: "+romanNumber);
        System.out.println("Its Integer Value is: "+result);
    }
}
