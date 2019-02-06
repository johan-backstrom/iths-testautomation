package junit.lab.atm;

public class Cash {

    private final int amount;
    private final AutomaticTellerMachine.Currency currency;

    public Cash(int amount, AutomaticTellerMachine.Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public AutomaticTellerMachine.Currency getCurrency() {
        return currency;
    }
}
