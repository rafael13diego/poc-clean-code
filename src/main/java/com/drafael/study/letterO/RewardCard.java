package com.drafael.study.letterO;

import com.drafael.study.solid.Card;
import lombok.*;


@Data
public class RewardCard extends Card {

    private int rewardPoints;

    public RewardCard(String number, String expirationDate, double balance) {
        super(number, expirationDate, balance);
        rewardPoints = 0;
    }

    public void earnRewardPoints(int points) {
        rewardPoints += points;
    }
}