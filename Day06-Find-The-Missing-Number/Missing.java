public class Missing{
    public static int Sol(int[]num) {
        int n=num.length;
        int sum = n*(n+1)/2;
        int array=0;
         for (int a : num) {
        array = array + a;
        }
         return sum - array;
    }
    public static void main (String[] args) {
        int num[]={0,1,2,4};
        int result=Sol(num);
        System.out.println(result);
    }
}
