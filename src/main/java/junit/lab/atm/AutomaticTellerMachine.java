package junit.lab.atm;

public class AutomaticTellerMachine {

    CurrentMenu currentMenu;
    BankCard currentCard;
    private BankService bankService;

    public AutomaticTellerMachine() {
        this.currentMenu = CurrentMenu.welcomeScreen;
    }

    public void setBankService(BankService bankService) {
        this.bankService = bankService;
    }

    public void insertCard(BankCard card){
        if(currentCard != null){
            throw new RuntimeException("There is already a bank card inserted");
        }

        if(bankService == null){
            throw new RuntimeException("There is no connection to the bank");
        }

        this.currentCard = card;
        this.currentMenu = CurrentMenu.insertPin;
    }

    public void insertPin(String pin){

        if(currentMenu != CurrentMenu.insertPin){
            throw new RuntimeException("You are not in the insert pin menu");
        }

        if(!bankService.isPinValid(currentCard, pin)){
            ejectCard();
            throw new RuntimeException("Your PIN is invalid");
        }

        currentMenu = CurrentMenu.insertAmount;
    }

    public Cash withdrawAmount(int amount){

        if(currentMenu != CurrentMenu.insertAmount){
            throw new RuntimeException("You are not in the amount menu");
        }

        if(!bankService.sufficientFundsforWithdrawal(currentCard, amount)){
            ejectCard();
            throw new RuntimeException("Insufficient funds in account");
        }

        bankService.makeWithdrawal(currentCard, amount);
        currentMenu = CurrentMenu.welcomeScreen;
        currentCard = null;

        return new Cash(amount, Currency.SEK);
    }

    public CurrentMenu getCurrentMenu() {
        return currentMenu;
    }

    public void cancelTransaction(){
        ejectCard();
    }

    private void ejectCard(){
        currentCard = null;
        currentMenu = CurrentMenu.welcomeScreen;
    }

    public enum CurrentMenu{
        welcomeScreen,
        insertPin,
        insertAmount;
    }

    public enum Currency{
        SEK,
        EUR,
        DKK
    }

}
