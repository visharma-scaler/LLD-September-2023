package scaler.lld2.adapter;

import scaler.lld2.adapter.yesbankapi.YesBankAPI;
import scaler.lld2.adapter.yesbankapi.YesBankAPIImpl;

public class Client {
    public static void main(String[] args) {

        YesBankAPI yesBankAPI = new YesBankAPIImpl();
//        BankAPI bankAPI = new IciciAdapter();
        BankAPI bankAPI = new YesBankAdapter(yesBankAPI);
        PhonePe phonePe = new PhonePe(bankAPI);
        double amount = phonePe.performBankOperation();

        System.out.println("Returned amount is - " + amount);
    }
}
