package scaler.lld2.adapter.yesbankapi;

import scaler.lld2.adapter.Balance;

public class YesBankAPIImpl implements YesBankAPI {

    @Override
    public String addBankAccount(String accountId, String name) {
        System.out.println("Adding bank account via Yes Bank API");
        return accountId;
    }

    @Override
    public Balance checkBalance(String accountId) {
        return new Balance(100.39);
    }
}
