public class InsertionSort implements SortingAlgorithm{
	private int insertedElement, j;

	public void sort (int arr[]){
		
		for (int i=1; i<arr.length;i++){ 
			insertedElement = arr[i];
			j=i-1;
			// inserts an element into the sorted sublist

			while (j>=0 && arr[j]>insertedElement){ 
				arr[j+1] =arr[j];
				j--;
			}
			arr[j+1]= insertedElement; 
			
			//positions the inserted element in the correct location of the soted sublist (in asending order)
		}
	}

}