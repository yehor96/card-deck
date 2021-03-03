package com.elements.game;

import com.elements.cards.Deck;
import com.elements.cards.PlayerHand;

public class Host {

    private Deck deck;
    private PlayerHand playerHand1;
    private PlayerHand playerHand2;

    public void prepareCards() {
        deck = new Deck();
        deck.shuffle();
        playerHand1.addCards(deck.getHalf(true));
        playerHand2.addCards(deck.getHalf(false));
    }

    public void providePlayerHand(Player player) {
        player.getHand(playerHand1);
    }

}
