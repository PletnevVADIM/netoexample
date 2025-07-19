import java.util.Scanner;

public class Main {
    public static void main(String[] args)throws Exception{ 
     Scanner scanner = new Scanner (System.in);

     int sum = 0;
     while (true) {
          System.out.println(" enter number or end ");
String input = scanner.nextLine();
if (input.equals("end")){
     break;
}
          int x = Integer.parseInt(input);
          sum +=  x;
     }
     System.out.println("Your Sum = " + sum);
     }

}
