public class Main {
    public static void main (String[] args){
        //atributos
        Gerenciador gerenciamento;
        Usuario pessoas;
        Documento papelada;
        Usuario[] ListaPessoas = new Usuario[5];
        Documento[] ListaPapelada = new Documento[1];

        //inicializando variáveis
        pessoas = new Usuario("","","", "");
        papelada = new Documento(" ", " ", " ", " ",
                " ", " ", " ");
        gerenciamento = new Gerenciador(pessoas, papelada);




        //construtor
        ListaPessoas[0] = new Usuario("Cruzes", "Vales", "22233344455","Professor");
        ListaPessoas[1] = new Usuario("Jorginho", "Jovem","33344455566" ,"Funcionario");
        ListaPessoas[2] = new Usuario("Yakisoba", "Kents","44455566677" ,"Funcionario");
        ListaPessoas[3] = new Usuario("Macarrones", "Frius", "55566677788","Professor");
        ListaPessoas[4] = new Usuario("Vegetas", "Maduro", "66677788899","Professor");

        ListaPapelada[0] = new Documento("024542","13/05/1997", "Professor",
                "Exoneração", "O documento trata-se a respeito da exoneração de cargo de professor", "Físico",
                "Sala 03, Armário 12, Gaveta 5, Pasta 2, Letra E");

        for (int i = 0; i < ListaPessoas.length;i++){
            if(ListaPessoas[i] != null){
                System.out.println("\n"+ListaPessoas[i].getCargo()+" "+ListaPessoas[i].getPrimeiroNome()+" "+ListaPessoas[i].getUltimoNome()+" "+ListaPessoas[i].getCPF()+" "+"foi cadastrado!" );
                gerenciamento.cadastraUsuario(ListaPessoas[i]);
            }
        }

        System.out.println("\n"+"O Documento com os seguintes dados foi cadastrado:"+" "+ListaPapelada[0].getNumeroUnicoReferencia()+" "+ListaPapelada[0].getDataArquivamento()+" "+ListaPapelada[0].getInteressado()+
                " "+ListaPapelada[0].getTipoDeDocumento()+" "+ListaPapelada[0].getDescriçãoDocumento()+" "+ListaPapelada[0].getDescriçãoDocumento()+
                " "+ListaPapelada[0].getTipoDeArmazenamento()+" "+ListaPapelada[0].getLocalCompletoDeArmazenamento());
        gerenciamento.cadastraDocumento(ListaPapelada[0]);


        gerenciamento.getConsultaUsuario("66677788899");
        gerenciamento.getConsultaDocumento("Professor");
        gerenciamento.getRemoveUsuario("33344455566");
        gerenciamento.getConsultaUsuario("33344455566");
        gerenciamento.getRemoveDocumento("13/05/1997");
        gerenciamento.getConsultaDocumento("Professor");
        //gerenciamento.getRemoveDocumento("024542");
        //gerenciamento.removeTodosUsuarios();



    }
}
