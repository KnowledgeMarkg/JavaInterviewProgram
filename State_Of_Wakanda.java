/*
The State Of Wakanda - 1
easy
The historic state of Wakanda has various monuments and souvenirs which are visited by many travelers every day. The guides follow a prescribed route of visiting the monuments which improve them understand the relevance of each monument.
The route of the monument is fixed and expressed in a 2-d matrix where the travelers visit the prescribed next monument. For example
1  2  3
4  5  6
7  8  9
is the prescribed route and the visitors travels this path: 1->2->3->4->5->6->7->8->9
However, a certain visitor decides to travel a different path as follows:
1 He first travels southwards till no further south places are available.
2. He then moves only 1 place eastwards.
3. He starts to move again towards north till any further north moves are available.
This continues till all the places are covered.
For example, the monuments are named as follows:
1  2  3
4  5  6
7  8  9
 */
import java.util.Scanner;

public class State_Of_Wakanda {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [][]a = new int[n][m];
        for(int i=0; i<n;i++){
            for(int j=0; j<m; j++){
                a[i][j] = sc.nextInt();
            }
        }
        for(int j =0 ; j<a[0].length ; j++){
            if(j%2==0){
                for(int i =0 ; i<n ; i++){
                    System.out.print(a[i][j]+" ");
                }
            }
            else {
                for(int i =a.length-1 ; i>=0; i--){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
