package no.nav.card.game;

public class PlayGame {

    public static void main(String[] args) {
        CardGame cardGame = new CardGame();
        GameResult gameResult = cardGame.startGame();
        cardGame.displayWinners(gameResult);
    }
}

