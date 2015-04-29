// Teddy Herriman
// War Game

// import
import java.util.ArrayList;
public class warGame{
   public static void main(String [] args){
      final int CARDS_IN_DECK = 52;
      //
      cardPile playerDeck = new;
      cardPile computerDeck;
      cardPile deck = new cardPile();
      
      for (int i = 0; i<=(CARDS_IN_DECK/2);i++){
         playerDeck.addCard(deck.getTop());
      }
      for (int i = 26; i<=CARDS_IN_DECK;i++){
         computerDeck.addCard(deck.getTop());
      }
      
   }
}