import java.util.Random;
import java.util.Scanner;
public class Guessnumber {
	public void enter(){
		int n=1;
		int usernum;
		Random randomGenerator = new Random();
		int i = randomGenerator.nextInt(100)+1;
		for(int b=1;b<=6;b++){
			Scanner input=new Scanner(System.in);
			int a=input.nextInt();
		if(b>5){
			System.out.println("Sorry! You have guessed 5 times and no chance left.");
			break;
		}
		else{
			
			if(a==i){
			System.out.println("Great! You have made it with "+b+ " time.");
			}
			
			if(a>i){
			System.out.println("Please guess again! "+a+" is bigger than what I expected.  You got "+(5-b)+" time(s) left. ");
			System.out.println("Please enter:" );
			
			}
			if(a<i){
			System.out.println("Please guess again! "+a+" is smaller than what I have expected. You got "+(5-b)+" time(s) left.");
			System.out.println("Please enter:");
			
			}
			}
		}
		
		}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Please enter the number between 1-100:");
		Guessnumber guess=new Guessnumber();
		guess.enter();
		
		
	}

}
