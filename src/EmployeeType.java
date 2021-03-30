package src;

public class EmployeeType extends Employee {
    public EmployeeType(String name, String id, String email, EmployeeType employeeType, TimeCard timeCard,
            UnionMember unionMember) {
        super(name, id, email, employeeType, timeCard, unionMember);
        //TODO Auto-generated constructor stub
    }
    boolean salaried;
    boolean comissioned;
    boolean hourly;
}
