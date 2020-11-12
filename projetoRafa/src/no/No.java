package no;

public class No {
	   private No anterior;      
	   private No proximo;
	   private String valor;
	   
	   
	   //Define valor do n�.
	   public void setValor(String valor) {
	      this.valor = valor;
	   }
	   
	   //Retorna valor do n�.
	   public String getValor() {
	      return valor;
	   }
	   //Define n� anterior.
	   public void setAnterior(No anterior) {
	      this.anterior = anterior;
	   }
	   //Retorna n� anterior
	   public No getAnterior() {
	      return anterior;
	   }
	   //Define proximo n�.
	   public void setProximo(No proximo) {
	      this.proximo = proximo;
	   }
	   //Retorna proximo n�
	   public No getProximo() {
	      return proximo;
	   }

}
