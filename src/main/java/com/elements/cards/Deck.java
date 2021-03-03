package com.elements.cards;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

import static com.elements.cards.CardType.*;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = createDeck();
    }

    public List<Card> getHalf(boolean isFirstHalf) {
        var half = cards.size() / 2;
        return isFirstHalf
                ? cards.subList(0, half)
                : cards.subList(half, cards.size());
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    private List<Card> createDeck() {
        cards = new LinkedList<>();
        Stream.of(Suit.values()).forEach(suit -> cards.addAll(createSuit(suit)));
        return cards;
    }

    private List<Card> createSuit(Suit suit) {
        return new LinkedList<>(Arrays.asList(
                new Card(SIX, suit),
                new Card(SEVEN, suit),
                new Card(EIGHT, suit),
                new Card(NINE, suit),
                new Card(TEN, suit),
                new Card(VALET, suit),
                new Card(QUEEN, suit),
                new Card(KING, suit),
                new Card(ACE, suit)
        ));
    }

}
