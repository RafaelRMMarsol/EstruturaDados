
package ex2.ListaDinamica;


public class No {
    
    private String nome;
    private float altura;
    private float peso;
    private String esporte;
    private String patrocinio;
    
    No prox;
    
    public No(String nome, float altura, float peso, String esporte, String patrocinio){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.esporte = esporte;
        this.patrocinio = patrocinio;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getEsporte() {
        return esporte;
    }

    public void setEsporte(String esporte) {
        this.esporte = esporte;
    }

    public String getPatrocinio() {
        return patrocinio;
    }

    public void setPatrocinio(String patrocinio) {
        this.patrocinio = patrocinio;
    }
    
    @Override
    public String toString(){
        if(prox == null){
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) + " Nome: "+nome+" Altura: "+altura+ " Peso: "+peso+" Esporte: "+esporte+" Patrocinio: "+patrocinio+" proximo elemento: "+ prox.getClass()+"@"+Integer.toHexString(prox.hashCode());
        }
        else{
            return this.getClass()+"@"+Integer.toHexString(this.hashCode()) + " Nome: "+nome+" Altura: "+altura+ " Peso: "+peso+" Esporte: "+esporte+" Patrocinio: "+patrocinio+ " proximo elemento: null";
        }
        
    }
    
}
