package pt.c40task.l05wumpus;

public class Caverna {
	private Sala salas[][] = new Sala[4][4];
	
	Caverna(){
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				this.salas[i][j] = new Sala('-');
			}
		}
		this.salas[0][0].setCh('p');
		this.display();
	}
	
	public Sala[][] getSalas() {
		return this.salas;
	}
	
	public void display() {
		for(int i = 0; i < this.getSalas().length; i++) {
			for(int j = 0; j < this.getSalas().length; j++) {
				System.out.print(this.getSalas()[i][j]);
			}
			System.out.println();
		}
	}
}
