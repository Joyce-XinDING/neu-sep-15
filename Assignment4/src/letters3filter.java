import java.util.Scanner;

public class letters3filter {

 public static void main(String[] args) {

  System.out.println("Please input a sentence, separate them with ',' or SPACE.");
  
  Scanner scanner = new Scanner(System.in);

  String input = scanner.nextLine();
  
  String[] words =  input.replace(',', ' ').replace('.', ' ').split("\\s+");
  
  System.out.println("Total " + words.length + " words in " + input);
  
  System.out.println("Words with more than 3 characters are as follows: ");
  
  for(String str: words){
   
   if(str.length() >= 4){
    System.out.print(str + "\n");
 
   }
   
  }

 }

}