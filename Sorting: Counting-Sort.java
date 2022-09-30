class Result {

    /*
     * Complete the 'countingSort' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static List<Integer> countingSort(List<Integer> arr) {
    // Write your code here
    int[] arrayOfNumber= arr.stream().mapToInt(Integer::intValue).toArray();
    int min= 0;
    int max= 99;
    int[] countArray=new int[max+1];
    List<Integer> result= new ArrayList<>();
    for(int value: arrayOfNumber){
        countArray[value]++;
    }
    
    for(int display: countArray){
        result.add(display);
    }
    
    return result;

    }

}
