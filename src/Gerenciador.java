import java.util.ArrayList;

//atributos
public class Gerenciador {

    private ArrayList<Usuario> ListaUsuarios;
    private ArrayList<Documento> ListaDocumentos;
    private boolean cadastroUsuario;
    private String removeUsuario;
    private String consultaUsuario;
    private Usuario alteraUsuario;
    private boolean cadastroDocumento;
    private String removeDocumento;
    private String consultaDocumento;
    private Documento alteraDocumento;


    //construtor
    Gerenciador(Usuario NovoUsuario, Documento NovoDocumento){
        this.ListaUsuarios = new ArrayList<Usuario>();
        this.ListaDocumentos = new ArrayList<Documento>();
    }

    public boolean cadastraUsuario(Usuario novoValor){
        this.ListaUsuarios.add(novoValor);
        return true;
    }
    public boolean cadastraDocumento(Documento novoValor){
        this.ListaDocumentos.add(novoValor);
        return true;
    }

    public Usuario getRemoveUsuario(String novoValor) {
        if (ListaUsuarios.isEmpty()){
            System.out.println("Lista Vazia");
            return null;
        }
        else{
            int size = ListaUsuarios.size();
            for(int i = 0; i < size; i++){
                if(novoValor == ListaUsuarios.get(i).getCPF()){
                    System.out.println("\nUsuário"+" "+ ListaUsuarios.get(i).getPrimeiroNome()+" "+"Foi removido com sucesso!");
                    ListaUsuarios.remove(ListaUsuarios.get(i));
                    return this.ListaUsuarios.get(i);
                }
            }
            System.out.println("Usuário não encontrado");
            return null;
        }
    }

    public void setRemoveUsuario(String removeUsuario) {
        this.removeUsuario = removeUsuario;
    }

    public void removeTodosUsuarios(){
        if (ListaUsuarios.isEmpty()){
            System.out.println("Lista Vazia");
        }
        else{
            int size = ListaUsuarios.size();
            for(int i = size-1; i >= 0; i--) {
                System.out.println("\nUsuário" + " " + ListaUsuarios.get(i).getPrimeiroNome() + " " + "Foi removido com sucesso!");
                ListaUsuarios.remove(ListaUsuarios.get(i));

                if(ListaUsuarios.size()==0){
                    System.out.println("\nTodos foram removidos :)");
                    System.out.println("\n");
                }
            }
        }

    }

    public Documento getRemoveDocumento(String NovoNumeroUnicoReferencia) {
        if (ListaDocumentos.isEmpty()){
            System.out.println("Lista Vazia");
            return null;
        }
        else {
            int size = ListaDocumentos.size();
            for(int i = 0; i < size; i++){
                if(NovoNumeroUnicoReferencia == ListaDocumentos.get(i).getNumeroUnicoReferencia()){
                    System.out.println("\nDocumento"+" "+ ListaDocumentos.get(i).getNumeroUnicoReferencia()+" "+"Foi removido com sucesso!");
                    ListaDocumentos.remove(ListaDocumentos.get(i));
                }
            }
            System.out.println("\nDocumento não encontrado. Digite novamente!");
            return null;
        }
    }

    public void setRemoveDocumento(String removeDocumento) {
        this.removeDocumento = removeDocumento;
    }

    /*public Usuario getAlteraUsuario() {
        return alteraUsuario;
    }

    public void setAlteraUsuario(Usuario alteraUsuario) {
        this.alteraUsuario = alteraUsuario;
    }

    public boolean getRemoveDocumento() {
        return removeDocumento;
    }

    public void setRemoveDocumento(boolean removeDocumento) {
        this.removeDocumento = removeDocumento;
    }*/

    public Usuario getConsultaUsuario(String novoValor) {
        int size = ListaUsuarios.size();
        for(int i = 0; i < size; i++){
            if(novoValor == ListaUsuarios.get(i).getCPF()){
                System.out.println("\nUsuário"+" "+ ListaUsuarios.get(i).getPrimeiroNome()+" "+"Está presente!");
                return this.ListaUsuarios.get(i);
            }
        }
        System.out.println("\nUsuário não encontrado!");
        return null;
    }

    public void setConsultaUsuario(String novoValor) {
        this.consultaUsuario = novoValor;
    }

    public Documento getConsultaDocumento(String interessado) {
        int size = ListaDocumentos.size();
        if(size > 0){
            for(int i = 0; i < size; i++) {
                if (interessado == ListaDocumentos.get(i).getInteressado()) {
                    //System.out.println("\nInteressado"+" "+ListaDocumentos.get(i).getInteressado()+" "+"Está no documento: "+ListaDocumentos.get(i).getLocalCompletoDeArmazenamento());
                    System.out.println("\nInteressado"+" "+ListaDocumentos.get(i).getInteressado()+" "+"Está no documento: "+ListaDocumentos.get(i).getNumeroUnicoReferencia());
                    return this.ListaDocumentos.get(i);
                }

            }
        }
        System.out.println("Não encontra-se no documento");
        return null;
    }

    public void setConsultaDocumento(String consultaDocumento) {
        this.consultaDocumento = consultaDocumento;
    }
}


// cadastro -> boolen
// remoção -> void (nao cria) so remove do array
// alteração -> tipo Usuario
// consulta -> String
