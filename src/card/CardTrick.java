/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package card;

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 * Modified by: Yoon-Ho Choi 
 * 991809741
 * May 21, 2025
*/

import java.util.Random;
import java.util.Scanner;
        
public class CardTrick {
    
    public static void main(String[] args)
    {
        Card[] magicHand = new Card[7];
        
        for (int i=0; i<magicHand.length; i++)
        {
            Random rnd = new Random();
            
            // create the card and set values
            Card c = new Card();
            c.setValue(rnd.nextInt(1, 13));
            c.setSuit(Card.SUITS[rnd.nextInt(0,3)]);
            
            // add the card to the index of the array
            magicHand[i] = c;
            
            //print the values of the card
            System.out.println( i+1 + "th card \n" +c.toString() + "\n");
        }

        // add one luckcard hard code 2,clubs
        Card luckyCard = new Card();
            luckyCard.setSuit("Spades");
            luckyCard.setValue(1);
        System.out.println(pickCard.toString());
    
        // and search magicHand here
        //Then report the result here
        System.out.println("\n_____Searching for a Match____");
        String result = "No Match"; 
        
        for (Card card : magicHand){
            if (card.toString().equals(luckyCard.toString()))
                { result = "Match";}
        }
        System.out.println("Result: " + result);
        

    }
    
}
