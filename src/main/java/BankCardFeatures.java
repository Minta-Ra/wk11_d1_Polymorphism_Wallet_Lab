public abstract class BankCardFeatures {

    private String cardNumber;
    private String expiryDate;
    private int securityNumber;

    public BankCardFeatures(String cardNumber, String expiryDate, int securityNumber){
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.securityNumber = securityNumber;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public int getSecurityNumber() {
        return securityNumber;
    }
}
