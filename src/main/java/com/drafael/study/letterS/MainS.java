package com.drafael.study.letterS;

import com.drafael.study.solid.Card;

public class MainS {

    public static void main(String[] args) {

        //Singles Responsability, Card se encarga de generar este objeto
        // TransactionProcessor de las operaciones con las tarjetas
        var card = new Card("123","1127",1000);

        System.out.println(card);
        var processor = new TransactionProcessor();
        processor.processTransaction(card, 500);

        System.out.println(card);
    }

}
