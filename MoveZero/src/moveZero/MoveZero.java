package moveZero;

// Given an array of integers, move all the 0s to the right end of the array.
// The relative order of the elements in the original array does not need to
// be maintained.

public class MoveZero {

	public int[] moveZero(int[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		int left = 0, right = array.length - 1;
		while (left <= right) {
			if (array[left] != 0) {
				left++;
			} else if (array[right] == 0) {
				right--;
			} else {
				swap(array, left, right);
			}
		}
		return array;
	}

	private void swap(int[] array, int left, int right) {
		int temp = array[left];
		array[left] = array[right];
		array[right] = temp;
	}

	// Time complexity is O(n).
	// Space complexity is O(1).
}