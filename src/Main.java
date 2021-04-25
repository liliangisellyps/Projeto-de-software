package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import src.employees.Employee;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option = 0;
        List<Employee> employeesList = new ArrayList<Employee>();

        while(option != 11){ 
            System.out.println("-----------------------------------");
            System.out.println("\nWelcome to the payroll system!\n");
            System.out.println("-----------------------------------");
            System.out.println("Payroll System\n");
            System.out.println("What would you like to do? Please choose an option above:\n");
            System.out.println("1 - Add Employee\n");
            System.out.println("2 - Remove Employee\n");
            System.out.println("3 - Add TimeCard\n");
            System.out.println("4 - Add Sale Report\n");
            System.out.println("5 - Add Service Taxes\n");
            System.out.println("6 - Change Employee Infos\n");
            System.out.println("7 - Pay Employees\n");
            System.out.println("8 - Undo/redo previous action\n");
            System.out.println("9 - Change Payment Day\n");
            System.out.println("10 - Create New Payment Schedule\n");
            System.out.println("11 - Exit System");

            option = input.nextInt();

            switch(option) {
                case 1: // register new employee
                    employeesList.add(EmployeeActions.addEmployee());
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 9:
                    break;
                case 10:
                    break;
                case 11:
                    break;
                default:
                    break;
            }
            
            option = input.nextInt();
            option = input.nextInt();
        }
        input.close();

    }
}
