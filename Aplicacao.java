package ListaLigada;

public class Aplicacao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.inserirInicio(10);
        lista.inserirInicio(100);
        lista.inserirFinal(20);
        lista.inserirFinal(30);
        lista.imprimir();
        lista.remover(20);
        lista.imprimir();
    }
}