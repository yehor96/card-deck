package com.elements;

import com.elements.game.Host;
import com.elements.game.Player;

public class Main {

    public static void main(String[] args) {
        Host host = new Host();
        Player player1 = new Player("Tim");
        Player player2 = new Player("Martin");

        host.prepareCards();
        host.provideHandToPlayers(player1, player2);
    }

}
