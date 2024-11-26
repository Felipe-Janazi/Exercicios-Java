public class TesteCofrinho {

    public static void main(String[] args) {

        Cofrinho cofrinho01 = new Cofrinho("Comprar um carro", 0.0, true);
        Cofrinho cofrinho02 = new Cofrinho("Comprar um pc gamer");
        Cofrinho cofrinho03 = new Cofrinho("Comprar coisas");

        cofrinho01.depositarValor(1.0);

        Double valorSorteado = cofrinho01.agitar();
        if (valorSorteado == null) {
            System.out.println("O cofrinho está quebrado!");
        } else {
            System.out.println("O valor sorteado ao agitar foi de " + valorSorteado);
        }

        Double valorAcumulado = cofrinho01.quebrar();
        if (valorSorteado == null) {
            System.out.println("O cofrinho já estava quebrado!");
        } else {
            System.out.println("O total que estava dentro do cofrinho era " + valorAcumulado);
        }


        cofrinho02.depositarValor(10.0);

        Double valorSorteado02 = cofrinho02.agitar();
        if (valorSorteado02 == null) {
            System.out.println("O cofrinho está quebrado!");
        } else {
            System.out.println("O valor sorteado ao agitar foi de " + valorSorteado02);
        }

        Double valorAcumulado02 = cofrinho02.quebrar();
        if (valorAcumulado02 == null) {
            System.out.println("O cofrinho já estava quebrado!");
        } else {
            System.out.println("O total que estava dentro do cofrinho era " + valorAcumulado02);
        }

        Double valorTotalGuardado = cofrinho01.retornaValorGuardado();
        System.out.println(valorTotalGuardado);

        cofrinho01.alteraMeta("Comprar xxxxx");
    }
}
