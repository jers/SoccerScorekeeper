public class BatchInput	{

	public addBatchGoal(Player player, int goal, Date time)	{
		player.addShot(new Shot(true), Date time);
	}

	public addBatchInfractions(Player player, boolean nCard, boolean penaltyKick)	{
		player.addInfraction(new infraction(ncard,penaltyKick));
	}
}