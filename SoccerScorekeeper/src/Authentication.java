public class Authentication {
	// We don't have a User class yet
	// The user can probably have an attribute for enteredPassword and enteredUsername
	private final User user;

	// 0: Normal user
	// 1: Scorekeeper
	// 2: Admin
	private int privilegeLevel;

	/* ----------- */
	/* CONSTRUCTOR */
	/* ----------- */
	public Authentication(User user) {
		this.user = user;
		this.privilegeLevel = 0;
	}

	/* ------- */
	/* GETTERS */
	/* ------- */
	public User getUser() {
		return user;
	}
	
	public int privilegeLevel() {
		return privilegeLevel;
	}

	/* ------- */
	/* SETTERS */
	/* ------- */
	public void setPrivilegeLevel(int level) {
		privilegeLevel = level;
	}
}
