public class ExemploOperadores {
    public static void main(String[] args) {

//        Operadores:
//         + soma
//        - Subtração
//        / Divisão
//         * Multiplicação
//        ++ soma 1
//        -- sub 1
//        +=
//        Tudo que usamos no JavaScript mantemos no Java
//        ** potencia, no Java usamos o método de uma classe


        Double numero01 = 42.0;
        Double numero02 = 10.0;

//        Isso concatena os dois valores
        System.out.println("Soma: " + numero01 + numero02);

//        Isto faz a soma e apresenta os dois valores
        System.out.println("Soma: " + (numero01 + numero02));
        System.out.println("Multiplicação: " + (numero01 * numero02));

        Double resultadoPotencia = Math.pow(numero01, numero02);
        System.out.println("Resultado Potência: " + resultadoPotencia);
    }
}
