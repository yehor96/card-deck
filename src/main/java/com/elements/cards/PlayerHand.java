package com.elements.cards;

import java.util.LinkedList;
import java.util.List;

public class PlayerHand {

    private List<Card> cards;

    public PlayerHand(List<Card> hand) {
        cards = new LinkedList<>();
        cards.addAll(hand);
    }

    public List<Card> getCards() {
        return cards;
    }

}
