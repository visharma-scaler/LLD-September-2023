package scaler.lld2.adapter;

public class PhonePe {

    private final BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    double performBankOperation() {
        BankAccount bankAccount = new BankAccount("9876543213123", "Vishal");
        bankAPI.addBankAccount(bankAccount);
        double balance = bankAPI.checkBalance(bankAccount);
        System.out.println("Account balance is - " + balance);
        return balance;
    }
}
