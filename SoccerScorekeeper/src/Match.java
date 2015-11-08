import java.util.*;

public class Match {
	private Date date;
	private Team home;
	private Team away;
	
	/* ------------ */
	/* CONSTRUCTORS */
	/* ------------ */
	public Match() {
		date = null;
		home = null;
		away = null;
	}

	public Match(Team home, Team away) {
		this.home = home;
		this.away = away;

		// This will set date to the time at which this constructor is called
		this.start_date = new Date();
	}
	
	/* ------- */
	/* GETTERS */
	/* ------- */
	public Date getDate() {
		return date;
	}
	
	public Team getHomeTeam() {
		return home;
	}

	public Team getAwayTeam() {
		return away;
	}

	/* ------- */
	/* SETTERS */
	/* ------- */
	public void setDate(Date date) {
		this.date = date;
	}
	
	public void setHomeTeam(Team home) {
		this.home = home;
	}

	public void setAwayTeam(Team away) {
		this.away = away;
	}
}
