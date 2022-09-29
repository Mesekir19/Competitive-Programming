class Result {

    /*
     * Complete the 'countSwaps' function below.
     *
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static void countSwaps(List<Integer> a) {
        
    // Write your code here
    int[] b= a.stream().mapToInt(Integer::intValue).toArray();
    int countSwap=0;
    for (int i = 0; i < b.length; i++) {
    
    for (int j = 0; j < b.length - 1; j++) {
        // Swap adjacent elements if they are in decreasing order
        if (b[j] > b[j + 1]) {
            int temp= b[j];
            b[j]=b[j+1];
            b[j+1]=temp;
            // swap(b[j], b[j + 1]);
            countSwap++;
        }
    }
    
}
