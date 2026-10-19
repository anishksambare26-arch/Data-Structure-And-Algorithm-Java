 class Solution {
    public static void main (String[] args) {
        //Array 
        int[] num={32,65,56,23,44};
        //Target to find
        int a=100;
        
        for(int i =0;i < num.length;i++){
            for(int j = i + 1; j < num.length;j++){
                if(num[i]+num[j]==a){
                    System.out.println("Indices are :"+i+","+j);
                    return;
                }
            }
            
        }
        //Runs if no pairs
            System.out.println("No Solution");
    }
}
