package src.employees;

import java.time.LocalDate;

public class SaleReport {
    private LocalDate dateOfSale;
    private Double priceOfSale;

    public SaleReport(LocalDate dateOfSale, Double priceOfSale) {
        this.setDateOfSale(dateOfSale);
        this.setPriceOfSale(priceOfSale);
    }

    public Double getPriceOfSale() {
        return priceOfSale;
    }

    public void setPriceOfSale(Double priceOfSale) {
        this.priceOfSale = priceOfSale;
    }

    public LocalDate getDateOfSale() {
        return dateOfSale;
    }

    public void setDateOfSale(LocalDate dateOfSale) {
        this.dateOfSale = dateOfSale;
    }
}
