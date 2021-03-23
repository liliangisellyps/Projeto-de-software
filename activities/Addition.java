import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.println("Enter number 1");
        number1 = input.nextInt();
        
        
        System.out.println("Enter number 2");
        number2 = input.nextInt();

        sum = number1 + number2;

        System.out.printf("Sum is %d", sum);
    
    }
}
