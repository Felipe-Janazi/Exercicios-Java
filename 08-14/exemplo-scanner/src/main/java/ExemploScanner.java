import java.util.Scanner;

public class ExemploScanner {
    public static void main(String[] args) {

//        Pergunte nome, idade e altura e exiba usando interpolação

        Scanner info = new Scanner(System.in);


        System.out.println("Digite seu nome:");
        String nomeUsuario = info.nextLine();

        System.out.println("Digite sua idade:");
        Integer idadeUsuario = info.nextInt();

        System.out.println("Digite sua altura");
        Double alturaUsuario = info.nextDouble();

        System.out.println("""
                Nome digitado foi: %s
                Idade digitada foi: %d
                Altura digitada foi: %.2f""".formatted(nomeUsuario, idadeUsuario, alturaUsuario));
    }
}
