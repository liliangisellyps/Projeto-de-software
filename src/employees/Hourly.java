package src.employees;

import src.Payment;

public class Hourly extends Employee {
    private int hourSalary;
    private TimeCard timecard;
   
    public Hourly(String name, int id, String address, UnionMember unionMember, Payment payment, int hourSalary) {
        super(name, id, address, unionMember, payment);
        this.hourSalary = hourSalary;
    }

    public int getHourSalary() {
        return hourSalary;
    }
 
    public void setHourSalary(int hourSalary) {
        this.hourSalary = hourSalary;
    }

    public TimeCard getTimecard() {
        return timecard;
    }
 
    public void setTimecard(TimeCard timecard) {
        this.timecard = timecard;
    }
}
