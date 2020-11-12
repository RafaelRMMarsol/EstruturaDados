
package ex6.ordenacaoObj;

import java.util.Scanner;


public class Program {
    
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        Ordenacao ord = new Ordenacao();
        char sn;
        
        
        System.out.println("--------ORDENACAO DE VETOR--------");
        System.out.println("Quantidade do vetor: ");
        int quant = s1.nextInt();
        
        
        int[] vetObj = new int[quant];
        
        for(int i=0;i<quant; i++){
            System.out.println("Digite o valor no vetor "+i);
            vetObj[i] = s1.nextInt();
        }       
        
        
        do{
            System.out.println("Bubble Sort:    1");
            System.out.println("Insertion Sort: 2");
            System.out.println("Selection Sort: 3");
            System.out.println("------------------");
            int escolha = s1.nextInt();
            
            switch(escolha){
                case 1:
                    ord.bubbleSort(vetObj);
                    break;
                case 2:
                    ord.insertionSort(vetObj);
                    break;
                case 3:
                    ord.selectionSort(vetObj);
                    break;
                default:
                    System.out.println("Numeracao Incorreta");
                    break;
            }
            
            System.out.println("Deseja voltao ao menu: s/n");
            sn = s1.next().charAt(0); 
        }while(sn == 's');
    }
    
}
