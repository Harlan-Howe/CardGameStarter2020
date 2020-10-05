public class WarReferee
{
    CardPile originalDeck, player1Hand,
            player2Hand, pool;
    public WarReferee()
    {
        // let's make a deck of cards:
        originalDeck = CardPile.makeDeck(CardPile.ACE_HIGH);
        // and some empty hands...
        player1Hand = new CardPile();
        player2Hand = new CardPile();
        pool = new CardPile();
        System.out.println("Ref created.");
    }

    public void play()
    {
        System.out.println("Starting game.");
    }

}
