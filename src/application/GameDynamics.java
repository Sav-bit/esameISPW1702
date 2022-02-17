package application;

public class GameDynamics {
	private int lives;
	private String keyword;
	
	public GameDynamics(String selectedKeyword) {
		this.lives=5;
		this.keyword=selectedKeyword;
	}
	
	public GameDynamics() {
		this.lives=5;
		this.keyword="ciao";
	}
	
	public int getLives() {
		return lives;
	}
	
	public int getLen() {
		return this.keyword.length();
	}
	
	public boolean tryWord(String guess) {
		return this.keyword == guess;
	}
	
	

}
