package com.drafael.study.solid;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@AllArgsConstructor
public class Card {

    private String number;
    private String expirationDate;
    private double balance;
}
