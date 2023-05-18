package sort;

public class InsertionSorter<K extends Comparable<? super K>> {

	/**
	 * Sorts the elements in given array from `left` to `right` in lexicographical order using insertion sort algorithm.
	 */
	
	public void sort(Pair<K, ?>[] array, int left, int right) {
		// Fill your code to sort the elements in `array`.
		int key, tmp;

		for (int i = left; i <= right; i++)
		{
			key = array[i].getValue();
			for (int j = i - 1; j >= 0 && array[j].getValue() > key; j--)
			{
				array[j + 1].setKey(array[j].getKey());
				array[j + 1].setValue(array[j].getValue());
			}
			array[j + 1].setValue(key);
			array[j + 1].setKey(array[i].getKey());		
		}
	}
	
	// Hint: Maybe you need to create the helper methods.
	
}