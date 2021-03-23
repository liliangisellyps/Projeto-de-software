import java.util.Scanner;

public class Welcome {

    public static void main(String[] args) {
        int cont;
        cont = 1;
        System.out.println("Welcome to my first program in Java!");

        do{
    
            Scanner input = new Scanner(System.in);
            int operation;
            int number1;
            int number2;
            int valid = 1;
    
            System.out.print("Choose an operation:\n1 - Addition\n2 - Subtraction\n3 - Multiplication\n4 - Division\n");
            System.out.print("Enter operation's number!\n");
    
            operation = input.nextInt();
            
            if(operation == 1) System.out.print("You chose Addition!\n");
            else if(operation == 2) System.out.print("You chose Subtraction!\n");
            else if(operation == 3) System.out.print("You chose Multiplication!\n");
            else if(operation == 4) System.out.print("You chose Division!\n");
            else {
                valid = 0;
                while(valid == 0){
                    System.out.print("Invalid Operation, choose another number!\n");
                    operation = input.nextInt();
                    if(operation == 1 || operation == 2 || operation == 3 || operation == 4) valid = 1;
                }
            }
    
            System.out.print("Enter first number and second number!\n");
    
            number1 = input.nextInt();
            number2 = input.nextInt();
    
            if(operation == 1) System.out.printf("Your result is: %d + %d = %d\n", number1, number2, number1 + number2);
            else if(operation == 2) System.out.printf("Your result is: %d - %d = %d\n", number1, number2, number1 - number2);
            else if(operation == 3) System.out.printf("Your result is: %d * %d = %d\n", number1, number2, number1 * number2);
            else if(operation == 4) System.out.printf("Your result is: %d / %d = %d\n", number1, number2, number1 / number2);
            
            System.out.printf("Do you want to do another operation? Press 1 for 'YES' and 0 for 'NO'\n");
            cont = input.nextInt();
        }
        while (cont == 1);
        System.out.print("Thank you for using my calculator!\n");
    }
}