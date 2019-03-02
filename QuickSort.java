public class QuickSort implements SortingAlgorithm{

	public void sort (int arr []){
		// calls our overloaded function with a starting high and low indexå (inx 0 --> last indx)
		sort(arr, 0, arr.length-1);
	}

	private void sort (int arr[], int left, int right){
		if (left<right){
			int p= partition(arr, left,right);

			sort(arr, left, p-1); 
			// helps in sorting all elements before (smaller than) pivot (in a recursive manner with the help of partition)

			sort(arr, p+1, right); 
			// helps in sorting all elements after (bigger than) pivot (in a recursive manner with the help of parition)
		}	
	}

	
	private int partition (int arr[], int left, int right){
		if (left<right){
			int piv = left; // take first element to be our pivot
			int i= left+1;
			int j= right;

			while (i<j){
				while (i<=right && arr[i]<=arr[piv]){ // increment i while i is less or equal to pivot and does not exceed the rightmost element
					++i;
				}
				while (j>=i && arr[j]>arr[piv]){ // decrement j while it is less than pivot and does not exceed our current right pointer
					--j;
				}
				if (i<= right && i<j){ // this means that i exceeded j and therefore a swap is needed for correct positioning
					int temp = arr[i];
					arr[i]= arr[j];
					arr[j]= temp;
				}
			}
			// we then swap pivot to its correct location in the list
			int temp = arr[piv];
			arr[piv]= arr[j];
			arr[j]= temp;
			return j;
		}
		return left;
	}


}