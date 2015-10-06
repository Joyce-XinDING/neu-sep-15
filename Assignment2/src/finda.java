import java.util.Scanner;
public class finda {
	int count(String a){
		int count = 0;
		char[] c = a.toCharArray();
		for(int i=0;i<c.length;i++){
			if (c[i]=='a'){
				count++;
			}
		}
		System.out.println(a+" has "+count+" 'a'.");
		return count;
	}
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word:");
		String text = input.nextLine();
		input.close();
		
		finda a = new finda();
		a.count(text);
	}

}
