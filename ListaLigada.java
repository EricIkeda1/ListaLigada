package ListaLigada;

public class ListaLigada {
    private No cabeca;

    public ListaLigada() {
        this.cabeca = null;
    }

    public void inserirNoInicio(int valor) {
        No novoNo = new No(valor);
        novoNo.proximo = cabeca;
        cabeca = novoNo;
    }

    public void exibir() {
        No atual = cabeca;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }
}