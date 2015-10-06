import java.util.Scanner;
import java.util.Arrays;
public class EvenNumber {
	int[] display(int a){
		int[] c=new int[a/2];
		int b=0;
		for (int i=2;i<=a;i=i+2){
			c[b]=i;
			b++;
			System.out.print(i+" ");
		}
		return c;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = input.nextInt();
		input.close();
		EvenNumber even = new EvenNumber();
		even.display(number);
	}

}
