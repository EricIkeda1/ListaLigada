package ListaLigada;

public class ListaLigada {
    private No inicio;
    private No cauda;

    public ListaLigada() {
        this.inicio = null;
        this.cauda = null;
    }

    //valores add inserir inicio
    public void inserirInicio(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            cauda = novo;
        } else {
            novo.proximo = inicio;
            inicio = novo;
        }
    }

    //valores add Final
    public void inserirFinal(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            cauda = novo;
        } else {
            cauda.proximo = novo;
            cauda = novo;
        }
    }

    public void remover(int valor) {
        if (inicio == null) return;

        if (inicio.valor == valor) {
            inicio = inicio.proximo;

            if (inicio == null) {
                cauda = null;
            }
            return;
        }

        No atual = inicio;
        No anterior = null;

        while (atual != null && atual.valor != valor) {
            anterior = atual;
            atual = atual.proximo;
        }

        if (atual != null) {
            anterior.proximo = atual.proximo;

            if (atual == cauda) {
                cauda = anterior;
            }
        }
    }

    public void imprimir() {
        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.valor + " -> ");
            atual = atual.proximo;
        }

        System.out.println("null");
    }
}