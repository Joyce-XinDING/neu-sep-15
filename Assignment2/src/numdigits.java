import java.util.Scanner;
public class numdigits {
	int count(int a){
		char[] c = String.valueOf(a).toCharArray();
		System.out.println(a+" has "+ c.length+ " digits");
	return c.length;
	}
		public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = input.nextInt();
		input.close();
		numdigits a = new numdigits();
		a.count(number);
			}
}
