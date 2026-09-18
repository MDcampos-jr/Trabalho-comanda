package Model;

public class Pedido   {
    private int id;
    private Comanda[] comanda;

    public Pedido(int id) {
        this.id = id;
        this.comanda = new Comanda[0];
    }

    public int getId() {
        return id;
    }

    public Comanda[] getComanda() {
        return comanda;
    }

    public void adicionarComanda(Comanda novaComanda) {
        Comanda[] novoArray = new Comanda[comanda.length + 1];

        for (int i = 0; i < comanda.length; i++) {
            novoArray[i] = comanda[i];
        }

        novoArray[novoArray.length - 1] = novaComanda;
        comanda = novoArray;

        System.out.println("Model.Comanda adicionada ao pedido " + id);
    }

    public double calcularTotalPedido() {
        double total = 0;

        for (int i = 0; i < comanda.length; i++) {
            total += comanda[i].calcularTotal();
        }

        return total;
    }

}
