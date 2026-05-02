package ListaLigada;

public class ListaLigada {
    private No inicio;
    private No fim;
    private int tamanho;    

    public ListaLigada() {
        inicio = null;
        fim = null;
        tamanho = 0;
    }

    // Inserir no início
    public void inserirInicio(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            novo.proximo = inicio;
            inicio = novo;
        }

        tamanho++;
    }

    // Inserir no final
    public void inserirFinal(int valor) {
        No novo = new No(valor);

        if (inicio == null) {
            inicio = novo;
            fim = novo;
        } else {
            fim.proximo = novo;
            fim = novo;
        }

        tamanho++;
    }

    // Inserir em uma posição (meio)
    public void inserirPosicao(int valor, int posicao) {

        if (posicao < 0 || posicao > tamanho) {
            System.out.println("Posição inválida!");
            return;
        }

        if (posicao == 0) {
            inserirInicio(valor);
            return;
        }

        if (posicao == tamanho) {
            inserirFinal(valor);
            return;
        }

        No novo = new No(valor);
        No atual = inicio;

        // vai até o nó anterior
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }

        novo.proximo = atual.proximo;
        atual.proximo = novo;

        tamanho++;
    }

    // Remover um valor
    public void remover(int valor) {
        if (inicio == null) return;

        if (inicio.valor == valor) {
            inicio = inicio.proximo;

            if (inicio == null) {
                fim = null;
            }

            tamanho--;
            return;
        }

        No atual = inicio;

        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {

            if (atual.proximo == fim) {
                fim = atual;
            }

            atual.proximo = atual.proximo.proximo;
            tamanho--;
        }
    }

    // Mostrar lista
    public void imprimir() {
        No atual = inicio;

        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }

    // Mostrar tamanho
    public int getTamanho() {
        return tamanho;
    }
}