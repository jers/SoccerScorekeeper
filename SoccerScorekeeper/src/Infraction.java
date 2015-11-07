public class Infraction	
{
	public enum Card	
	{
		RED,YELLOW
	}
	private Card card;
	private boolean penaltyKick;

	public Card getInfractionType(Infraction Infraction)	
	{
		return card;
	}

<<<<<<< HEAD
	// TRUE = red card and FAlSE = yellow
	public Infraction(boolean nCard, boolean nPenaltyKick )	{
		penaltyKick = nPenaltyKick;
		if (ncard)
		{
			card = Card.RED;
		}
		else
		{
			card = Card.YELLOW;
		}
=======
	public void infraction(Card nCard)	
	{
		card = nCard;
>>>>>>> 101023797241023d013d6b494e9238a819603434
	}
}
