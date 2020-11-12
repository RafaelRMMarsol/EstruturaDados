package lista;
import no.No;

public class Lista {
	   private No inicio = null;
	   private No fim = null;
	   
	   
	   public void setInicio(No primeiro) {
		      this.inicio = primeiro;
		   }
		   //Retorna o primeiro nó da lista.
		   public No getPrimeiro() {
		      return this.inicio;
		   }
		   //Define nó como ultimo da lista.
		   public void setFim(No ultimo) {
		      this.fim = ultimo;
		   }
		   //Retorna ultimo nó da lista.
		   public No getUltimo() {
		      return this.fim;
		   }

	   public boolean listaVazia(){
	      if (inicio == null && fim == null)
	         return true;
	      else
	         return false;
	   }
	   
	   public void Insere_Inicio(No novo) {   
       if (inicio == null){
           setInicio(novo);
           setFim(novo);
        }         
        else{
           inicio.setAnterior(novo);
           novo.setProximo(inicio);
           setInicio(novo);            
        }
	   }

	   public void adicionarInicio(No novo) {

	      if(listaVazia()) {
	         inicio = novo;
	         fim = novo;
	      }
	      else {
	         novo.setProximo(inicio);
	         inicio = novo;
	         novo.getProximo().setAnterior(novo);
	      }
	   }

	   public void adicionarFinal(No novo) {

	      if(listaVazia()) {
	         inicio = novo;
	         fim = novo;
	      }
	      else {
	         novo.setAnterior(fim);
	         fim = novo;
	         novo.getAnterior().setProximo(novo);
	      }
	   }
	   
		public void add(No novo) {
			if (inicio == null) {
				inicio = novo;
				inicio.setAnterior(novo);
				inicio.setProximo(novo);
			} else {
				inicio.getAnterior().setProximo(novo);
				novo.setAnterior(inicio.getAnterior());
				
				inicio.setAnterior(novo);
				novo.setProximo(inicio);
			}
		}
	    
	    
//	   public void imprimir() {
//	       No aux = inicio;
//	       
//	       while(aux != null) {
//	           System.out.println("" + aux.getValor());
//	           if(aux.getAnterior() != null)
//	               System.out.println("Anterior: " + aux.getAnterior().getValor());
//	           if(aux.getProximo() != null)
//	               System.out.println("Posterior: " + aux.getProximo().getValor());
//	           System.out.println("------------------------------------");
//	           aux = aux.getAnterior();
//	       }
//	       
//	   }
		
		public void exibeLista(){
		No aux;
		aux=inicio;
		while (aux!=null)
		{
		System.out.println(aux.getValor());
		aux=aux.getProximo();
		}
		}
	}
	


