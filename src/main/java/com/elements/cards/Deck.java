package com.elements.cards;

import com.elements.enums.CardType;
import com.elements.enums.Half;
import com.elements.enums.Suit;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class Deck {

    private List<Card> cards;

    public Deck() {
        cards = createDeck();
    }

    public List<Card> getHalf(Half half) {
        var mid = cards.size() / 2;
        switch (half) {
            case FIRST:
                return cards.subList(0, mid);
            case SECOND:
                return cards.subList(mid, cards.size());
            default:
                throw new IllegalArgumentException(
                        "Should provide either first or second half. " + half + " is unknown");
        }
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
        List<Card> cards = new LinkedList<>();
        Stream.of(CardType.values()).forEach(type -> cards.add(new Card(type, suit)));
        return cards;
    }

}
