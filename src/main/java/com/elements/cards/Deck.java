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

    public List<Card> getHalf(boolean first) {
        var firstItemOfSecondHalf = cards.size()/2+1;
        return first
                ? cards.subList(0, firstItemOfSecondHalf)
                : cards.subList(firstItemOfSecondHalf, cards.size());
    }

    public void shuffle() {
        Collections.shuffle(cards);
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
