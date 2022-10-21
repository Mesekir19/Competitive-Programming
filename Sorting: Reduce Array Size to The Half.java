class Solution {
    public int minSetSize(int[] arr) {
        // Arrays.sort(arr);
        int count=0;
        int n=arr.length;
        int half=n/2;
        int max=0;
        for(int j:arr){
            max=Math.max(max,j);
        }
        int[] ocr=new int[max+1];
        int i=max;
        for(int j:arr){
            ocr[j]++;
        }
        Arrays.sort(ocr);
        while(n>arr.length/2){
            n-=ocr[i];
            i--;
            count++;
        }
        return count;
    }
}
