class Result {

    /*
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
    int[] b= arr.stream().mapToInt(Integer::intValue).toArray();
  
        int currentValue=b[n-1];
        int j=n-2;
        while(j>=0 && b[j]>currentValue){
            b[j+1]=b[j];
            j--;
            for(int f=0; f<n;f++){
            System.out.print(b[f]+" "); 
            }
             System.out.println();
        }
        b[j+1]=currentValue;
        
       for(int f=0; f<n;f++){
            System.out.print(b[f]+" "); 
            }
        
   
    
    
    }

}
