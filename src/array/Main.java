package array;

public class Main {
	public static void main(String[] arg) {

		int[] arr = gener();
		double sum = sum(arr);

		double average = sum / arr.length;
		System.out.println("Среднее арифметическое: " + average);

		minMax(arr);

	}

	public static int[] gener() {
		int[] arr = new int[(int) (Math.random() * 10) + 1];
		System.out.print("Сгенерированный массив: [ ");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 100);
			System.out.print(arr[i] + " ");
		}
		System.out.println("]");
		return arr;
	}

	public static double sum(int[] arr) {
		double sum = 0;
		System.out.print("Сумма всех чисел: ");
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println((int)sum);
		return sum;

	}

	public static void minMax(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {

			if (max < arr[i]) {
				max = arr[i];
			} else if (min > arr[i]) {
				min = arr[i];
			}
		}
		System.out.println("Наибольшее число: " + max);
		System.out.println("Наименьшее число: " + min);
	}
}
