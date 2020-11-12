
package ex1.ListaEncadeada;


public class ListaEncadeada {
    
    No inicio;
    No fim;
    
    public void insere(No elemento){
        if(inicio == null){
            inicio = elemento;
            fim = elemento;
            System.out.println("Iniciando a Lista - Inserindo Inicio: ");
        }
        else{
            fim.prox = elemento;
            fim = fim.prox;
            System.out.println("Inserindo no final: ");
        }
    }
        
    public void imprimeLista(){
        No aux = inicio;
        if(inicio == null){
            System.out.println("Lista Vazia");
        }
        else{
            System.out.println("Inicio da lista: " + inicio.getClass() + "@" + Integer.toHexString(inicio.hashCode()));
            System.out.println("Fim da lista: " + fim.getClass() + "@" + Integer.toHexString(fim.hashCode()));
            while(aux != null){
                System.out.println(aux.toString());
                aux = aux.prox;
                if(aux.prox == null){
                    break;
                }
            }
        }
    }
    
    
    
}
