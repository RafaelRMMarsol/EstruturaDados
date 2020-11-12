
package ex7.metodosOrdenacao;

import java.util.Scanner;


public class Principal {
    
    public static void main(String args[]){
       
        Scanner s1 = new Scanner(System.in);
        
        char sn;
        
        int[] vetor = {18, 13, 5, 10, 3, 2, 7, 8};
        
        System.out.println("Vetor desordenado: ");
	for(int i = 0; i<vetor.length; i++){            
            System.out.println(" "+vetor[i]);
	}
        
        do{
            System.out.println("------------Deseja utilizar qual metodo de ordenação------------");
            System.out.println("Buble Sort     = 1");
            System.out.println("Insertion Sort = 2");
            System.out.println("Selection Sort = 3");
            System.out.println("");
            
            int escolha = s1.nextInt();
            
            switch(escolha){
                case 1:
                    int aux;
                
                    for(int i=0; i<vetor.length; i++){//Ordenou Bubble 
                        for(int j=0; j<vetor.length-1; j++){
                            if(vetor[j]> vetor[j+1]){
                                aux = vetor[j];
                                vetor[j] = vetor[j+1];
                                vetor[j+1] = aux;
                            }
                        }
                    }
                    
                    System.out.println("Vetor organizado:");
                    for(int i = 0; i<vetor.length; i++){
                        System.out.println(vetor[i]);
                    }
                
                    break;
                
                case 2:
                    
                    int key;
                    int j;
                    
                    for(int i=1; i<vetor.length; i++){
                        key = vetor[i];
                        
                        for( j=i-1; (j > -1) && ( vetor[j] > key ); j -- ){
                            vetor[j+1] = vetor[j];
                        }
                        
                        vetor[j+1] = key;
                    }
                    
                    System.out.println("Vetor organizado:");
                    for(int i = 0; i<vetor.length; i++){
                        System.out.println(vetor[i]);
                    }
                    break;
                
                case 3:
                    int tempo;
                    boolean swap;
                    
                    for(int i=0; i<vetor.length; i++){
                        swap = false;
                        for(int r=0; r<vetor.length-1; r++){
                            if(vetor[r]>vetor[r+1]){
                                tempo = vetor[r];
                                vetor[r] = vetor[r+1];
                                vetor[r+1] = tempo;
                                swap = true;
                            }
                        }
                        
                        if(swap == false){
                            break;
                        }
                    }
                    
                    System.out.println("Vetor organizado:");
                        for(int i = 0; i<vetor.length; i++){
                            System.out.println(vetor[i]);
                    }
                    break;
                
                default:
                    System.out.println("Opção Invalida");
                    break;
            }
            
            System.out.println("Deseja voltar ao menu? s/n");
            sn = s1.next().charAt(0);
            
        }while(sn == 's');
      
        
        s1.close();
    }
}
