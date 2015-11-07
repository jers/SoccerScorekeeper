public class Infraction	
{
	public enum Card	
	{
		RED,YELLOW
	}
	private Card card;

	public Card getInfractionType(Infraction Infraction)	
	{
		return card;
	}

	public void infraction(Card nCard)	
	{
		card = nCard;
	}
}
