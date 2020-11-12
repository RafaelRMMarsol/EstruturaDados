
package ex3.listaDupla;

public class No {
    private String nome;
    private int id;

    public No(String nome, int id){
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
    @Override
    public String toString(){
        return  "nome: "+nome+" id: "+id;
    }
}

