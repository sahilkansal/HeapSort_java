package Hsort;

public class test {
	static int a[] = { -1, 5, 8, 6, 3, 2, 1, 15, 10 };

	public static void main(String[] a) {
		HeapSort();
	}

	private static void HeapSort() {
		int len = (a.length - 1) / 2;
		// create max heap;
		for (int i = len; i > 0; i--) {
			Heapify(i, a.length - 1);
		}
		for (int i = 1; i < a.length; i++) {
			System.out.print(a[1] + " ");

			swap(1, a.length - i);

			Heapify(1, a.length - i-1);
		}
	}

	private static void Heapify(int index, int len) {
		//System.out.println(index+"  "+len);
		int left = 0, right = 0;
		if (2 * index <= len) {
			left = a[2 * index];
		}
		if ((2 * index + 1) <= len) {
			right = a[2 * index + 1];
		}
		if (left == 0 && right == 0)
			return;

		if (left > right) {
			if (left > a[index]) {
				swap(index, 2 * index);
				Heapify(index * 2, len);
			}
		} else {
			if (right > a[index]) {
				swap(index, 2 * index + 1);
				Heapify(2 * index + 1, len);
			}
		}
	}

	private static void swap(int index, int i) {
		int temp = a[index];
		a[index] = a[i];
		a[i] = temp;
	}

	private static void printArr(int[] a2) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
