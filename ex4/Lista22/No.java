
package ex4.Lista22;


public class No {
    
    private No anterior;
    private No proximo;
    private String nome;
    private double matricula;
    private double nota;
    private String nomeCurso;
    
    

    public double getMatricula() {
        return matricula;
    }

    public void setMatricula(double matricula) {
        this.matricula = matricula;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    
    //Define valor do nó.
    public void setNalor(String nome) {
        this.nome = nome;
    }

    //Retorna valor do nó.
    public String getNome() {
        return nome;
    }
    //Define nó anterior.

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }
    //Retorna nó anterior

    public No getAnterior() {
        return anterior;
    }
    //Define proximo nó.

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }
    //Retorna proximo nó

    public No getProximo() {
        return proximo;
    }

}
