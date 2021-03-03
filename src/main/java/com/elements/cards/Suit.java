package com.elements.cards;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Suit {
    HEARTS("Hearts"),
    TILES("Tiles"),
    PIKES("Pikes"),
    CLOVERS("Clovers");

    @Getter
    private String name;
}
