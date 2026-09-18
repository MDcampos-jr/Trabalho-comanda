package Model;

public class Comanda {
    private int id;
    private int numeroComanda;
    private ItemConsumacao[] ItemConsumacao;

    public Comanda(int id, int numeroComanda) {
        this.id = id;
        this.numeroComanda = numeroComanda;
        this.ItemConsumacao = new ItemConsumacao[0];
    }

    public int getId() {

        return id;

    }
    public int getComanda() {
        return numeroComanda;

    }
    public ItemConsumacao[] getItemConsumacao() {
        return ItemConsumacao;
    }

    public void adicionarItem(ItemConsumacao item) {
        ItemConsumacao[] novoArray = new ItemConsumacao[ItemConsumacao.length + 1];
        for (int i = 0; i < ItemConsumacao.length; i++) {
            novoArray[i] = ItemConsumacao[i];
        }
        novoArray[novoArray.length - 1] = item;
        ItemConsumacao = novoArray;
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < ItemConsumacao.length; i++) {
            total += ItemConsumacao[i].getSubtotal();
        }
        return total;
    }
}