import java.util.Scanner;
public class find {
  int count(String a, char b){
		int count = 0;
		char[] c = a.toCharArray();
		for(int i=0;i<c.length;i++){
			if (c[i]==b){
				count++;
			}
		}
		System.out.println(a+" has "+count+" '"+b+"' .");
		return count;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a word and a character, seperate them with a space:");
		String text = input.next();
		String s = input.next();
		input.close();
		char[] v = s.toCharArray();
		char n = v[0];
		find a = new find();
		a.count(text,n);
	}

}
