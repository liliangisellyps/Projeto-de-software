package src;

import java.util.List;
import java.util.Random;
import java.util.Scanner;

import src.employees.Commissioned;
import src.employees.Employee;
import src.employees.Hourly;
import src.employees.Salaried;
import src.employees.UnionMember;


public class EmployeeActions {

    public static Employee addEmployee(Scanner input) {
        Employee employee;

        System.out.println("-----------------------------------");
        System.out.println("\nLet's start our employee registration!\n");
        System.out.println("-----------------------------------");

        System.out.println("\nWhat's the name of the Employee?\n");
        String name = input.nextLine();

        System.out.println("\nWhat's the address of the Employee?\n");
        String address = input.nextLine();

        System.out.println("\nIs your new employee a Union Trade Member? Please enter only the number correspondent.\n");
        System.out.println("1- Yes\n2- No\n");
        int op = input.nextInt();
        UnionMember unionMember;
        if(op == 1) {
            System.out.println("\nEnter the Monthly Tax from the Union Trade\n");
            int monthlyTax = input.nextInt();
    
            System.out.println("\nEnter the Service Taxes from the Union Trade\n");
            int serviceTaxes = input.nextInt();
    
            int idUT = new Random().nextInt(10000);

            unionMember =  new UnionMember(monthlyTax, serviceTaxes, idUT);

            System.out.println("\nYour employee was successfully registered in the union trade system and his/hers ID is ");
            System.out.println(idUT);
        } else {
            unionMember =  new UnionMember(0, 0, 0);
        }

        PaymentMethod paymentMethod;
        System.out.println("Now, let's configure the payment informations!");
        System.out.println("What's the payment method of your employee's preference? Please enter only the number correspondent.\n");
        System.out.println("1 - Check sent by mail\n2 - Check delivered on hands\n3 - Bank Account Deposit\n");
       
        op = input.nextInt();
        if(op == 1)
            paymentMethod = new PaymentMethod(true, false, false);
        else if(op == 2)
            paymentMethod = new PaymentMethod(false, true, false);
        else
            paymentMethod = new PaymentMethod(false, false, true);

        System.out.println("Now, enter your employee bank's number\n");
        int bank = input.nextInt();

        System.out.println("And his/hers agency correspondent number\n");
        int agency = input.nextInt();

        System.out.println("Enter his/hers account number\n");
        int account = input.nextInt();

        Payment payment = new Payment(paymentMethod, bank, agency, account);


        System.out.println("Finally, what's the type of the Employee? Please enter only the number correspondent.\n1 - Salaried\n2 - Commissioned\n3 - Hourly\n");
        int employeeType = input.nextInt();
        int salary;
        int id = new Random().nextInt(10000);
        switch(employeeType){
            case 1: // Salaried
                System.out.println("Enter the Salary of your employee:\n");
                salary = input.nextInt();
                employee = new Salaried(name, id, address, unionMember, payment, salary);
                break;
            case 2: // Commissioned 
                System.out.println("Enter the Salary of your employee:\n");
                salary = input.nextInt();
                System.out.println("What's the comission of your employee?\n");
                int comission = input.nextInt();
                employee = new Commissioned(name, id, address, unionMember, payment, salary, comission);
                break;
            case 3: // Hourly
                System.out.println("How much your employee is paid for hour worked?\n");
                int hourSalary = input.nextInt();
                employee = new Hourly(name, id, address, unionMember, payment, hourSalary);
                break;
            default: 
                employee = new Employee(name, id, address, unionMember, payment);
        }
        System.out.println("\nThe ID of your new employee is");
        System.out.println(id);
        System.out.println("\nNew employee was successfully registered! Thank you.\n");
        System.out.println(employee.employeeInfos());

        return employee;
    }
    
    public static void removeEmployee(Scanner input, List<Employee> employeesList) {
        int i=0;
        System.out.println("Here's a list of all your employees:");
        for(Employee employee : employeesList){
            System.out.println(i + "- ");
            System.out.println(employee.employeeInfos());
            i++;
        }
        System.out.println("Which employee do you wanna remove? Enter the number correspondent.");
        int index = input.nextInt();
        employeesList.remove(index);
        System.out.println("Removed successfully!");
    }
}
