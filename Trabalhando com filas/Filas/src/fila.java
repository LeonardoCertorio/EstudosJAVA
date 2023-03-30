import java.util.Arrays;

public class fila {

    /*Tentar usar ArrayList*/

    private Integer[] elementos;
    private int proxIndice;
    
    public fila(Integer capacidade) {
        elementos = new Integer[capacidade];
        Arrays.fill(elementos, null);
        proxIndice = 0;
    }
    
    public void enfilerar(Integer novoElemento) {
        if (proxIndice<elementos.length) {
            elementos[proxIndice] = novoElemento;
            proxIndice++;
        }
    }
    
    public Integer desenfilerar() {
        Integer elemento = elementos[0];
        for (int i = 1; i < elementos.length; i++) {
            elementos[i-1] = elementos[i];
        }
        elementos[elementos.length-1] = null;
        proxIndice--;
        return elemento;
    }
    
    public boolean vazia() {
        return elementos[0] == null;
    }
    
    public int tamanho() {
        return proxIndice;
        /*int contador = 0;
        for (int i = 0; i < elementos.length; i++) {
            if (elementos[i] != null) {
                contador++;
            } else {
                break;
            }
        } return contador;*/
        
    }
}