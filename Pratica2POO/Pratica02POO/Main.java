public class Main {

    public static void main(String[] args) {

        Estoque estoque = new Estoque("Produto A", 50, 10);

        System.out.println("Informações Iniciais:");
        System.out.println(estoque.mostra());

        estoque.darBaixa(20);
        System.out.println("\nApós dar baixa de 20 unidades:");
        System.out.println(estoque.mostra());

        if (estoque.precisaRepor()) {
            System.out.println("\nO estoque precisa ser reposto.");
        } else {
            System.out.println("\nO estoque não precisa ser reposto.");
        }
    }
}