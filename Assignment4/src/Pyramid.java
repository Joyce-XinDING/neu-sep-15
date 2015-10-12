import java.util.Scanner;
public class Pyramid{
public void yes(int a){
	
	for(int i=1;i<=a;i++){
		 for(int j=0;j<a-1-i;j++){
		 System.out.print(" ");
		 }
		 int y=(i*i-i)/2+1;
		 System.out.print(y);
		 for(int n=1;n<i;n++){
			 y=y+1;
		 System.out.print(y);
		 }
		 System.out.println("");
		 }
		 }
 public static void main(String[] args){
	 System.out.println("Please enter the height:");
	 Scanner input=new Scanner(System.in);
	 int height=input.nextInt();
	 Pyramid p=new Pyramid();
	 p.yes(height);
 } 
 }