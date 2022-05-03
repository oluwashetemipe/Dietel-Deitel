package Chap7;

import java.security.SecureRandom;

public class DeckOfCards {
    private Card[] deck; //array of card objects
    private int currentCard;//index of next card to be dealt(0 - 51
    private static final int NUMBER_OF_CARDS = 52;//constant # of cards

    private static final SecureRandom random = new SecureRandom();

    //constructor fills deck of cards
    public DeckOfCards(){
        String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
        "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
    String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

    deck = new Card[NUMBER_OF_CARDS];//create array of Card Objects
        currentCard = 0;//first card to be dealt will be deck[0]

        //populate deck of Card objects
        for (int count = 0; count < deck.length; count++){
            deck[count] = new Card(faces[count % 13], suits[count/13]);
        }
    }
    //shuffle deck of cards with one pass algorithm
    public void shuffle(){
        //next call to method dealCard should start at deck[0] again
        currentCard = 0;
        //for each card, pick another random card (0-51) and swap them
        for (int first = 0; first < deck.length; first++){
            int second = random.nextInt(NUMBER_OF_CARDS);

            //swap current card with randomly selected card
            Card temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }
    //deal one card
    public Card dealCard(){
        //determine whether cards remain to be dealt
        if (currentCard < deck.length){
            return deck[currentCard++];//return current card in an array
        }
        else
            return null;//return null indicating all cards were dealt
    }
}

