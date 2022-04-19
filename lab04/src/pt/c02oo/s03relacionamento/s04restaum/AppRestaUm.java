package pt.c02oo.s03relacionamento.s04restaum;

public class AppRestaUm {

   public static void main(String[] args) {
      AppRestaUm.executaJogo(null, null);
   }
   
   public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
      Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);
      
      String commands[] = tk.retrieveCommands();
      
      for (int l = 0; l < commands.length; l++)
         System.out.println(commands[l]);
      
      Tabuleiro t = new Tabuleiro();
      
      tk.writeBoard("Tabuleiro inicial", t.getTab());
      for(int i = 0; i < commands.length; i++) {
    	t.movimento(commands[i]);
    	tk.writeBoard("source: " + commands[i].substring(0, 2) + "; target: " + commands[i].substring(3,  5), t.getTab());
      }      
      tk.stop();
   }

}