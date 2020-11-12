
package ex6.ordenacaoObj;


public class Ordenacao {
  
    public void bubbleSort(int vetorObj[]){
        int aux;
                
        for(int i=0; i<vetorObj.length; i++){//Ordenou Bubble 
            for(int j=0; j<vetorObj.length-1; j++){
                if(vetorObj[j+1] > vetorObj[j]){
                aux = vetorObj[j];
                vetorObj[j] = vetorObj[j+1];
                vetorObj[j+1] = aux;
                }
            }
        }
                    
        System.out.println("Vetor organizado:");
        for(int i = 0; i<vetorObj.length; i++){
            System.out.println(vetorObj[i]);
        }        
    }
    
    public void insertionSort(int vetorObj[]){
        int key;
        int j;
                    
        for(int i=1; i<vetorObj.length; i++){
            key = vetorObj[i];
                        
            for( j=i-1; (j > -1) && ( vetorObj[j] > key ); j -- ){
                vetorObj[j+1] = vetorObj[j];
            }
                        
            vetorObj[j+1] = key;
        }
                    
        System.out.println("Vetor organizado:");
        for(int i = 0; i<vetorObj.length; i++){
            System.out.println(vetorObj[i]);
        }
    }
    
    public void selectionSort(int vetorObj[]){
        int tempo;
        boolean swap;
                    
        for(int i=0; i<vetorObj.length; i++){
            swap = false;
            for(int r=0; r<vetorObj.length-1; r++){
                if(vetorObj[r]>vetorObj[r+1]){
                tempo = vetorObj[r];
                vetorObj[r] = vetorObj[r+1];
                vetorObj[r+1] = tempo;
                swap = true;
                }
            }
                        
            if(swap == false){
            break;
            }
        }
                    
        System.out.println("Vetor organizado:");
        for(int i = 0; i<vetorObj.length; i++){
            System.out.println(vetorObj[i]);
        }
    }
    
    
    
}
