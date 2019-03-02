public class MergeSort implements SortingAlgorithm {

	public void sort (int arr[]){

		if (arr.length>1){

			int left [] = new int [arr.length/2];
			System.arraycopy(arr,0, left,0, left.length);
			int right [] = new int [arr.length-left.length];
			System.arraycopy(arr,0, right,0, right.length);

			sort(left);
			sort(right);
			merge(arr, left, right);
			/* divide our list into left and right sublists in each recursive call 
			 and then merge all parts in accending order after each sublist containd only two elements*/
		}
	}

	private void merge (int arr[], int left[], int right[]){

		int arri=0, lefti=0, righti=0;
		while (lefti<left.length && righti<right.length){
			if (left[lefti]< right [righti]){
				arr[arri++] = left[lefti++];
			} else{
				arr[arri++] = right[righti++];
			}
			/* checks if what element from which sublist we need to insert
			   after comparing which of the twoindicies is of smaller value*/
		}

		while (lefti<left.length){
			arr[arri++] = left[lefti++];
		}

		while (righti<right.length){
			arr[arri++]= right[righti++];
		}
		/* the remaining two while loops ensure we move all remaining indicies from either sublists into original array
		 after the opposite sublist has no remaining elements to compare*/
	}

}