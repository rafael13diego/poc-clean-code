package com.drafael.study.letterL;

import com.drafael.study.letterO.RewardCard;
import com.drafael.study.letterS.TransactionProcessor;
import com.drafael.study.solid.Card;

public class MainL {

    public static void main(String[] args) {

        //El principio de Liskov se demuestra en la capacidad de usar una subclase en lugar de la clase base sin problemas.
        // En este caso, la clase RewardCard es una subclase de Card y puede usarse en lugar de Card sin problemas.

        Card card = new RewardCard("123","1727",5000);
        RewardCard rewardCard = new RewardCard("1234", "1727", 4000);

        System.out.println(card);
        rewardCard.earnRewardPoints(5);
        System.out.println(rewardCard.getRewardPoints());

        var transactionProcessor = new TransactionProcessor();
        transactionProcessor.processTransaction(card,1000);
        transactionProcessor.processTransaction(rewardCard,1000);

        System.out.println("Saldo final: "+card);
        System.out.println("Saldo final: "+rewardCard);
    }
}
