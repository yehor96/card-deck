package com.elements.game;

import com.elements.cards.Card;

public class Game {

    private Player player1;

    private Player player2;

    public Game(String playerName1, String playerName2) {
        player1 = new Player(playerName1);
        player2 = new Player(playerName2);
    }

    public void start() {
        System.out.println("Game starts ...");
        shuffleCards();
        while (player1.hasCards() || player2.hasCards()) {
            drawCards();
        }
        printWinner();
    }

    private void drawCards() {
        Card cardOfPlayer1 = player1.drawCard();
        Card cardOfPlayer2 = player2.drawCard();

        System.out.println("Player1: " + cardOfPlayer1);
        System.out.println("Player2: " + cardOfPlayer2);
        int result = cardOfPlayer1.compareTo(cardOfPlayer2);
        switch (result) {
            case -1:
                player2.takeCards(cardOfPlayer1, cardOfPlayer2);
                return;
            case 1:
                player1.takeCards(cardOfPlayer1, cardOfPlayer2);
                return;
            default:
                player1.takeCards(cardOfPlayer1);
                player2.takeCards(cardOfPlayer2);
        }
    }

    private void printWinner() {
        var player1Cards = player1.getNumberOfCardOnHand();
        var player2Cards = player2.getNumberOfCardOnHand();

        System.out.println("Player1 cards left: " + player1Cards);
        System.out.println("Player2 cards left: " + player2Cards);

        if (player1Cards > player2Cards)
            System.out.println("Winner is " + player2);
        else
            System.out.println("Winner is " + player1);
    }

    private void shuffleCards() {
        player1.shuffleOwnCards();
        player2.shuffleOwnCards();
    }

}
