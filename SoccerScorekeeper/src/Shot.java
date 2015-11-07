import java.util.*;

public class Shot	{
	private boolean isGoal;
	private Date time;

	public boolean shotScored(Shot shot)	{
		return isGoal;
	}

	public void addshot(boolean scored)	{
		time = new Date();
		isGoal = scored;
	}
}