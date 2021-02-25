package com.elements.cards;

public class Card implements Comparable<Card> {

    private final String name;
    private final int rank;

    public Card(CardType type) {
        name = type.getName();
        rank = type.getRank();
    }

    @Override
    public String toString() {
        return name;
    }

    public int compareTo(Card other) {
        return Integer.compare(other.rank, this.rank);
    }
}
