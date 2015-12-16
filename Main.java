//Bradley Dufour
//2015-12-16
//Practice 2011 - 00: Hello Judge
import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      
      int judges = scan.nextInt();
      for(int i = 1; i <= judges; i++)
      {
         System.out.println("Hello World, Judge "+ i +"!");
      }
      System.exit(0);
   }
}
