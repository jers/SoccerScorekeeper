import java.util.*;

	public Team () 
	{

	private ArrayList<Player> playerList;
	private String name;
	private int points;

	public Team (String Name) 
	{
		this.name=Name;
		this.playerList=new ArrayList<Player>();
		this.points=0;
	}	

	public void addPlayer(Player p)
	{
		this.playerList.add(p);
		public addPlayer(Player nPlayer) {
		playerList.add(nPlayer);
	}

	public void removePlayer(Player p)
	{
		this.playerList.remove(p);
	}
	
	public void addWin()
	{
		this.points+=3;
	}
	
	public void addDraw()
	{
		this.points+=1;
	}
	
	public int getPoints()
	{
		return this.points;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public ArrayList<Player> getPlayer()
	{
		return this.playerList;
	}
}
