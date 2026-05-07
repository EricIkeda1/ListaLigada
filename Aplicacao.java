package ListaLigada;

public class Aplicacao {

    public static void main(String[] args) {

        ListaLigada lista = new ListaLigada();

        lista.inserirInicio(10);
        lista.inserirInicio(100);
        lista.inserirFinal(80);
        lista.inserirFinal(30);
        System.out.println("Lista original:");
        lista.imprimir();
        lista.inserirPosicao(15, 2);
        System.out.println("Após inserir na posição:");
        lista.imprimir();
        lista.remover(80);
        System.out.println("Após remover o valor 80:");
        lista.imprimir();
        lista.removerInicio();
        System.out.println("Após remover o início:");
        lista.imprimir();
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        System.out.println("Após remover o valor 80:");
        System.out.println("Após remover o inicio:");
        lista.imprimir();
        lista.removerPosicao(1);       
        lista.imprimir();
        lista.imprimir();
    }
}