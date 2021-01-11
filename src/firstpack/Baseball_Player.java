package firstpack;

public class Baseball_Player extends Player {

	private int hit;
	private int error;
	public Baseball_Player(String Pname, String Tname, int score, int hit, int error ) {
		super(Pname, Tname);
		this.hit = 0;
		this.error = 0;
	}
	
	public void upscore(int score) {
		setscore(getscore()+score);
	}
	public void allview() {
		
	}
	
}
