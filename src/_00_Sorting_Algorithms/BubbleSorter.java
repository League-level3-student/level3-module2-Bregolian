package _00_Sorting_Algorithms;

public class BubbleSorter extends Sorter {
	public BubbleSorter() {
		type = "Bubble";
	}

	// 1. Use the bubble sorting algorithm to sort the array.
	// You can use display.updateDisplay() to show the current
	// progress on the graph.
	public static boolean intArrayInOrder(int[] arr) {
		boolean output = true;
		int currentInt = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] >= currentInt) {
				currentInt = arr[i];
			} else {
				output = false;
			}
		}
		return output;
	}

	@Override
	void sort(int[] arr, SortingVisualizer display) {

		while (intArrayInOrder(arr) == false) {
			int temp = 0;
			for (int i = 0; i < arr.length - 1; i++) {
				if (arr[i] > (arr[i + 1])) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
				display.updateDisplay();
			}
		}

	}

}
