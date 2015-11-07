

class InputLive {

	private LiveInputUI LiveUI;	
	private Match match;
	private String teamName;
	private String playerName;
	private HashTable<Team, String> TeamList;
	private Team eTeam;
	private int selection;
	private boolean isGoal; 
	private boolean isRed; 

	public InputLive() {
		LiveUI = new LiveUI();
		match = new Match();
		TeamList = new ArrayList<Team>();
		selection = 0; 

	}

	public addShot() {


	}

	public addInfraction() {


	}

	public void getGeneralInfo() {

		Teamname = LiveUI.getTeamName();
		eTeam = TeamList.get(TeamName);
		playerName = LiveUI.getPlayerName();


	}

	public void getShotInfo() {
		getGeneralInfo();
		isGoal = LiveUI.getisGoal();

	}

	public void getInfractionInfo() {
		getGeneralInfo();
		getInfractionInfo();

	}

	public InputGameData() {

	
		while(selection != 0) {
			selection = LiveUI.getInputType();
			switch(selection) {
				case 1: 
					eTeam.addShot(Teamname, isGoal);		
					break;
				case 2:
					eTeam.addInfraction(playerName, isRed);			
					break; 
				

			}

		}

	}
	



}
