import java.util.*;

public class Player	
{
	private String name;
	private int goals;
	private int numInfractions; 

	ArrayList<Shot> shotList = new ArrayList<Shot>();
	ArrayList<Infraction> infractionList= new ArrayList<Infraction>();

	public void Player(String nName, int nGoals, int nInfractions) 
	{
		name = nName;
		goals = nGoals;
		numInfractions = nInfractions; 
	}

	public void addShot(Shot nShot) {
		shotList.add(nShot);
		if (nShot.shotScored() == true); 
			goals++;

	}

	public void addInfraction(Infraction nInfraction) {
		numInfractions.add(nInfraction);
		numInfractions++;

	}

	public int getGoals () {
		return goals; 
	}

	public int getInfractions() {
		return numInfractions; 
	
	}

	public String getName() {
		return name; 
	}

	
}
