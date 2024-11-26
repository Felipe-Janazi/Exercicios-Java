import java.util.Scanner;

public class ProjetoTeste {
    public static void main(String[] args) {
//        Criando um objeto para utilizar seus métodos

        Scanner usuario = new Scanner(System.in);
        MetodosUteis metodosLegais = new MetodosUteis();

        String nomeUsuario = "Bob da Silva";
        metodosLegais.exibirUsuario(nomeUsuario);

        System.out.println("Digite seu nome");
        String nome = usuario.nextLine();
        metodosLegais.exibirUsuario(nome);

    }
}
