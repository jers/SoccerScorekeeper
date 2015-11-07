public class Infraction	{
	public enum Card	{
		RED,YELLOW
	}
	private Card card;
	private boolean penaltyKick;

	public Card getInfractionType(Infraction)	{
		return card;
	}

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
	}
}
