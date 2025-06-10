package com.auth0field.hrimobiledemo.consent.authorization.details.payments;

public class CreditorAccount {
    private final String iban;
    private final String accountNumber;

    public CreditorAccount(String iban, String accountNumber) {
        this.iban = iban;
        this.accountNumber = accountNumber;
    }

    public String getIban() {
        return iban;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
