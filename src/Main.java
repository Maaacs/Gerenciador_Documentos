public class Main {
    public static void main (String[] args){
        //atributos
        Gerenciador gerenciamento;
        Usuario pessoas;
        Documento papelada;
        Usuario[] ListaPessoas = new Usuario[5];
        Documento[] ListaPapelada = new Documento[1];

        //inicializando variáveis
        pessoas = new Usuario("","","");
        papelada = new Documento(" ", " ", " ", " ",
                " ", " ", " ");
        gerenciamento = new Gerenciador(pessoas, papelada);




        //construtor
        ListaPessoas[0] = new Usuario("Cruzes", "Vales", "Professor");
        ListaPessoas[1] = new Usuario("Jorginho", "Jovem", "Funcionario");
        ListaPessoas[2] = new Usuario("Yakisoba", "Kents", "Funcionario");
        ListaPessoas[3] = new Usuario("Macarrones", "Frius", "Professor");
        ListaPessoas[4] = new Usuario("Vegetas", "Maduro", "Professor");

        ListaPapelada[0] = new Documento("024542","13/05/1997", "Refere-se a Professor",
                "Exoneração", "O documento trata-se a respeito da exoneração de cargo de professor", "Físico",
                "Sala 03, Armário 12, Gaveta 5, Pasta 2, Letra E");

        for (int i = 0; i < ListaPessoas.length;i++){
            if(ListaPessoas[i] != null){
                System.out.println("\n"+ListaPessoas[i].getCargo()+" "+ListaPessoas[i].getPrimeiroNome()+" "+ListaPessoas[i].getUltimoNome()+" "+"foi cadastrado!" );
                gerenciamento.cadastraUsuario(ListaPessoas[i]);
            }
        }

        System.out.println("\n"+"O Documento com os seguintes dados foi cadastrado:"+" "+ListaPapelada[0].getNumeroUnicoReferencia()+" "+ListaPapelada[0].getDataArquivamento()+" "+ListaPapelada[0].getInteressado()+
                " "+ListaPapelada[0].getTipoDeDocumento()+" "+ListaPapelada[0].getDescriçãoDocumento()+" "+ListaPapelada[0].getDescriçãoDocumento()+
                " "+ListaPapelada[0].getTipoDeArmazenamento()+" "+ListaPapelada[0].getLocalCompletoDeArmazenamento());
        gerenciamento.cadastraDocumento(ListaPapelada[0]);


    }
}
