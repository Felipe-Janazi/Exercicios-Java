import java.util.concurrent.ThreadLocalRandom;

public class MetodosDivertidos {
    Integer avaliandoSorte (Integer numeroEscolhido){

        Integer numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);

        Integer tentativas = 1;
        while(!numeroSorteado.equals(numeroEscolhido)){

            numeroSorteado = ThreadLocalRandom.current().nextInt(0, 11);
            tentativas++;
        }
        return tentativas;
    }






    Integer exibeSomaSorteio (){
        Integer numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        Integer soma = 0;

        while(!numAleatorio.equals(0)){
            soma += numAleatorio;
            numAleatorio = ThreadLocalRandom.current().nextInt(0, 11);
        }
        return soma;
    }




    void exibeImpares() {
        for (int i = 0; i <= 90; i++) {
            Integer impar = i % 2;

            if (impar.equals(1)) {
                System.out.println(i);
            }
        }
    }


    Integer posicaoSorteio(Integer num) {

        Integer posicaoSorteio = -1;
        for (int i = 0; i < 200; i++) {
            Integer numAleatorio = ThreadLocalRandom.current().nextInt(1, 101);
            if(num.equals(numAleatorio)){
                posicaoSorteio = i;
                num = 0;
            }
        }
        return posicaoSorteio;
    }
}
