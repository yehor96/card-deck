package com.elements.cards;

import java.util.List;

public class PlayerHand {

    private List<Card> cards;

    public List<Card> getCards() {
        return cards;
    }

    public void addCards(List<Card> hand) {
        cards.addAll(hand);
    }

}
