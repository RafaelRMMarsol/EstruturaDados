
package ex1.ListaEncadeada;


public class No {
    
    private String nome;
    private double nota;
    No prox;
    
    
    
    public No(String nome, double nota){
        this.nome = nome;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    
    @Override
    public String toString(){
        if(prox == null){
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) + " Nome: "+nome+" Nota: "+nota + " proximo elemento: "+ prox.getClass()+"@"+Integer.toHexString(prox.hashCode());
        }
        else{
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) + " Nome: "+nome+" Nota: "+nota + " proximo elemento: null";
        }
    }

    No setProx() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
