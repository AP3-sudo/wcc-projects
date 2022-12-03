//Programmer: Albert Putranegoro & Nabil Dipo
//Class: CS145
//Date: 10/10/2022
//Assignment: Lab 3: Deck of Cards
//Purpose: Play Blackjack against a dealer

import java.util.Random;

public class Deck {
    private Card[] myCards;
    private int numCards;

    public Deck(){
        this(1, false);
    }

    // number of decks in the deck, decision shuffling cards
    public Deck(int numDecks, boolean shuffle) {
        this.numCards = numDecks * 52;
        this.myCards = new Card[this.numCards];
        int c = 0;
        //each deck
        for (int d=0; d<numDecks; d++) {
            //each suit
            for (int s=0; s<4; s++) {
                //each number
                for (int n=1; n<=13; n++){
                    this.myCards[c] = new Card(Suit.values()[s], n);
                    c++;
                }
            }
        }
        if (shuffle) {
            this.shuffle();
        }
    }

    public void shuffle() {
        Random num = new Random();
        //temporary card
        Card temp;

        //randomizer, swapping cards
        int j;
        for (int i = 0; i < this.numCards; i++) {

            j = num.nextInt(this.numCards);
            temp = this.myCards[i];
            this.myCards[i] = this.myCards[j];
            this.myCards[j] = temp;
        }
    }

    //for dealing next card
    public Card dealNextCard(){

        // top card
        Card top = this.myCards[0];

        //moving next cards by one index
        for (int c = 1; c < this.numCards; c++) {
            this.myCards[c-1] = this.myCards[c];
        }
        this.myCards[this.numCards-1] = null;

        //reduce number of cards in deck
        this.numCards--;

        return top;
    }
    //printing the deck of cards
    public void printDeck (int numToPrint) {
        for (int c = 0; c < numToPrint; c++) {
            System.out.printf("% 3d/%d %s\n", c+1, this.numCards, this.myCards[c].toString());
        }
        System.out.printf("\t\t[%d other]\n", this.numCards-numToPrint);
    }
}
