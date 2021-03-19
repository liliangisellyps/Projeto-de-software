public class Employee {
    
    String name;
    String address;
    double timeCard;

    public Employee(String name, String address, double timeCard){
        this.name = name;
        this.address = address;
        this.timeCard = timeCard;
    }

    public String printEmployeeInfo(Employee employee){
        return "Name: " + this.name +
        "\nAdress: " + this.address +
        "\nTimeCard: " + this.timeCard +
        "\n---------------------"+
        "Name: " + employee.name +
        "\nAdress: " + employee.address +
        "\nTimeCard: " + employee.timeCard;
    }
}
