//Programmer: Albert Putranegoro & Nabil Dipo
//Class: CS145
//Date: 10/10/2022
//Assignment: Lab 3: Deck of Cards
//Purpose: Play Blackjack against a dealer

public class Card {
    private Suit mySuit;
    private int myNumber;
    public Card(Suit aSuit, int aNumber) {
        this.mySuit = aSuit; // suit of card
        this.myNumber = aNumber; // number of card
        if (aNumber >=1 && aNumber<=13) {
            this.myNumber = aNumber;
        } else {
            System.err.println("Input not valid");
            System.exit(1);
        }
    }
    // card numbers
    public int getNumber(){
        return myNumber;
    }
    public String toString(){
        String numStr = "error";

        switch(this.myNumber){
            case 2:
                numStr = "Two ";
                break;
            case 3:
                numStr = "Three ";
                break;
            case 4:
                numStr = "Four ";
                break;
            case 5:
                numStr = "Five ";
                break;
            case 6:
                numStr = "Six ";
                break;
            case 7:
                numStr = "Seven ";
                break;
            case 8:
                numStr = "Eight ";
                break;
            case 9:
                numStr = "Nine ";
                break;
            case 10:
                numStr = "Ten ";
                break;
            case 11:
                numStr = "Jack ";
                break;
            case 12:
                numStr = "Queen ";
                break;
            case 13:
                numStr = "King ";
                break;
            case 1:
                numStr = "Ace ";
                break;
        }
        return numStr + mySuit.toString();
    }
}
