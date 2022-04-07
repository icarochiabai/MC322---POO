package pt.c02oo.s02classe.s03lombriga;

public class AquarioLombriga {
	int lA, lL, x, dir;
	
	AquarioLombriga(int templA, int templL, int tempX) {
		lA = templA;
		lL = templL;
		x = tempX;
		dir = -1; // a lombriga sempre eh construida virada pra esquerda
		if(lL > lA) {
			lL = lA;
		}
		if(x > lA || x < 1 || x + lL - 1 > lA) {
			x = 1;
		}    	  

	}
	
	void crescer() {
		if(dir == -1) { // se ela ta pra esquerda
			if(x + lL - 1 < lA) { // se posiçao da cabeca + tamanho do corpo menor que tamanho do aquario
				lL += 1; // da pra crescer
			}
		} else {
			if(x - lL + 1 != 1) { // se tem espaço depois da cabeca
				lL += 1;
			}
		}
	}
	
	void virar() {
		if(dir > 0) {
			x -= lL - 1;
		} else {
			x += lL - 1;			
		}
		dir *= -1;
	}
	
	void mover() {
		if(x - 1 == 0 || x == lA) { // se ela tiver nos extremos
			virar();
		}
		else {
			x += dir; // aumenta a posicao baseado na direcao
		}
	}
	
	
	String apresenta() {
		char[] aquario = new char[lA];
		
		for(int i = 0; i < lA; i++) { // cria o aquario
			aquario[i] = '#';
		}
		
		aquario[x - 1] = 'O'; // adiciona a cabeca
		if(dir == -1) {			
			for(int i = x; i < x + lL - 1; i++) { // cria a lombriga
				aquario[i] = '@';
			}
		}
		else {
			for(int i = x - lL; i < x - 1; i++) {
				aquario[i] = '@';
			}
		}
		return String.valueOf(aquario);
	}	
}
