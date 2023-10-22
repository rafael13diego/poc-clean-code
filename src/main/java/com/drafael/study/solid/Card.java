package com.drafael.study.solid;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Card {

    private String number;
    private String expirationDate;
    private double balance;
}
