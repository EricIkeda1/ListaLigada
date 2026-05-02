package ListaLigada;

public class Aplicacao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.inserirInicio(10);
        lista.inserirInicio(100);
        lista.inserirFinal(80);
        lista.inserirFinal(30);
        lista.imprimir();
        lista.inserirPosicao(15, 2);
        lista.imprimir();
        lista.remover(20);
        lista.imprimir();
    }
}