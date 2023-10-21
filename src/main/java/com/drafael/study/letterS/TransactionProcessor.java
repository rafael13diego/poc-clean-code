package com.drafael.study.letterS;

import com.drafael.study.solid.Card;

public class TransactionProcessor {

    public void processTransaction(Card card, double amount) {
        if (amount > 0 && amount <= card.getBalance()) {
            card.setBalance(card.getBalance() - amount);
        } else {
            System.out.println("Monto no válido o insuficiente saldo.");
        }
    }
}
