/**
 * A class that represents a single playing card
 */
public class Card
{
    private String face;
    private int value;
    private String suit;

    public Card()
    {
        face = " A";
        value = 1;
        suit = "Hearts";
    }

    public Card(String inFace, int inVal, String inSuit)
    {
        face = inFace;
        value = inVal;
        suit = inSuit;
    }

    /**
     * gets the A, 2, 3, 4, 5, 6, 7, 8, 9,10, J, Q, K of this card
     * @return the face of the card
     */
    public String getFace()
    {
        return face;
    }

    /**
     * Gets the numeric value of this card - in some cases,
     * this might mean numbers from 1-13, or from 2-14, or from 1-10.
     * @return number value of this card
     */
    public int getValue()
    {
        return value;
    }

    /**
     * gets the suit of this card.
     * @return suit
     */
    public String getSuit()
    {
        return suit;
    }

    /**
     * description of this card, for example, "J of Clubs"
     * @return a description of this card based on face and
     * suit (but not value).
     */
    public String toString()
    {
        return face + " of "+suit;
    }
}
