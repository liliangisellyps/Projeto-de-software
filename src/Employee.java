public class Employee {
    
    String name;
    String id;
    String email;
    EmployeeType employeeType;
    TimeCard timeCard;
    UnionMember unionMember;

    public Employee(String name, String id, String email, EmployeeType employeeType, TimeCard timeCard, UnionMember unionMember){
        this.name = name;
        this.id = id;
        this.email = email;
        this.employeeType = employeeType;
        this.timeCard = timeCard;
        this.unionMember = unionMember;
    }

    public String printEmployeeInfo(Employee employee){
        return "Name: " + this.name +
        "\n---------------------"+
        "Name: " + employee.name;
    }
}
