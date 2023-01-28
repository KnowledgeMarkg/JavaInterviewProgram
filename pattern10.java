import java.util.Scanner;

public class pattern10 {
        public static void main(String[] args) {
            System.out.println("Enter The Number Of Rows");
            Scanner sc = new Scanner(System.in);
            int row = sc.nextInt();
            int k=0 , n, i, j;
            n= (row+1)/2;
            for(i=1;i<=row;i++){
                if(i<=n)  {k++;
                    for(j=1; j<=row; j++){
                        if(j>=n+1-k && j<=n-1+k)
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }
                    System.out.println("");
                }


                else{ k--;
                    for(j=1; j<=row; j++){
                        if(j>=n+1-k && j<=n-1+k)
                            System.out.print("*");
                        else
                            System.out.print(" ");}
                    System.out.println("");
                }
            }

        }
    }

