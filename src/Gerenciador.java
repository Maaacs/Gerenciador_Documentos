import java.util.ArrayList;

//atributos
public class Gerenciador {

    private ArrayList<Usuario> ListaUsuarios;
    private ArrayList<Documento> ListadDcumentos;
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
        this.ListadDcumentos = new ArrayList<Documento>();
    }

    public boolean cadastraUsuario(Usuario novoValor){
        this.ListaUsuarios.add(novoValor);
        return true;
    }
    public boolean cadastraDocumento(Documento novoValor){
        this.ListadDcumentos.add(novoValor);
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
    }

    public String consultaUsuario(String novoValor){

    }

    public String consultaDocumento(String novoValor){

    }*/

}









// cadastro -> boolen
// remoção -> void (nao cria) so remove do array
// alteração -> tipo Usuario
// consulta -> String
