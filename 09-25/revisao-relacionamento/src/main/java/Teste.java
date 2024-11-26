public class Teste {
    public static void main(String[] args) {

        Grupo grupo = new Grupo("ZapZap");

        Contato contato01 = new Contato("Bob da Silva", "11123", "admin");
        Contato contato02 = new Contato("Bob da Silva", "11123", "admin");
        Contato contato03 = new Contato("Bob da Silva", "11123", "admin");
        Contato contato04 = new Contato("Bob da Silva", "11123", "admin");
        Contato contato05 = new Contato("Bob da Silva", "11123", "admin");

        contato02.bloquear();
        contato01.bloquear();

        Integer qtdBloqueados = grupo.getQuantidadeBloqueados();
        System.out.println(qtdBloqueados);
    }
}
