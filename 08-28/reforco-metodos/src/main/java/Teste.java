public class Teste {
    public static void main(String[] args) {
        MetodosDivertidos metodos = new MetodosDivertidos();

        Integer qtdTentativas =
                    metodos.avaliandoSorte(7);

        String tentativaOuTentativas = qtdTentativas > 1 ? " tentativas" : " tentativa";

        String sorte = "";
        if (qtdTentativas <= 3){
            sorte = ". Você é MUITO sortudo";
        } else if (qtdTentativas <= 10) {
            sorte = ". Você é sortudo";
        } else {
            sorte = ". É melhor você parar de apostar e ir trabalhar";
        }

        System.out.println("Você acertou em " + qtdTentativas + tentativaOuTentativas + sorte);



        Integer somaNum =
                metodos.exibeSomaSorteio();

        System.out.println("A soma dos números é: " + somaNum);



//        Só chamamos o métodos e não pegamos valor retornado
                metodos.exibeImpares();


                Integer posicaoNum =
                        metodos.posicaoSorteio( 10);

        System.out.println("O número escolhidp foi sorteado na posição " + posicaoNum);


    }
}
