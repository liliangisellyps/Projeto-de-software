package src.employees;

import src.Payment;

public class Commissioned extends Employee{
    private int salary;
    private int comission;
    private SaleReport salesReport;
    
    public Commissioned(String name, int id, String address, UnionMember unionMember, Payment payment, int salary,
            int comission) {
        super(name, id, address, unionMember, payment);
        this.salary = salary;
        this.comission = comission;
    }
  
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getComission() {
        return comission;
    }
    public void setComission(int comission) {
        this.comission = comission;
    }
    public SaleReport getSalesReport() {
        return salesReport;
    }
    public void setSalesReport(SaleReport salesReport) {
        this.salesReport = salesReport;
    }
    
}
