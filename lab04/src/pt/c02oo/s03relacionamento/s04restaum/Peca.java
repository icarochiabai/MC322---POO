package pt.c02oo.s03relacionamento.s04restaum;

public class Peca {
	private int x, y;
	private char c;
	
	Peca(int x, int y, char c){
		this.x = x;
		this.y = y;
		this.c = c;
	}
	
	public int getX() {
		return this.x;
	}
	
	public int getY() {
		return this.y;
	}
	
	public char getC() {
		return this.c;
	}
	
	public void setC(char c) {
		this.c = c;
	}
	
	public void mover(Peca alvo, Peca t[][]) {
		int inc = 0;
		// Determinacao da direcao
		if((alvo.getX() > this.getX() || (alvo.getY() > this.getY()))) {
			inc = -1;
		} else if((this.getX() > alvo.getX()) || (this.getY() > alvo.getY())){
			inc = 1;
		}
		// Realizacao do 'movimento' \/ -> O lugar alvo ta vazio? Ta na mesma linha/coluna? A distancia entre os lugares eh 1?
		if(alvo.getC() == '-' && this.getX() == alvo.getX() && Math.abs(this.getY() - alvo.getY()) == 2){
			alvo.setC('P');
			this.setC('-');
			t[this.getX()][alvo.getY() + inc].setC('-');
		}
		else if(alvo.getC() == '-' && this.getY() == alvo.getY() && Math.abs(this.getX() - alvo.getX()) == 2) {
			alvo.setC('P');
			this.setC('-');
			t[alvo.getX() + inc][this.getY()].setC('-');
		} else {
//			System.out.println("Movimento inválido.");
		}
	}
}
