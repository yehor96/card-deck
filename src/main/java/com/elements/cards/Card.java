package com.elements.cards;

public class Card implements Comparable<Card> {

    private final String name;
    private final int rank;
    private final Suit suit;

    public Card(CardType type, Suit suit) {
        name = type.getName();
        rank = type.getRank();
        this.suit = suit;
    }

    @Override
    public String toString() {
        return name + " of " + suit.getName();
    }

    public int compareTo(Card other) {
        return Integer.compare(other.rank, this.rank);
    }
}
