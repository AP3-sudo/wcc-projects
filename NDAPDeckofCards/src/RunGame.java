//Programmer: Albert Putranegoro & Nabil Dipo
//Class: CS145
//Date: 10/10/2022
//Assignment: Lab 3: Deck of Cards
//Purpose: Play Blackjack against a dealer

import java.util.Scanner;

public class RunGame {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Deck theDeck = new Deck(1, true);

        Player me = new Player("Player");
        Player dealer = new Player ("Dealer");

        me.addCard(theDeck.dealNextCard());
        dealer.addCard(theDeck.dealNextCard());

        //print initial hands
        System.out.println("Cards are dealt \n");
        me.printHand(true);
        dealer.printHand(false);
        System.out.println("\n");

        boolean meDone = false;
        boolean dealerDone = false;
        String ans;

        //decision to hit or not, also to show dealer decisions
        while (!meDone || !dealerDone){
            if (!meDone){
                System.out.print("Hit or Stay? (Enter H or S): ");
                ans = sc.next();
                System.out.println();

                if (ans.compareToIgnoreCase("H") == 0) {
                    meDone = !me.addCard(theDeck.dealNextCard());
                    me.printHand(true);
                } else {
                    meDone = true;
                }
            }
            if (!dealerDone) {
                if (dealer.getHandTotal() < 17) {
                    System.out.println("Dealer hits\n");
                    dealerDone = !dealer.addCard(theDeck.dealNextCard());
                    dealer.printHand(false);
                } else {
                    System.out.println("Dealer stays \n");
                    dealerDone = true;
                }
            }
            System.out.println();
        }
        sc.close();
        //to print final results
        me.printHand(true);
        dealer.printHand(true);

        int mySum = me.getHandTotal();
        int dealerSum = dealer.getHandTotal();

        // if exceeds 21, it's a bust and dealer wins (vice versa)
        if (mySum > dealerSum && mySum <=21 || dealerSum > 21){
            System.out.println("You win");
        } else {
            System.out.println("Dealer wins");
        }
    }
}
