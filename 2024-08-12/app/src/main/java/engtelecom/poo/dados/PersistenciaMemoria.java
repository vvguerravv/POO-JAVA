package engtelecom.poo.dados;

public class PersistenciaMemoria<E> implements Persistencia {

    private E[] vetor;
    private int tamanho;
    int atual;

    public PersistenciaMemoria(int tamanho) {
        this.vetor = (E[]) new Object[tamanho];
        this.tamanho = tamanho;
        this.atual = 0;
    }


    @Override
    public void salvar(Object objeto) throws MemoriaInsuficienteException {
        if(this.atual >= this.tamanho) {
            throw new MemoriaInsuficienteException("Memória insuficiente");
        }
        vetor[atual] = (E) objeto;
    }

    @Override
    public E load() throws PersistenciaException,ArquivoNaoEncontradoException{
        if(this.atual < 0) {
            throw new PersistenciaException("Nenhum arquivo para ser carregado");
        }
        throw new ArquivoNaoEncontradoException("Arquivo não encontrado");
    }

    @Override
    public boolean delete() {
        return false;
    }

}
