/**
 *
 */
package com.damore.tutorial.playingcards;

import java.util.List;
import java.util.ArrayList;

/**
 *
 */
public class Card {
    private Rank rank;
    private Suit suit;

    public enum Rank {
       ACE,TWO,THREE,FOUR,FIVE,
       SIX,SEVEN,EIGHT,NINE,TEN,
       JACK,QUEEN,KING
    }

    public enum Suit {
       SPADES,CLUBS,DIAMONDS,HEARTS
    }

    public Card(Rank rank, Suit suit) {
      this.rank = rank;
      this.suit = suit;
    }

    public Rank getRank() {
       return this.rank;
    }
    
    public Suit getSuit() {
       return this.suit;
    }
    
    public void setRank(Rank rank) {
       this.rank = rank;
    }
    
    public void setSuit(Suit suit) {
       this.suit = suit;
    }
   
    public void print() {
         System.out.println(this.suit + " " + this.rank);
    }

    public static void main(String[] args) {
        List<Card> cards = new ArrayList<>();
        cards.add(new Card(Rank.FIVE, Suit.SPADES));
        cards.add(new Card(Rank.ACE, Suit.CLUBS));
        cards.add(new Card(Rank.FOUR, Suit.DIAMONDS));
        cards.add(new Card(Rank.FOUR, Suit.HEARTS));

        for (Card c : cards) {
          c.print();
        }
   }
}
