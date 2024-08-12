package engtelecom.poo.dados;

public interface Persistencia<E> {

     void salvar(E objeto) throws MemoriaInsuficienteException;
     E load() throws PersistenciaException,ArquivoNaoEncontradoException;
     boolean delete();

}
