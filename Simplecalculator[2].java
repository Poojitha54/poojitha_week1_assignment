import java.util.Scanner;

public class Simplecalculator {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      
      System.out.print("Enter first number: ");
      int num1 = sc.nextInt();
      
      System.out.print("Enter second number: ");
      int num2 = sc.nextInt();
      
      System.out.println("Choose an operation: ");
      System.out.println("1. Addition (+)");
      System.out.println("2. Subtraction (-)");
      System.out.println("3. Multiplication (*)");
      System.out.println("4. Division (/)");
      System.out.print("Choice: ");
      int choice = sc.nextInt();
      
      switch(choice) {
         case 1:
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
            break;
         case 2:
            System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
            break;
         case 3:
            System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
            break;
         case 4:
            System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
            break;
         default:
            System.out.println("Invalid choice.");
            break;
      }
   }
}
