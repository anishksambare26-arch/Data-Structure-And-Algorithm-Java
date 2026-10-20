public class Reverse{
    public static void main (String[] args) {
        // Initialize an array of integers
        int[] array={1,2,3,4,5,6,7,8};
         // Initialize two pointers at the beginning and end
        int i=0, j=array.length - 1;
       // Continue swapping while the left pointer is before the right
        while(i<j){
            int t=array[i];
            array[i]=array[j];
            array[j]=t;
            i++;j--;
        }
        //prints the reverse array
        for(int p : array){
            System.out.print(p + " ");
        }
    }
    
}
