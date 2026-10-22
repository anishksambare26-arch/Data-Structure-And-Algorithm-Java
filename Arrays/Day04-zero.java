public class zero{
 public static void main (String[] args) {
     //Input
     int[] array={0,1,0,2,0,3};
     int p=0;
       //Move the non-zero elements at beginning
     for(int i=0;i<array.length;i++){
        if(array[i] !=0){
            array[p] = array[i];
            p++;
        }
        }   
        //Fill remaining position with zero
     while(p < array.length){
         array[p]=0;
         p++;
     }
      //Print final answer
     for(int n:array){
     System.out.print(n+" ");
     }
 }   
}
