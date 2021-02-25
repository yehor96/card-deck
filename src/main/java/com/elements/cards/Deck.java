package com.elements.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import static com.elements.cards.CardType.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = createDefaultDeck();
    }

    public void add(Card... newCards) {
        for (var each : newCards) {
            cards.add(cards.size(), each);
        }
    }

    public Card pop() {
        return cards.remove(0);
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public int getDeckSize() {
        return cards.size();
    }

    private static List<Card> createDefaultDeck() {
        return new LinkedList<>(Arrays.asList(
                new Card(SIX),
                new Card(SEVEN),
                new Card(EIGHT),
                new Card(NINE),
                new Card(TEN),
                new Card(VALET),
                new Card(QUEEN),
                new Card(KING),
                new Card(ACE)
        ));
    }

}
