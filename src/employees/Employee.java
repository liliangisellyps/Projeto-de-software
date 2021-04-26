package src.employees;

import src.Payment;
import src.Payroll;

public class Employee extends Payroll {
    
    private String name;
    private int id;
    private String address;
    private UnionMember unionMember;
    private Payment payment;

    public Employee(String name, int id, String address, UnionMember unionMember, Payment payment) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.unionMember = unionMember;
        this.payment = payment;
    }

    public String employeeInfos(){
        return "name:" + this.getName() + "\nid:" + this.getId() + "\naddress:" + getAddress() + "\n";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UnionMember getUnionMember() {
        return unionMember;
    }

    public void setUnionMember(UnionMember unionMember) {
        this.unionMember = unionMember;
    }

    public Payment getPayment() {
        return payment;
    }
    
    public void setPayment(Payment payment) {
        this.payment = payment;
    }

}
