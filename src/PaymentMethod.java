package src;


public class PaymentMethod {
    Boolean mailCheck;
    Boolean handCheck;

    public PaymentMethod(Boolean mailCheck, Boolean handCheck, Boolean bankAccount) {
        this.mailCheck = mailCheck;
        this.handCheck = handCheck;
        this.bankAccount = bankAccount;
    }
    Boolean bankAccount;


    public Boolean getMailCheck() {
        return mailCheck;
    }
    public void setMailCheck(Boolean mailCheck) {
        this.mailCheck = mailCheck;
    }
    public Boolean getHandCheck() {
        return handCheck;
    }
    public void setHandCheck(Boolean handCheck) {
        this.handCheck = handCheck;
    }
    public Boolean getBankAccount() {
        return bankAccount;
    }
    public void setBankAccount(Boolean bankAccount) {
        this.bankAccount = bankAccount;
    }
}
