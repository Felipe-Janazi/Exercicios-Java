public class ExemploCondicionais {
    public static void main(String[] args) {

//         É igual no Java:
//        &&
//        ||
//        >
//        <
//        >=
//        <=


        Integer idade = 19;

        if (idade >= 18) {
            System.out.println("É maior de idade");
        } else {
            System.out.println("É menor de idade");
        }

        String nome01 = "Bob";
        String nome02 = "Bob";
        String nome03 = "Bob";

//        O Java com o == olha a referência de memória, então se for declarada por aqui serve, se vier do prompt ou Banco de dados
//        é necessário que utilize o ".equals()" e quando eu quiser ver se é diferente é só colocar "!" antes
//        Abaixo mostra que tem que ser igual ao nome02 e diferente do nome03
        if (nome01.equals(nome02) && !nome01.equals(nome03)) {
            System.out.println("O nome é igual!");
        } else {
            System.out.println("O nome é diferente!");
        }

//        Operador ternário
        String resultadoMaioridade = idade >= 18 ? "Sim" : "Não";
        Boolean eMaiorDeIdade = idade >= 18;
        System.out.println("É maior de idade: " +  resultadoMaioridade);


    }
}

