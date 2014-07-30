package com.damore.tutorial.playingcards;

import java.util.List;
import java.util.ArrayList;

public class FullDeckOfCards {
    
    private List<Card> cards;

    public FullDeckOfCards() {
      this.cards = new ArrayList<>(52);
      for(Card.Suit s : Card.Suit.values()) {
        for(Card.Rank r : Card.Rank.values()) {
           cards.add(new Card(r, s));
        }
      }
    }

    public List<Card> getCards() {
      return this.cards;
    }

    public void setCards(List<Card> cards) {
      this.cards = cards;
    }

    public static void main(String[] args) {
      FullDeckOfCards fullDeck = new FullDeckOfCards();
      for (Card c : fullDeck.getCards()) {
        c.print();
      }
    }
}

