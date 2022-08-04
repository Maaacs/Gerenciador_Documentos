import java.util.ArrayList;

//atributos
public class Gerenciador {

    private ArrayList<Usuario> ListaUsuarios;
    private ArrayList<Documento> ListaDocumentos;
    private boolean cadastroUsuario;
    private boolean cadastroDocumento;
    private String removeUsuario;
    private String removeDocumento;
    private String consultaUsuario;
    private String consultaDocumento;
    private Usuario alteraUsuario;

    private Documento AlteraDataArquivamentoDocumento;
    private Documento AlteraInteressadoDocumento;
    private Documento AlteraTipoDeDocumento;
    private Documento AlteraDescriçãoDocumento;
    private Documento AlteratipoDeArmazenamentoDocumento;
    private Documento AlteraLocalCompletoDeArmazenamentoDocumento;


    //construtor
    Gerenciador(Usuario NovoUsuario, Documento NovoDocumento){
        this.ListaUsuarios = new ArrayList<Usuario>();
        this.ListaDocumentos = new ArrayList<Documento>();
    }

    public boolean cadastroUsuario(Usuario novoValor){
        this.ListaUsuarios.add(novoValor);
        return true;
    }
    public boolean cadastroDocumento(Documento novoValor){
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

    public Usuario getConsultaUsuario(String novoCPF) {
        int size = ListaUsuarios.size();
        for(int i = 0; i < size; i++){
            if(novoCPF == ListaUsuarios.get(i).getCPF()){
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



    public Usuario getAlteraUsuario(String NovoCPF, String NovoCargo) {
        int size = ListaUsuarios.size();
        for(int i = 0; i < size; i++){
            if(NovoCPF == ListaUsuarios.get(i).getCPF()){
                System.out.println("\nUsuário"+" "+ ListaUsuarios.get(i).getPrimeiroNome()+" "+"possui o cargo"+" "+ListaUsuarios.get(i).getCargo()+"!");
                ListaUsuarios.get(i).setCargo(NovoCargo);
                System.out.println("\nCargo alterado com sucesso!");
                System.out.println("\nUsuário"+" "+ ListaUsuarios.get(i).getPrimeiroNome()+" "+"foi promovido a"+" "+ListaUsuarios.get(i).getCargo()+"!");
                return this.ListaUsuarios.get(i);
            }
        }
        System.out.println("\nUsuário não encontrado. Tente novamente!");
        return null;
    }



    public Documento getAlteraDataArquivamentoDocumento(String NumeroUnicoReferencia, String NovoDataArquivamento) {
        int size = ListaDocumentos.size();
        if(size > 0){
            for(int i = 0; i < size; i++) {
                if (NumeroUnicoReferencia == ListaDocumentos.get(i).getNumeroUnicoReferencia()) {
                    System.out.println("\nData de arquivamento do documento:"+" "+ListaDocumentos.get(i).getDataArquivamento());
                    System.out.println("\nData alterada com sucesso!");
                    ListaDocumentos.get(i).setDataArquivamento(NovoDataArquivamento);
                    System.out.println("\nNova data de arquivamento do documento: "+ListaDocumentos.get(i).getDataArquivamento());
                    return this.ListaDocumentos.get(i);
                }

            }
        }
        System.out.println("Documento não encontrado");
        return null;
    }

   /* public void setAlteraDataArquivamentoDocumento(Documento alteraDataArquivamentoDocumento) {
        AlteraDataArquivamentoDocumento = alteraDataArquivamentoDocumento;
    }

    public Documento getAlteraInteressadoDocumento() {
        return AlteraInteressadoDocumento;
    }

    public void setAlteraInteressadoDocumento(Documento alteraInteressadoDocumento) {
        AlteraInteressadoDocumento = alteraInteressadoDocumento;
    }

    public Documento getAlteraTipoDeDocumento() {
        return AlteraTipoDeDocumento;
    }

    public void setAlteraTipoDeDocumento(Documento alteraTipoDeDocumento) {
        AlteraTipoDeDocumento = alteraTipoDeDocumento;
    }

    public Documento getAlteraDescriçãoDocumento() {
        return AlteraDescriçãoDocumento;
    }

    public void setAlteraDescriçãoDocumento(Documento alteraDescriçãoDocumento) {
        AlteraDescriçãoDocumento = alteraDescriçãoDocumento;
    }

    public Documento getAlteratipoDeArmazenamentoDocumento() {
        return AlteratipoDeArmazenamentoDocumento;
    }

    public void setAlteratipoDeArmazenamentoDocumento(Documento alteratipoDeArmazenamentoDocumento) {
        AlteratipoDeArmazenamentoDocumento = alteratipoDeArmazenamentoDocumento;
    }

    public Documento getAlteraLocalCompletoDeArmazenamentoDocumento() {
        return AlteraLocalCompletoDeArmazenamentoDocumento;
    }

    public void setAlteraLocalCompletoDeArmazenamentoDocumento(Documento alteraLocalCompletoDeArmazenamentoDocumento) {
        AlteraLocalCompletoDeArmazenamentoDocumento = alteraLocalCompletoDeArmazenamentoDocumento;
    }*/
}


// cadastro -> boolen
// remoção -> void (nao cria) so remove do array
// alteração -> tipo Usuario
// consulta -> String
