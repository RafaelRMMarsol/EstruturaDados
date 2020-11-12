
package ex4.Lista22;

import java.util.Scanner;

public class Principal {

    public static void main(String args[]) {
        Lista lista = new Lista();
        No n = new No();
        Scanner s1 = new Scanner(System.in);
        
        char sn;
        
        do{
            System.out.println("-----------------MENU-----------------");
            System.out.println("Cadastrar Alunos: 1");
            System.out.println("Exibir Aluno: 2");
                        
            int escolha = s1.nextInt();
            
            switch(escolha){
                case 1: 
                    System.out.println("Insere: ");
                    lista.Insere_Inicio(n);
                    break;
                case 2:
                    System.out.println("Exibir: ");
                    lista.exibeLista();
                    break;
                default:
                    System.out.println("Numero invalido");
                    break;
            }
            sn = s1.next().charAt(0);
        }while(sn == 's');

    }

}
