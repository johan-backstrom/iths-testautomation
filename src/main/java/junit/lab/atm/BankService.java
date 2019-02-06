package junit.lab.atm;

public class BankService {

    public boolean sufficientFundsforWithdrawal(BankCard card, int amount){
        // Talk to bank to find out if there is enough money
        return false;
    }

    public void makeWithdrawal(BankCard card, int amount){
        // Talk to the bank and remove money from account...
    }

    public boolean isPinValid(BankCard card, String pin){
        // Talk to the bank to check pin
        return false;
    }
}
