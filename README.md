# card-game
Language used is Java

* This repository implements a simple card game for two players.

* Form deck of cards of four different card types:
* And each type will have 2 to 9 cards(condition stated in the given task).
* Card and its values is stored in Map and then assigning set of cards of random type to player 1 and as a prize pile.
* As one of the players among the two is given a strategy to choose a card same as that of prize pile. The other player can choose a random card from his deck. So always the prize card and one of the players card will be the same. 
* The round played,  value of the prize card and the value each player has bet, is printed after each round. 
* "Draw" is printed if the players have the same score. 
* The score for each of the players as well as which player has won is printed out after all rounds.

Everything like the deck of cards, cards to the each players and prize pile is assigned in the constructor.

## Following java classes are created:

* PlayGame.java --- where main method is created and program is ran from this class.
* GameResult.java --- which stores the points of each player.
* CardGame.java --- Where the actual logic of the game is written, this class is having two methods
    1. startGame()
    2. displayWinners() -- this takes GameResult as an argument to check who is the winner.
  
## Sample output might look like this:

Playing Round: 1

Value of Prize card:2

Player 1 bet:7

Player 2 bet:2

Prize goes to Player 1

Playing Round: 2

Value of Prize card:3

Player 1 bet:3

Player 2 bet:3

Draw

Playing Round: 3

Value of Prize card:4

Player 1 bet:9

Player 2 bet:4

Prize goes to Player 1

Playing Round: 4

Value of Prize card:8

Player 1 bet:6

Player 2 bet:8

Prize goes to Player 2

Playing Round: 5

Value of Prize card:7

Player 1 bet:4

Player 2 bet:7

Prize goes to Player 2

Playing Round: 6

Value of Prize card:5

Player 1 bet:2

Player 2 bet:5

Prize goes to Player 2

Playing Round: 7

Value of Prize card:9

Player 1 bet:5

Player 2 bet:9

Prize goes to Player 2

Playing Round: 8

Value of Prize card:6

Player 1 bet:8

Player 2 bet:6

Prize goes to Player 1

Total no.of points for player 1: 12

Total no.of points for player 2: 29

Player 2 is the winner...



