package src.employees;

public class UnionMember {
    int monthlyTax;
    int serviceTaxes;
    int idUT;
    
    public UnionMember(int monthlyTax, int serviceTaxes, int idUT) {
        this.monthlyTax = monthlyTax;
        this.serviceTaxes = serviceTaxes;
        this.idUT = idUT;
    }

    public int getMonthlyTax() {
        return monthlyTax;
    }

    public void setServiceTaxes(int serviceTaxes) {
        this.serviceTaxes = serviceTaxes;
    }

    public int getServiceTaxes() {
        return serviceTaxes;
    }
}
