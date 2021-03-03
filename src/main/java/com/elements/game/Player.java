package com.elements.game;

import com.elements.cards.PlayerHand;

public class Player {

    private PlayerHand playerHand;
    private String name;

    public Player(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void getHand(PlayerHand hand) {
        playerHand = hand;
    }
}
