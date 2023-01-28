/*
Write a function SmallLargeSum(array) which accepts the array as an argument or parameter, that performs the addition of the second largest element from the even location with the second largest element from an odd location?
Rules:
All the array elements are unique.
If the length of the array is 3 or less than 3, then return 0.
If Array is empty then return zero.
Sample Test Case 1:
Input:
6
3
2
1
7
5
4
Output:
7
Explanation: The second largest element in the even locations (3, 1, 5) is 3. The second largest element in the odd locations (2, 7, 4) is 4. So the addition of 3 and 4 is 7. So the answer is 7.
Sample Test Case 2:
Input:
7
4
0
7
9
6
4
2
Output:
10
 */
import java.util.Scanner;
public class Sum_Even_And_Odd_Gretest_Value_in_Array {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int []a = new int[n];
        for(int i=0; i<n; i++){
            a[i]=sc.nextInt();
        }
        int even_largest = Integer.MIN_VALUE;
        int even_second_Largest = Integer.MIN_VALUE;
        int odd_second_Largest = Integer.MIN_VALUE;
        int odd_largest = Integer.MIN_VALUE;
        for(int i=0; i<a.length; i++){
            if(i%2==0){
                if(a[i]>even_largest){
                    even_second_Largest= even_largest;
                    even_largest = a[i];
                }
                else if(a[i]>even_second_Largest && a[i]!= even_largest){
                    even_second_Largest = a[i];
                }
            }
            else {
                if(a[i]>odd_largest){
                    odd_second_Largest= odd_largest;
                    odd_largest = a[i];
                }
                else if(a[i]>odd_second_Largest && a[i]!= odd_largest){
                    odd_second_Largest = a[i];
                }
            }
        }
        System.out.println(odd_second_Largest);
        System.out.println(even_second_Largest);
        int sum = odd_second_Largest+even_second_Largest;
        System.out.println(sum);
    }
}
