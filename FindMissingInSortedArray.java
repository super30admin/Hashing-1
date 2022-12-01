    /*package whatever //do not write package name here */

class FindMissingInSortedArray {
	public static void main (String[] args) {
		int[] arr = {1,2,3,4,6,7,8};
		
		int num = findMissingNum(arr);
		System.out.println(num);
		
	}
	
	static int findMissingNum(int[] arr){
        if (arr[0] != 1) return 1;
        
	    int low = 0;
	    int high = arr.length-1;

	    if (arr[high] != high +1) return high+1;

	    while (high - low >=2 ){
	        int mid = low + (high-low)/2;
	        System.out.println(mid);
	        if ((arr[mid] - mid) != (arr[low]- low)) {
	            high = mid;
	        } else if ((arr[mid] - mid) != (arr[high]- high)) {
	            low = mid;
	        }
	    }
	    return (arr[low]+arr[high])/2;
	}
}

