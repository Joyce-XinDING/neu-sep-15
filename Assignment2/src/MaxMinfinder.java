import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class MaxMinfinder {

	public static void main(String[] args) throws IOException {
		System.out.println("Please enter a set of words and seperate them with space:");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String input = reader.readLine();
		String[] numbers = input.split(" ");
		int[] values = new int[numbers.length];
		for (int j = 0; j < numbers.length; j++) {
			values[j] = Integer.parseInt(numbers[j]);
		}
		numbers = null; 
		System.out.printf("MAX:" + getMax(values)+ "\nMin:"+getMin(values));
	}

	public static int getMax(int[] values) {
		int tmp = Integer.MIN_VALUE;

		if (null != values) {
			tmp = values[0];
			for (int i = 0; i < values.length; i++) {
				if (tmp < values[i]) {
					tmp = values[i];
				}
			}
		}

		return tmp;
	}

	public static int getMin(int[] values) {
		int tmp = Integer.MIN_VALUE;

		if (null != values) {
			tmp = values[0];
			for (int i = 0; i < values.length; i++) {
				if (tmp > values[i]) {
					tmp = values[i];
				}
			}
		}

		return tmp;
	}
}
