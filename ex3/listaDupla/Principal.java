
package ex3.listaDupla;

import java.util.Scanner;


public class Principal {
    public static void main(String args[]){
        Fila fi = new Fila(4);
     
        for(int i=0; i<5; i++){
        No n = new No("i: "+i,i);
        fi.insere(n);        
        }
    
        fi.imprime();
        System.out.println(" Adicionar mais elementos: ");
        
        for (int i = 0; i < 6; i++) {
            No n = new No("i2: "+i,i);
            fi.insere(n);
        }
    
        fi.imprime();
        fi.remove();
        fi.remove();
        fi.imprime();
    } 
    
    
    }
    

