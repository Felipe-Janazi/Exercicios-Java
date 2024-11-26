import org.w3c.dom.ls.LSOutput;

public class Teste {
    public static void main(String[] args) {
        Cliente cliente01 = new Cliente("Nome", 3, Plano.OURO);

        System.out.println("O plano do cliente 1 é: " + cliente01.getPlano());

        for (Plano planoDaVez : Plano.values()){
            System.out.println(planoDaVez);
            System.out.println(planoDaVez.getDescricao());
            System.out.println(planoDaVez.getValor());
        }
    }
}
