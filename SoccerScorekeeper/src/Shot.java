import java.util.*;

public class Shot	{
	private boolean isGoal;
	private Date time;

	public boolean shotScored(Shot shot)	{
		return isGoal;
	}

	public void shot(boolean scored)	{
		time = new Date();
		isGoal = scored;
	}

	public void shot(boolean scored, Date nTime)	{
		time = nTime;
		isGoal = scored;
	}
}