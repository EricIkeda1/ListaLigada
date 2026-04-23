package ListaLigada;

public class Aplicacao {
    public static void main(String[] args) {
        ListaLigada lista = new ListaLigada();

        lista.inserirNoInicio(5);
        lista.inserirNoInicio(10);
        lista.inserirNoInicio(15);

        System.out.print("Elementos da lista: ");
        lista.exibir(); 
    }
}