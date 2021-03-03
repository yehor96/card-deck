package com.elements.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum CardType {

    SIX("Six", 1),
    SEVEN("Seven", 2),
    EIGHT("Eight", 3),
    NINE("Nine", 4),
    TEN("Ten", 5),
    VALET("Valet", 6),
    QUEEN("Queen", 7),
    KING("King", 8),
    ACE("Ace", 9);

    @Getter
    private String name;
    @Getter
    private int rank;
}
