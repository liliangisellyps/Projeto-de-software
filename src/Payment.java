package src;

public class Payment {
    private PaymentMethod paymentMethod;
    private int bank;
    private int agency;
    private int account;

    public Payment(PaymentMethod paymentMethod, int bank2, int agency2, int account2) {
        this.setPaymentMethod(paymentMethod);
        this.setBank(bank2);
        this.setAgency(agency2);
        this.setAccount(account2);
    }

    public int getAccount() {
        return account;
    }

    public void setAccount(int account) {
        this.account = account;
    }

    public int getAgency() {
        return agency;
    }

    public void setAgency(int agency) {
        this.agency = agency;
    }

    public int getBank() {
        return bank;
    }

    public void setBank(int bank) {
        this.bank = bank;
    }

    public PaymentMethod getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }    
}
