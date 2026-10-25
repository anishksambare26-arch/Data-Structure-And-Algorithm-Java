import java.util.*;
    public class Single{
        public static int N(int[]num) {
            int a=0;
            for(int i:num){
                a ^= i;
            }
            return a;
            
        }
        public static void main (String[] args) {
             Scanner sc = new Scanner(System.in);
                 System.out.println("Enter Array Size: ");
                    int n= sc.nextInt();
                        int[] num=new int[n];
                            System.out.println("Enter Number: ");
            for(int j=0;j<n;j++){
                num[j]=sc.nextInt();
            }
            int res= N(num);
            System.out.println("The number is: "+res);
            sc.close();
        }
    }
