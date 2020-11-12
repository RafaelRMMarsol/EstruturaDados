
package ex2.ListaDinamica;

import java.util.Scanner;


public class Program {
    
    public static void main(String args[]){
        Scanner s1 = new Scanner(System.in);
        Lista list = new Lista();
        
        char sn;
        
        do{
            System.out.println("Digite 1 = Cadastrar Atletas");
            System.out.println("Digite 2 = Buscar Atletas");
            System.out.println("Digite 3 = Remover Atletas");
            System.out.println("Digite 4 = Imprimir Atleta");
            
            int escolha = s1.nextInt();
            
            if(escolha == 1){
                s1.nextLine();
                
                System.out.println("Digite a quantidade de atletas para serem cadastrados: ");
                int quant = s1.nextInt();
                
                for(int i=0; i<quant; i++){
                    s1.nextLine();
                    System.out.println("Insere Nome: ");
                    String nome = s1.nextLine();
                    
                    System.out.println("Insere Altura: ");
                    float altura = s1.nextFloat();
                    
                    System.out.println("Insere Peso: ");
                    float peso = s1.nextFloat();
                    
                    s1.nextLine();
                    
                    System.out.println("Insere Esporte: ");
                    String esporte = s1.nextLine();
                    
                    System.out.println("Insere Patrocinio: ");
                    String patrocinio = s1.nextLine();
                    
                    No n = new No(nome, altura, peso, esporte, patrocinio);
                    list.insere(n);
                }
            }
            
            else if(escolha == 2){
                s1.nextLine();
                
                System.out.println("Digite nome do atleta que deseja buscar: ");
                String buscar = s1.nextLine();
                
                No buscando = list.busca(buscar);                
                System.out.println(buscando.toString());
                
            }
                        
            else if(escolha == 3){
                s1.nextLine();
                
                System.out.println("Digite o nome do atleta que deseja remover: ");
                String remocao = s1.nextLine();
                
                No removendo = list.remove(remocao);
                list.imprimeLista();
            }
            
            else if(escolha == 4){
                list.imprimeLista();
            }
            else{
                System.out.println("Erro");
            }
            
            System.out.println("Deseja volta ao menu? s/n");
            sn = s1.next().charAt(0);
            
        }while(sn == 's');        
        
        
        
        s1.close();
    }
    
}
