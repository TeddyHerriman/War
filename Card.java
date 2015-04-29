// Card class
// Teddy Herriman
public class Card{

   public static int SPADES = 1; // Spades represents value of 1
   public static int HEARTS = 2; // Hearts represents value of 2
   public static int CLUBS = 3;  // Clubs represents value of 3
   public static int DIAMONDS = 4; // Diamonds represents value of 4
   public static int ACE = 1;    // Ace represents value of 1
   public static int JACK = 11;  // Jack represents value of 11
   public static int QUEEN = 12; // Queen represents value of 12
   public static int KING = 13;  // King represents value of 13
   private int rank;  // private rank for holding rank of card
   private int suit;  // private suit for holding suit of card
   
   /**
   Constructor card which accepts the rank and suit of the card and sets them to
   the values rank and suit
   @param suit
   @param rank
   */
   public Card(int suit, int rank){
      this.suit = suit;
      this.rank = rank;
   }
   
   /**
   The getSuit method returns the value of the suit
   @return the suit of the card
   */
   public int getSuit(){
      return suit;
   }
   
   /**
   The getRank method returns the value of the rank
   @return the rank of the card
   */
   public int getRank(){
      return rank;
   }
   
   /**
   The toString method returns the rank and suit as labeled values
   in a string
   @return the a string for rank and suit
   */
   public String toString(){
      // create string
      String str = "Rank: "+getRank()+"\n"+"Suit: "+getSuit();
      // return string
      return str;
   }
   
   /**
   The equals method compares the rank of the cards and returns true if they
   are equal and returns false otherwise
   @return whether the ranks of the card are equal (true or false)
   */
   public boolean equals(Card card){
      //check to see if the ranks are equal
      if (rank == card.getRank())
         return true;
      else
         return false;
   }
}