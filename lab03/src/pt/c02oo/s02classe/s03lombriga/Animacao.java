package pt.c02oo.s02classe.s03lombriga;

public class Animacao {
	AquarioLombriga lombriga;
	int lL, lA, x;
	char [] passos;
	int atual = 0;
	
	Animacao(String s) {
		char [] info = s.toCharArray();
		lA = Integer.parseInt(String.valueOf(info[0]) + String.valueOf(info[1]));
		lL = Integer.parseInt(String.valueOf(info[2]) + String.valueOf(info[3]));
		x = Integer.parseInt(String.valueOf(info[4]) + String.valueOf(info[5]));
		
		lombriga = new AquarioLombriga(lA, lL, x);
		
		int j = 0;
		passos = new char[info.length - 6];
		
		for(int i = 6; i < info.length; i++) {
			passos[j] = info[i];
			j++;
		}
	}

	String apresenta() {
		return lombriga.apresenta();
	}
	
	void passo() {
		if(passos[atual] == 'M') {
			lombriga.mover();
		}
		else if(passos[atual] == 'C') {
			lombriga.crescer();
		}
		else if(passos[atual] == 'V') {
			lombriga.virar();
		}
		atual++;
	}
}
