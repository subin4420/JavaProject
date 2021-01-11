package firstpack;

public abstract class Player {

	String player_name;
	String team_name;
	private int score;
	
	public Player(String Pname, String Tname) {
		player_name = Pname;
		team_name = Tname;
		score =0;
	}
	public int getscore() {
		return score;
	}
	public void setscore(int a) {
		this.score = a;
	}
	
	public abstract void allview();
	
	public abstract void upscore(int score);
	
}
