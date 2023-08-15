package main.java.com.samarth.javatutorial;


import java.util.Random;

class Game {
    int numPlayers;
    int numCardsPerPlayer;
    int cardsRequiredToBeOpened;

    public int getNumPlayers() {
        return numPlayers;
    }

    public void setNumPlayers(int numPlayers) {
        this.numPlayers = numPlayers;
    }

    public int getNumCardsPerPlayer() {
        return numCardsPerPlayer;
    }

    public void setNumCardsPerPlayer(int numCardsPerPlayer) {
        this.numCardsPerPlayer = numCardsPerPlayer;
    }

    public int getCardsRequiredToBeOpened() {
        return cardsRequiredToBeOpened;
    }

    public void setCardsRequiredToBeOpened(int cardsRequiredToBeOpened) {
        this.cardsRequiredToBeOpened = cardsRequiredToBeOpened;
    }

    Game(int numPlayers, int numCardsPerPlayer, int cardsRequiredToBeOpened){
        this.numPlayers = numPlayers;
        this.numCardsPerPlayer = numCardsPerPlayer;
        this.cardsRequiredToBeOpened = cardsRequiredToBeOpened;
    }

    void distributeCards(Card[] deck){
        if(numPlayers * numCardsPerPlayer + cardsRequiredToBeOpened > 52){
            System.out.println("Too many players");
        }

        Random random = new Random();
        int currPlayer = 0;
        for(int i = 0; i < numCardsPerPlayer * numPlayers; i++){
            if(i % 2 == 0){
                currPlayer++;
                System.out.println("");
            }
            System.out.print("Player " + currPlayer + " : ");
            System.out.print(deck[random.nextInt(52)] + " ");
        }
    }

    void openCards(Card[] deck){
        Random random = new Random();
        for(int i = 0; i < cardsRequiredToBeOpened; i++){
            System.out.print("Open Cards : ");
            System.out.print(deck[random.nextInt(52)] + " ");
        }

    }
}

class Poker extends Game{
    Poker(int numPlayers, int numCardsPerPlayer, int cardsRequiredToBeOpened) {
        super(numPlayers, numCardsPerPlayer, cardsRequiredToBeOpened);
    }

}

class Rummy extends Game{
    Rummy(int numPlayers, int numCardsPerPlayer, int cardsRequiredToBeOpened) {
        super(numPlayers, numCardsPerPlayer, cardsRequiredToBeOpened);
    }
}

class Card{
    String faceValue; //1-13
    String suit;

    Card(String faceValue, String suit) {
        this.faceValue = faceValue;
        this.suit = suit;
    }
}

class Deck{
    public Card[] getDeck() {
        return deck;
    }

    Card[] deck = new Card[52];

    Deck(){
        String[] suits = new String[4];
        suits[0] = "Hearts";
        suits[1] = "Clubs";
        suits[2] = "Diamonds";
        suits[3] = "Spades";

        int j = 0;

        for(int i = 0; i < 52; i++){
            if(i % 13 == 0){
                j += 1;
            }
            this.deck[i] = new Card(String.valueOf(i%13) + 1, suits[j]);
        }
    }
}

public class CardGame{
    public static void main(String[] args) {
        Deck obj = new Deck();
        Card[] deck = obj.getDeck();

        Poker poker = new Poker(4, 2, 5);
        poker.distributeCards(deck);
        poker.openCards(deck);
    }
}