// Teddy Herriman
// CardPile : ArrayList of cards
// provide getters and setters (getTop)
// Deck extends card pile

// import ArrayList and Random Utility
import java.util.ArrayList;
import java.util.Random;

// cardPile class
public class CardPile{

   private ArrayList<Card> cardPile;
   private Card topCard;
   
   /**
   default constructor creates new cardPile
   */
   public CardPile(){
      cardPile = new ArrayList<Card>();
   }
   
   /**
   getTop returns the top of the cardPile
   @return topCard
   */
   public Card getTop(){
      return cardPile.remove(0);
   }
   
   /**
   addCard adds a Card to the bottom of the cardPile
   @param Card card
   */
   public void addCard(Card card){
      cardPile.add(card);
   }
   
   /**
   pileSize returns the size of the cardPile
   @return size of cardPile
   */
   public int pileSize(){
      return cardPile.size();
   }
   
   /**
   clearPile clears all of the cards
   */
   public void clearPile(){
      cardPile.clear();
   }
   
   /**
   shuffle method shuffles the deck of 52 cards
   */
   public void shuffle(){
      int randNum;
      Card temp;
      Random r = new Random();
      for (int i = 0; i < cardPile.size(); i++)
      {
         randNum = r.nextInt(cardPile.size());
         temp = cardPile.get(i);
         cardPile.set(i,cardPile.get(randNum));
         cardPile.set(randNum,temp);
      }      
   }
   
   /**
   Creates a deck of cards
   */
   public CardPile Deck(){
      for (int r = Card.ACE; r<=Card.KING;r++){
         for (int s=Card.SPADES;s<=Card.CLUBS;s++){
           cardPile.add(new Card(r,s));
         }
      }
   }


}