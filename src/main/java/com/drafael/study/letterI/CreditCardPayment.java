package com.drafael.study.letterI;

public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expirationDate;

    public CreditCardPayment(String cardNumber, String expirationDate) {
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }

    public void processPayment(double amount) {
        // Procesar el pago con tarjeta de crédito
    }
}
