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
        
        
        //insert code to ask the user for Card value and suit, create their card
        final String [] suitList = {"Hearts", "Diamonds", "Spades", "Clubs"};
        
        
        //create scanner and create a card
        Card pickCard = new Card();
        Scanner scan = new Scanner(System.in);
        
        
        //a loop continues until both Suit and Value are valid 
        while(pickCard.getSuit()==null || pickCard.getValue()==0){
        //ask user for a number 1-13, encase in try block incase of misinput
        try{
        System.out.println("Enter a Number between 1-13: ");
        String input = scan.nextLine();
        
        //Parse the input to see if its an Integer
        int number = Integer.parseInt(input);
        
        //if number between 1-13, set number of card
        //if not throw out of bounds Exception
        if (number >= 1 && number <= 13)
            {
            System.out.println("Number Selected: " + number + "\n");
            pickCard.setValue(number);
            }
        else
            {throw new Exception();}
        }//end try block
        catch(Exception err)
           {System.out.println("Invalid Input, try again\n");}
        
        
        //ask user for a suit, encase in try block incase of misinput
        try{
        //ask user for a suit
        System.out.println("Enter a Card Suit:");
        String input1 = scan.nextLine();
        
        //Loop through the list of suits
        
        for (int i = 0; i <= suitList.length ; i++){
            
            // if the input matches a valid suit then set the suit and break the for loop
            // if the input does not match a suit the for loop will go out of bounds and cause an exception
            if (suitList[i].equals(input1))
                   {pickCard.setSuit(input1);
                    System.out.println("Suit Selected: " + input1 + "\n");
                    break;}

            }//end for loop
        

        }//end try block

        catch(Exception e){
        System.out.println("Invalid Input, try again\n");
        }
        
        }//end while loop
        
        //finally you can print the chosen card
        
        System.out.println(pickCard.toString());
    
        // and search magicHand here
        //Then report the result here
        // add one luckcard hard code 2,clubs
    }
    
}
