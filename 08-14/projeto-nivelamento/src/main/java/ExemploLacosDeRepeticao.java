import java.util.concurrent.ThreadLocalRandom;

public class ExemploLacosDeRepeticao {
    public static void main(String[] args) {
//         For que exibe número de 0 a 10

        for(int i = 0; i <= 10; i++){
            System.out.println(i);
        }

//        while de 0 a 10
        System.out.println("While de 0 a 10");
        Integer contador = 0;
        while (contador <= 10){
            System.out.println(contador);
            contador++;
        }

        System.out.println("Terminei o while");

//        Enquanto não sortear 3, continue sorteando
        Integer inteiroAleatorio = ThreadLocalRandom.current().nextInt(0, 6);
        while(inteiroAleatorio != 3){
            System.out.println("Não sorteou, sorteado: " + inteiroAleatorio);
            inteiroAleatorio = ThreadLocalRandom.current().nextInt(0, 6);
        }

            System.out.println("Número sorteado: " + inteiroAleatorio);
    }
}