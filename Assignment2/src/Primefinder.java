import java.util.Scanner;
public class Primefinder {
	boolean findPrime(int a){
		for(int i=2;i<a;i++){
			if(a%i==0){
				return false;
			}
		}
		return true;
		
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number:");
		int number = input.nextInt();
		input.close();

		Primefinder find = new Primefinder();
		
		if(find.findPrime(number)==true){
			System.out.println(number+" is Prime");
		}
		else{
			System.out.println(number+" is not Prime");
		}
	}
}