package ѡ������4;

public class ѡ������ {

	public static void main(String[] args) {
		int[] arr = new int[] { 4, 6, 9, 5, 0, 7, 8 };
		int[] result = ���ı�(arr);
		for (int i = 0; i < result.length; i++) {
			System.out.println("arr[" + i + "]=" + result[i]);
		}
	}

	/**
	 * @param arr
	 * @return �Ż����
	 */
	public static int[] ���ı�(int[] arr) {
		int minPos;
		for (int i = 0; i < arr.length - 1; i++) {
			minPos = i;
			for (int j = i + 1; j < arr.length; j++) {
				minPos = arr[j] < arr[minPos] ? j : minPos;
				int t = arr[minPos];
				arr[minPos] = arr[i];
				arr[i] = t;
			}
		}
		return arr;
	}

}
