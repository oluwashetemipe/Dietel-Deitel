package Chap7;

public class Card {
    private final String face;//face of card
    private final String suit;//suit of card

    //two argument constructor initializes cards face and suit

    public Card(String face, String suit) {
        this.face = face;//initialize face card
        this.suit = suit;//initialize suit of card
    }

    //return String representation of card
    public String toString() {
        return face + " of " + suit;
    }
}
