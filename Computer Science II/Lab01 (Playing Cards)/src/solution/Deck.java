package solution;
import java.util.ArrayList;
/**
 * PlayingCard.java
 * 
 * @author Mitch Parry
 * @version May 6, 2013
 */
import java.util.Random;

/**
 * The Deck represents a 52 PlayingCards in a deck.
 * @version August 13, 2013
 * @author Mitch Parry
 */
public class Deck 
{

    /**
     * Number of cards.
     */
    public static final int NUM_CARDS = 52;
    private Random generator;
    private ArrayList<PlayingCard> deck;

    /**
     * Constructor creates 52 cards and adds them to ArrayList deck.
     */
    public Deck() 
    {
        // Creates a random number generator to be used in shuffleDeck()
        generator = new Random();
        initialize();
    }
    /**
     * Constructor uses a parameter to set the random seed.
     * 
     * @param seed  Seed for the random number generator.
     */
    public Deck(int seed)
    {
        generator = new Random(seed);
        initialize();
    }
    /**
     * Initializes a sorted deck.
     */
    public void initialize() 
    {
        // TODO: Create the ArrayList that will hold the 52 cards
        deck = new ArrayList<PlayingCard>();
        
        // TODO: Add code here to create and add all cards to the deck.
        // The resulting order should be from TWO CLUBS, TWO DIAMONDS, 
        // TWO HEARTS, TWO SPADES, THREE CLUBS, ..., ACE SPADES
        for (SuitsAndRanks.Rank r : SuitsAndRanks.Rank.values()) {
            
            for (SuitsAndRanks.Suit s : SuitsAndRanks.Suit.values()) {
                PlayingCard card = new PlayingCard(r, s);
                deck.add(card);
            }
        }
        
    }

    /**
     * Randomly shuffles the PlayingCard order in the ArrayList deck.
     */
    public void shuffleDeck() 
    {    
        // TODO: Implement the shuffling algorithm: "...that picks a 
        // random card to go last, then a random card among the 
        // remaining cards to go second to last, then a random card 
        // among the remaining cards to go third to last, ... 
        for (int index = NUM_CARDS - 1; index > 0; index--) 
        {
			// TODO: pick a random card to go last among the remaining 
            // (unshuffled) cards.  Hint: 
            int cardPos = generator.nextInt(index + 1);

            // TODO: swap         
            PlayingCard temp = deck.get(index);
            PlayingCard temp2 = deck.get(cardPos);
            deck.set(cardPos, temp);
            deck.set(index, temp2);

            // OR USE Collections.swap(deck, index, cardPos);
            
        }
    }
    /**
     * Returns the PlayingCard at the 'index' in the deck.
     * 
     * @param index Index into the deck
     * @return  The PlayingCard at that 'index'.
     */
    public PlayingCard getCard(int index) 
    {
        // TODO return the playing card the 'index' in the deck.
        return deck.get(index);
    }
    
    /**
     * Returns a String representation of the Deck.
     * 
     * @return The string.
     */
    @Override
    public String toString() 
    {
        // TODO: Return a String with all the cards in the deck 
        // separated by an end line '\n' character.
        String str = "";
        for (int index = 0; index < deck.size(); index++)
        {
            str += deck.get(index) + "\n";
        }
        return str;
    }
}
