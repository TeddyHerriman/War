// Teddy Herriman - CS110
// import utility
import java.util.Random;
import java.util.ArrayList;

public class Deck extends cardPile {

   final int CARDS_IN_DECK = 52;

   // collection of cards
   private ArrayList<Card> deck;
   private ArrayList<Card> playerDeck;
   private ArrayList<Card> computerDeck;
   
   /**
   Constructor generates a 52 card deck in order in ArrayList deck
   */
   public Deck(){
      deck = new ArrayList<Card>();
      for (int r = Card.ACE; r<=Card.KING;r++){
         for (int s=Card.SPADES;s<=Card.CLUBS;s++){
           deck.add(new Card(r,s));
         }
      }
   }
   
   
   /**
   splitDeck takes the deck ArrayList and gives the first 26 cards
   to playerDeck and the second 26 cards to computerDeck
   */
   public void splitDeck(){
      for (int i = 0; i<=(CARDS_IN_DECK/2);i++){
         playerDeck.add(deck.get(i));
      }
      for (int i = 26; i<=CARDS_IN_DECK;i++){
         computerDeck.add(deck.get(i));
      }  
   }
   
   /**
   getPlayerDeck returns the playerDeck ArrayList
   @return playerDeck
   */
   public ArrayList<Card> getPlayerDeck(){
      return playerDeck;
   }
   
   /**
   getComputerDeck returns the computerDeck ArrayList
   @return computerDeck
   */
   public ArrayList<Card> getComputerDeck(){
      return computerDeck;
   }
   
}