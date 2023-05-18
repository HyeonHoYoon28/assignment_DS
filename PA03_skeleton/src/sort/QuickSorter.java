package sort;

public class QuickSorter<K extends Comparable<? super K>>{
	public void sort(Pair<K, ?>[] array, int left, int right) {
		
		// Fill your code to sort the elements in `array`.
		int pivot, start, end, tmp;

		start = left + 1;
		end = right;
		pivot = array[left].getValue();
		pivotKey = array[left].getKey();

		while (start < end)
		{
			while (array[start].getValue() < pivot)
				start++;
			while (array[end].getValue() > pivot)
				end--;
			if (start < end)
			{
				tmp = array[start].getValue();
				array[start].setValue(array[end].getValue());
				array[end].setValue(tmp);
				tmp = array[start].getKey();
				array[start].setKey(array[end].getKey());
				array[end].setKey(tmp);
			}
		}
		tmp = array[end].getValue();
		array[end].setValue(array[left].getValue());
		array[left].setValue(tmp);
		tmp = array[end].getKey();
		array[end].setKey(array[left].getKey());
		array[left].setKey(tmp);
		QuickSorter.sort(array, left, end - 1);
		QuickSorter.sort(array, end + 1, right);
	}
	
	// Hint: Maybe you need to create the helper methods.
	
}
