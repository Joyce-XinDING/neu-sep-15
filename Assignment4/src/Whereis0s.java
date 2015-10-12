import java.util.Scanner;
import java.util.StringTokenizer;

public class Whereis0s {
public int[] finder(int[] arrayofzeros){
		
		int[] temp = new int[(arrayofzeros.length/3)+1];
		int index = 0;
		int length = 0;
		int parts = -1;
		for(int i = 0; i<arrayofzeros.length;){
			if(arrayofzeros[i]==0){
				index = i;
				length = 0;
				while(i<arrayofzeros.length && (arrayofzeros[i++]==0))
					length++;
				if(length>=2){
					temp[++parts] = index;
					temp[++parts] = length;
				}
			}
			else
				i++;
		}
		int[] results = new int[parts+1];
		for(int i=0; i<=parts; i++)
			results[i] = temp[i];
		for(int x=0; x<(results.length-2);x++){
		System.out.println(results[x]);}
		return results;
}
	public static void main(String args[]) {
		System.out.println("Please enter a series of number, seperate them with SPACE:");
		Scanner enter= new Scanner(System.in);
		String input=enter.nextLine();
		int[] in=new int[input.length()];
		StringTokenizer toKenizer = new StringTokenizer(input, " ");   
	    int i = 0;  
	    while (toKenizer.hasMoreElements()) {   
	      in[i++] = Integer.valueOf(toKenizer.nextToken());  
	    }   
		Whereis0s where=new Whereis0s();
		where.finder(in);
	}
}
