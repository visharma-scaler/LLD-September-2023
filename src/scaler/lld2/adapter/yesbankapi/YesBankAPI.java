package scaler.lld2.adapter.yesbankapi;

import scaler.lld2.adapter.Balance;

public interface YesBankAPI {
    // any set of yes bank specific methods

    String addBankAccount(String accountId, String name);

    Balance checkBalance(String accountId);
}
