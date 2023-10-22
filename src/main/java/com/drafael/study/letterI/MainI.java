package com.drafael.study.letterI;

public class MainI {

    public static void main(String[] args) {

        //Tenemos interfaces específicas para tipos de pago,
        // lo que evita que una clase deba implementar métodos que no necesita

        var checkPayment = new CheckPayment("12345");
        var creditCardPayment = new CreditCardPayment("1234","1227");

        checkPayment.processPayment(15);
        creditCardPayment.processPayment(20);
    }

}
