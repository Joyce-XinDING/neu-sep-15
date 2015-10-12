import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

import org.junit.runner.Computer;
public class Bullsandcows {
private int A;




public void guess(){

	Random ran=new Random();
	int r=0;
	int[] computer=new int[4];
	m1:while(true){
		int n=ran.nextInt(10000);
		r=n;
		for(int i=0;i<computer.length;i++){
			computer[i]=n%10;
			n/=10;
		}
		Arrays.sort(computer);
		for(int i=1;i<computer.length;i++){
			if(computer[i-1]==computer[i]){
				continue m1;
			}
		}
		break;
	}
	System.out.println("Welcome to the Bulls & Cows game! ");
	m2: while(A!=4){
	System.out.println("Please enter a 4 digits number:");
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	int[] num1=new int[4];
	for(int x=0;x<num1.length;x++){
		num1[x]=num%10;
		num/=10;
	
	}
	int B=0;
	if(computer[0]==num1[1] ^ computer[0]==num1[2] ^ computer[0]==num1[3] ){
		B++;
	}
	if(computer[1]==num1[0] ^ computer[1]==num1[2] ^ computer[1]==num1[3] ){
		B++;
	}
	if(computer[2]==num1[0] ^ computer[2]==num1[1] ^ computer[2]==num1[3] ){
		B++;
	}
	if(computer[3]==num1[0] ^ computer[3]==num1[1] ^ computer[3]==num1[2] ){
		B++;
	}
	A=0;
	for(int y=0;y<4;y++){
		if(computer[y]==num1[y]){
			A++;
		}
	}
	System.out.println("You got "+ A+" A "+ B +" B.");
	continue m2;
	}
	System.out.println("Awesome! You hit it!");
	}
	

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bullsandcows bc= new Bullsandcows();
		bc.guess();
	}

}
