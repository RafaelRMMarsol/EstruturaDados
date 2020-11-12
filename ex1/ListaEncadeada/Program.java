
package ex1.ListaEncadeada;

import java.util.Scanner;


public class Program {
    
    public static void main(String args[]){
        ListaEncadeada list = new ListaEncadeada();
        Scanner s1 = new Scanner(System.in);
        
        System.out.println("Quantos alunos serão cadastrados: ");
        int quant = s1.nextInt();
        
        for(int i=0; i<quant; i++){//Cadastramento
            s1.nextLine();
            
            System.out.println("Digite nome do aluno: ");
            String nome = s1.nextLine();
            
            System.out.println("Digite a Nota: ");
            double nota =  s1.nextDouble();
            
            No no = new No(nome, nota);
            list.insere(no);
        }
        
        list.imprimeLista();
       
        s1.close();
    }
    
}
