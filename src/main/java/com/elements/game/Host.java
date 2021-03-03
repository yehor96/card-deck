package com.elements.game;

import com.elements.cards.Deck;
import com.elements.cards.PlayerHand;

public class Host {

    private Deck deck;
    private PlayerHand playerHand1;
    private PlayerHand playerHand2;

    public void prepareCards() {
        deck = new Deck();
        playerHand1 = new PlayerHand();
        playerHand2 = new PlayerHand();
        deck.shuffle();
        playerHand1.setUp(deck.getHalf(true));
        playerHand2.setUp(deck.getHalf(false));
    }

    public void provideHandToPlayers(Player player1, Player player2) {
        player1.getHand(playerHand1);
        player2.getHand(playerHand2);
    }

}
