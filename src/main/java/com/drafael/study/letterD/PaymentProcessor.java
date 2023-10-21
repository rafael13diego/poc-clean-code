package com.drafael.study.letterD;

import com.drafael.study.letterI.PaymentMethod;

public class PaymentProcessor {

    //La clase PaymentProcessor depende de una abstracción (PaymentMethod) en lugar de depender de clases concretas,
    // lo que sigue el principio de inversión de dependencia
    private PaymentMethod paymentMethod;

    public PaymentProcessor(PaymentMethod paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public void processPayment(double amount) {
        paymentMethod.processPayment(amount);
    }
}
