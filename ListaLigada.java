package ListaLigada;

public class ListaLigada {

    private No inicio;
    private No fim;
    private int tamanho;

    public ListaLigada() {
        this.inicio = null;
        this.fim = null;
        this.tamanho = 0;
    }

    // Inserir no início
    public void inserirInicio(int valor) {

        No novo = new No(valor);

        if (this.inicio == null) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            novo.proximo = this.inicio;
            this.inicio = novo;
        }

        this.tamanho++;
    }

    // Inserir no final
    public void inserirFinal(int valor) {

        No novo = new No(valor);

        if (this.inicio == null) {
            this.inicio = novo;
            this.fim = novo;
        } else {
            this.fim.proximo = novo;
            this.fim = novo;
        }

        this.tamanho++;
    }

    // Inserir em uma posição
    public void inserirPosicao(int valor, int posicao) {

        if (posicao < 0 || posicao > this.tamanho) {
            System.out.println("Posição inválida!");
            return;
        }

        // Inserir no início
        if (posicao == 0) {
            this.inserirInicio(valor);
            return;
        }

        // Inserir no final
        if (posicao == this.tamanho) {
            this.inserirFinal(valor);
            return;
        }

        No novo = new No(valor);
        No atual = this.inicio;

        // Vai até o nó anterior da posição
        for (int i = 0; i < posicao - 1; i++) {
            atual = atual.proximo;
        }

        novo.proximo = atual.proximo;
        atual.proximo = novo;

        this.tamanho++;
    }

    // Remover um valor específico
    public void remover(int valor) {

        if (this.inicio == null) {
            return;
        }

        // Se o valor estiver no início
        if (this.inicio.valor == valor) {

            this.inicio = this.inicio.proximo;

            // Caso a lista fique vazia
            if (this.inicio == null) {
                this.fim = null;
            }

            this.tamanho--;
            return;
        }

        No atual = this.inicio;

        while (atual.proximo != null && atual.proximo.valor != valor) {
            atual = atual.proximo;
        }

        if (atual.proximo != null) {

            // Se estiver removendo o último nó
            if (atual.proximo == this.fim) {
                this.fim = atual;
            }

            atual.proximo = atual.proximo.proximo;

            this.tamanho--;
        }
    }

    // Remover o primeiro elemento da lista
    public void removerInicio() {

        // Verifica se a lista está vazia
        if (this.inicio == null) {
            System.out.println("A lista está vazia!");
            return;
        }

        this.inicio = this.inicio.proximo;

        if (this.inicio == null) {
            this.fim = null;
        }

        this.tamanho--;
    }

    // Mostrar lista
    public void imprimir() {

        No atual = this.inicio;

        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }

        System.out.println();
    }

    // Mostrar tamanho
    public int getTamanho() {
        return this.tamanho;
    }
}