package no.nav.card.game;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class CardGame {
    private static Map<String , List<Integer>> cards= new HashMap<>();
    private static List<Integer> player1_card ;
    private static List<Integer> prizePile;
    public CardGame() {
        List<Integer> clubs = Arrays.asList(2,3,4,5,6,7,8,9);
        Collections.shuffle(clubs);
        List<Integer> diamond = Arrays.asList(2,3,4,5,6,7,8,9);
        Collections.shuffle(diamond);
        List<Integer> hearts = Arrays.asList(2,3,4,5,6,7,8,9);
        Collections.shuffle(hearts);
        List<Integer> spade = Arrays.asList(2,3,4,5,6,7,8,9);
        Collections.shuffle(spade);
        cards.put("Clubs", clubs);
        cards.put("Diamond", diamond);
        cards.put("Hearts", hearts);
        cards.put("Spade", spade);
        getPlayerCardsAndPrizePile();
    }

    private void getPlayerCardsAndPrizePile() {
        List<String> cardTypes = new ArrayList<>(cards.keySet());

        String playerCardType = getRandomCardType(cardTypes);
        String prizePileType = getRandomCardType(cardTypes);
        if (prizePileType.equalsIgnoreCase(playerCardType)) {
            prizePileType = getRandomCardType(cardTypes);
        }
        player1_card = cards.get(playerCardType);
        prizePile = cards.get(prizePileType);
    }

    private String getRandomCardType(List<String> cardTypes ) {
        int size = cardTypes.size();
        int randomIndex = new Random().nextInt(size);
        return cardTypes.get(randomIndex);
    }

    /**
     * The game is then played in a series of rounds.
     * Every time a card is selected from players own deck that symbolizes how much they want to bet to win the prize card.
     * the person who places the highest card wins the prize card
     */
    public GameResult startGame() {
        GameResult gameResult = new GameResult();
        int rounds = 1;
        int player1Points = 0;
        int player2Points = 0;
        for (int i = 0; i< prizePile.size(); i++) {
            System.out.println("Playing Round: " + rounds);
            Integer prize = prizePile.get(i);
            System.out.println("Value of Prize card:" + prize);
            Integer player1Card = player1_card.get(i);
            System.out.println("Player 1 bet:" + player1Card);
            Integer player2Card = prize;
            System.out.println("Player 2 bet:" + player2Card);
            if (player1Card > player2Card) {
                player1Points = player1Points + prize;
                System.out.println("Prize goes to Player 1");
            } else if (player2Card > player1Card) {
                player2Points = player2Points + prize;
                System.out.println("Prize goes to Player 2");
            } else {
                System.out.println("Draw");
            }
            rounds = rounds + 1;
        }
        gameResult.setPlayer1Points(player1Points);
        gameResult.setPlayer2Points(player2Points);
        return gameResult;
    }

    /**
     * Method to display winners.
     * Argument to this method is GameResult which is created and assigned values to the property while playing game.
     */
    public void displayWinners(GameResult gameResult) {
        int player1 = gameResult.getPlayer1Points();
        int player2 = gameResult.getPlayer2Points();
        System.out.println("Total no.of points for player 1: "+ player1);
        System.out.println("Total no.of points for player 2: "+ player2);
        if (player1 > player2) {
            System.out.println("Player 1 is the winner..");
        } else if (player2 > player1) {
            System.out.println("Player 2 is the winner...");
        } else {
            System.out.println("Match is Draw...");
        }
    }

}
