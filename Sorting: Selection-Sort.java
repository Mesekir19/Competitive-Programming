class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int n=arr.length;
        selectionSort(arr,n);
        return 0;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	    for(int i=0; i<n-1;i++){
	        int minI=i;
	        for(int j=i+1; j<n;j++){
	            if(arr[j]<arr[minI] ){
	                minI=j;
	            }
	        }
	        if(minI != i){
	            int temp = arr[i];
	            arr[i]=arr[minI];
	            arr[minI]=temp;
	        }
	    }
	}
}
