package com.drafael.study.letterO;

import com.drafael.study.letterS.TransactionProcessor;
import com.drafael.study.solid.Card;

public class MainO {

    public static void main(String[] args) {

        //| Open - Close Principle

        //En este caso, hemos extendido la clase Card con RewardCard sin modificar el código de la clase base,
        //siguiendo el principio de abierto/cerrado.

        var rewardCard = new RewardCard("reward", "1724", 5000);

        System.out.println("Es un tipo de tarjeta?: "+String.valueOf(rewardCard instanceof Card));



    }
}
