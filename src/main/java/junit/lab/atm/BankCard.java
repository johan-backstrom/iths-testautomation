package junit.lab.atm;

public class BankCard {

    private String cardNumber;
    private int expiryYear;
    private int getExpiryMonth;

    public String getCardNumber() {
        return cardNumber;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public int getGetExpiryMonth() {
        return getExpiryMonth;
    }

    public BankCard(String cardNumber, int expiryYear, int getExpiryMonth) {
        this.cardNumber = cardNumber;
        this.expiryYear = expiryYear;
        this.getExpiryMonth = getExpiryMonth;
    }
}
