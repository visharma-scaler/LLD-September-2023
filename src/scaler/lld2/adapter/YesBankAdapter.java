package scaler.lld2.adapter;

import scaler.lld2.adapter.yesbankapi.YesBankAPI;

public class YesBankAdapter implements BankAPI {

    private final YesBankAPI yesBankAPI;

    public YesBankAdapter(YesBankAPI yesBankAPI) {
        this.yesBankAPI = yesBankAPI;
    }

    @Override
    public void addBankAccount(BankAccount bankAccount) {
        String accountId = yesBankAPI.addBankAccount(bankAccount.getAccountNumber(), bankAccount.getAccountHolderName());
        System.out.println("Added bank account successfully");
    }

    @Override
    public double checkBalance(BankAccount account) {
        Balance balance = yesBankAPI.checkBalance(account.getAccountNumber());
        return balance.getAmount();
    }

    public void sayHello() {
        System.out.println("Hello");
    }
}
