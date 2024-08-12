package engtelecom.poo.pilha;

public class Pilha<E>{

    private E[] vetor;
    private int topo;
    private int tamanho;

    public Pilha(int tamanho){
        this.vetor = (E[]) new Object[tamanho];
        this.topo = -1;
        this.tamanho = tamanho;
    }

    public void empilhar(E object) throws PilhaCheiaException {
        if(topo == tamanho - 1){
            throw new PilhaCheiaException("A pilha está cheia");
        }
        vetor[++topo] = object;
    }

    public E desempilhar() throws PilhaVaziaException {
        if(topo < 0){
            throw new PilhaVaziaException("A pilha está vazia");
        }
        E desempilhado = this.vetor[topo];
        this.vetor[topo] = null;
        this.topo--;
        return desempilhado;
    }

    public E getTopo() throws PilhaVaziaException {
        if(topo < 0){
            throw new PilhaVaziaException("A pilha está vazia");
        }
         return this.vetor[topo];
    }

    public boolean isEmpty(){
        if(this.topo < 0){
            return true;
        }
        return false;
    }

    public boolean isFull(){
        if(this.topo == tamanho - 1){
            return true;
        }
        return false;
    }


}
