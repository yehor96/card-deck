package com.elements.game;

import com.elements.cards.Card;
import com.elements.cards.Deck;

public class Player {

    private Deck cards;

    private String name;

    public Player(String name) {
        this.name = name;
        cards = new Deck();
    }

    @Override
    public String toString() {
        return name;
    }

    public Card drawCard() {
        return cards.pop();
    }

    public void takeCards(Card... newCards) {
        cards.add(newCards);
    }

    public boolean hasCards() {
        return cards.getDeckSize() > 0;
    }

    public int getNumberOfCardOnHand() {
        return cards.getDeckSize();
    }

    public void shuffleOwnCards() {
        cards.shuffle();
    }
}
