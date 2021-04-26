package src.employees;

import java.util.ArrayList;
import java.util.List;

import src.Payment;

public class Hourly extends Employee {
    private int hourSalary;
    
    private List<TimeCard> timecard;
    
    public Hourly(String name, int id, String address, UnionMember unionMember, Payment payment, int employeeType,
            int hourSalary) {
        super(name, id, address, unionMember, payment, employeeType);
        this.hourSalary = hourSalary;
        this.timecard = new ArrayList<TimeCard>();
    }
    public int getHourSalary() {
        return hourSalary;
    }
 
    public void setHourSalary(int hourSalary) {
        this.hourSalary = hourSalary;
    }

    public List<TimeCard> getTimecard() {
        return this.timecard;
    }
 
    public void setTimecard(List<TimeCard> timecard) {
        this.timecard = timecard;
    }
}
