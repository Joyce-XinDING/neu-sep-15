import java.util.Scanner;

public class Divider {
	public String printFizzBuzz(int n){
		String result="";
		if(n%3==0){
			result+="fizz ";
		}
		if(n%5==0){
			result+="buzz";
		}
		return result;
	}
}
