package com.dicoding.javafundamental.belajar.enumbelajar;

public class Card {

    public Suit suit;
    public int valueOfCard;

    public static final int ACE = 1;
    public static final int JACK = 11;
    public static final int QUEEN = 12;
    public static final int KING = 13;


    public Card(int valueOfCard, Suit suit) {
        this.valueOfCard= valueOfCard;
        this.suit=suit;
    }
    public static void main(String[] args) {
        System.out.println(Suit.C);
    }
}
