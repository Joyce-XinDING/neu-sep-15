import java.util.Scanner;

public class EvenNumber {
	void display(int a){
		for (int i=2;i<=a;i=i+2){
			System.out.print(i+" ");
			
		}
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
