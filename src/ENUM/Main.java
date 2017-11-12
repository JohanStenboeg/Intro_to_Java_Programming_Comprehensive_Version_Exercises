package ENUM;

public class Main {
    /*
Program function:
A card value calculator with 13 cards.
Author:
Johan Stenbøg
Reason:
Homework during education.
Due date:
2/10 2017
Country:
Denmark
*/
    Card card;
    //Declaring the variables, so that highCard, faceCard equals a playing card with a picture.
    static Card highCard = Card.ACE;
    static Card faceCard = Card.KING;
    //Declareing the variables, so that card1 and card2 is a playing card between 2 and 10.
    static Card card1 = Card.FIVE;
    static Card card2 = Card.NINE;
    //Declareing the values of card1 and card2.
    static int card1Val = 5;
    static int card2Val = 9;

    //Constructor
    public Main(Card card) {
        this.card = card;
    }

    public static void main(String[] args) {
        //A hand giving blackjack.
        System.out.println("A blackjack hand: " + highCard + " and " + faceCard);
        //The 2 declared cards between 2 and 10.
        System.out.println("A two card hand: " + card1 + " and " + card2);
        //The total value of the 2 cards between 2 and 10.
        System.out.println("Value of Hand: " + (card1Val + card2Val));


    }
}
