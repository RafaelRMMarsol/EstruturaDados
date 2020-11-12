
package ex2.ListaDinamica;


public class Lista {
    
    No inicio;
    No fim;
    
    public void insere(No n){
        if(inicio == null){
            inicio = n;
            fim = n;
            System.out.println("Iniciando a Lista - Inserindo Inicio: ");
        }
        else{
            fim.prox = n;
            fim = fim.prox;
            System.out.println("Inserindo no final: ");
        }
    }
    
    public No busca(String procura){
        No aux = inicio;
        while(aux != null){
            if(aux.getNome().contains(procura)){
                return aux;
            }
            
            aux = aux.prox;
        }
        return null;
    }
    
    public No buscaAnt(String procura){
        No ant = inicio;
        while(ant.prox != null){
            if(ant.prox.getNome().contains(procura)){
                return ant;
            }
            
            ant = ant.prox;
        }
        
        return null;
    }
    
     public No remove(String procura){
        No aux = inicio;
        if(inicio != null){
            if(aux.getNome().contains(procura)){
                if(aux == fim){
                    fim = null;
                    inicio = null;
                }else{
                    inicio = aux.prox;
                    aux.prox= null;
                }
            }else{
                No ant = buscaAnt(procura);
                if(ant != null){
                    aux = ant.prox;
                    if(aux == fim){
                        ant.prox = null;
                        fim = ant;
                    }else{
                        ant.prox = aux.prox;
                        aux.prox = null;
                    }
                }else{
                    System.out.println("Elemento nao encontrado na lista");
                    return null;
                }
            }
            System.out.println("Elemento removido -> " + procura);
            return aux;
        }
        else{
            System.out.println("Lista Vazia");
            return null;
        }
    }
     
    public void imprimeLista(){
        No aux = inicio;
        if(inicio == null){
            System.out.println("Lista Vazia");
        }
        else{

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
