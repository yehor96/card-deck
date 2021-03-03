package com.elements.game;

import com.elements.cards.Deck;
import com.elements.cards.PlayerHand;
import com.elements.enums.Half;

public class Host {

    private Deck deck;
    private PlayerHand playerHand1;
    private PlayerHand playerHand2;

    public void prepareCards() {
        deck = new Deck();
        deck.shuffle();
        playerHand1 = new PlayerHand(deck.getHalf(Half.FIRST));
        playerHand2 = new PlayerHand(deck.getHalf(Half.SECOND));
    }

    public void provideHandToPlayers(Player player1, Player player2) {
        player1.getHand(playerHand1);
        player2.getHand(playerHand2);
    }

}
