package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	private Peca tabuleiro[][] = new Peca[7][7];
	
	Tabuleiro(){
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if((i >= 2 && i <= 4) || (j >= 2 && j <= 4)) {					
					Peca nova = new Peca(i, j, 'P');
					this.tabuleiro[i][j] = nova;
				}
				else {
					Peca nova = new Peca(i, j, ' ');
					this.tabuleiro[i][j] = nova;
				}
			}
		}
		Peca nova = new Peca(3, 3, '-');
		this.tabuleiro[3][3] = nova;
	}
	
	public void display() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				System.out.print(this.tabuleiro[i][j].getC());
			}
			System.out.println();
		}
	}
	
	public void movimento(String coord) {
		int xi, yi, xf, yf;
		char info[] = coord.toCharArray();
		yi = info[0] - 'a';
		xi = info[1] - '1';
		
		yf = info[3] - 'a';
		xf = info[4] - '1';
		
		Peca p = this.tabuleiro[xi][yi];
		Peca alvo = this.tabuleiro[xf][yf];
		
		p.mover(alvo, this.tabuleiro);
	}
	
	public Peca[][] getTab(){
		return this.tabuleiro;
	}
}
