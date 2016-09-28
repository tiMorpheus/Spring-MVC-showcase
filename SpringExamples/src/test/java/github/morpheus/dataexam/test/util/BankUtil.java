package github.morpheus.dataexam.test.util;

import github.tiMorpheus.dataexam.entity.Bank;

public class BankUtil {

    public static Bank createBank() {
        Bank bank = new Bank();
        bank.setName("Gold Bank");

        return bank;
    }
}
