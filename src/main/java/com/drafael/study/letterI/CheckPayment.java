package com.drafael.study.letterI;

public class CheckPayment implements PaymentMethod {
    private String accountNumber;

    public CheckPayment(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void processPayment(double amount) {
        // Procesar el pago con cheque
    }
}