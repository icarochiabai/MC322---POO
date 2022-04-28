package pt.c40task.l05wumpus;

public class Sala {	
	private char c;
	
	Sala(char c){
		this.c = c;
	}
	
	public String toString() {
		return Character.toString(this.c);
	}
	
	public void setCh(char c) {
		this.c = c;
	}
	
}
