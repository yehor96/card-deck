package com.elements.game;

import com.elements.cards.PlayerHand;

public class Player {

    private PlayerHand cards;

    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void getHand(PlayerHand hand) {
        cards = hand;
    }
}
