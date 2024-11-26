import java.sql.SQLOutput;
import java.util.Scanner;

public class OperacoesMatematicas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner numeros = new Scanner(System.in);

        System.out.println("Digite uma das opções: \n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Sair");
        Integer escolhido = leitor.nextInt();

            while (!escolhido.equals(4)) {

                switch (escolhido) {
                    case 1 -> {
                        System.out.println("Informe o primeiro número");
                        Integer num1 = numeros.nextInt();
                        System.out.println("Informe o segundo número");
                        Integer num2 = numeros.nextInt();

                        System.out.println("A soma destes números é:");
                        Integer soma = num1 + num2;
                        System.out.println(soma);
                    }
                    case 2 -> {
                        System.out.println("Informe o primeiro número");
                        Integer num1 = numeros.nextInt();
                        System.out.println("Informe o segundo número");
                        Integer num2 = numeros.nextInt();

                        System.out.println("A subtração destes números é:");
                        Integer subtracao = num1 - num2;
                        System.out.println(subtracao);
                    }
                    case 3 -> {
                        System.out.println("Informe o primeiro número");
                        Integer num1 = numeros.nextInt();
                        System.out.println("Informe o segundo número");
                        Integer num2 = numeros.nextInt();

                        System.out.println("A multiplicaçãp destes números é:");
                        Integer multiplicacao = num1 * num2;
                        System.out.println(multiplicacao);
                    }
                    default -> {
                        System.out.println("Número inválido, escolha outro número");
                    }
                }

                System.out.println("Digite uma das opções: \n1- Somar\n2- Subtrair\n3- Multiplicar\n4- Sair");
                 escolhido = leitor.nextInt();

            }

            System.out.println("Você saiu!");

    }
}
