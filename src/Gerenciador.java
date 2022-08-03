import java.util.ArrayList;

//atributos
public class Gerenciador {

    private ArrayList<Usuario> ListaUsuarios;
    private ArrayList<Documento> ListaDocumentos;
    private boolean cadastroUsuario;
    private boolean removeUsuario;
    private String consultaUsuario;
    private Usuario alteraUsuario;
    private boolean cadastroDocumento;
    private boolean removeDocumento;
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


    /*public boolean removeUsuario(Usuario novoValor){

    }
    public boolean removeDocumentp(Documento novoValor){

    }


    public Usuario getAlteraUsuario() {
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
        System.out.println("Usuário não encontrado");
        return null;
    }

    public void setConsultaUsuario(String novoValor) {
        this.consultaUsuario = novoValor;
    }

    public Documento getConsultaDocumento(String interessado) {
        int size = ListaDocumentos.size();
        for(int i = 0; i < size; i++) {
            if (interessado == ListaDocumentos.get(i).getInteressado()) {
                //System.out.println("\nInteressado"+" "+ListaDocumentos.get(i).getInteressado()+" "+"Está no documento: "+ListaDocumentos.get(i).getLocalCompletoDeArmazenamento());
                System.out.println("\nInteressado"+" "+ListaDocumentos.get(i).getInteressado()+" "+"Está no documento: "+ListaDocumentos.get(i).getNumeroUnicoReferencia());

                return this.ListaDocumentos.get(i);
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
