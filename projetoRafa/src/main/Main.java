package main;
import no.No;
import lista.Lista;

public class Main {
	
	public static void main (String args[]) {
		Lista lista = new Lista();
		No item1 = new No();
		
		item1.setValor("teste");
		lista.Insere_Inicio(item1);
		No item2 = new No();
		item2.setValor("oi");
		lista.Insere_Inicio(item2);
		lista.exibeLista();
		
		
	}

}
