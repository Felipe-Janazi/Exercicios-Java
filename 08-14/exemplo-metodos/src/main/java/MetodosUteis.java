public class MetodosUteis {
//    Método
//    Retorno: esse é void, sem retorno
//    Nome: exibirUsuario
//    Argumentos: nomeUsuario
//    Corpo: Faz um print enfeitando um nome

    void exibirUsuario(String nomeDoUsuario) {
        System.out.println("""
                *_____________*_____________*
                Usuário logado: %s
                *_____________*_____________*"""
                .formatted(nomeDoUsuario));
    }

    Double somar(Double num01, Double num02){
        return num01 + num02;
    }
}
