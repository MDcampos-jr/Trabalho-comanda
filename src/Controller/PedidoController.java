package Controller;

import Model.Comanda;
import Model.ItemConsumacao;
import Model.Pedido;
import View.PedidoView;

public class PedidoController {
    private Pedido pedido;
    private PedidoView view;

    public PedidoController(int idPedido) {
        this.pedido = new Pedido(idPedido);
        this.view = new PedidoView();
    }

    // Cria uma nova comanda e já adiciona ao pedido
    public Comanda criarComandaEAdicionar(int idComanda, int numeroComanda) {
        Comanda comanda = new Comanda(idComanda, numeroComanda);
        pedido.adicionarComanda(comanda);
        view.mostrarComanda(comanda);
        return comanda;
    }

    // Cria um item e adiciona a uma comanda específica
    public void adicionarItemNaComanda(Comanda comanda, String nome, double preco, int quantidade) {
        ItemConsumacao item = new ItemConsumacao(nome, preco, quantidade);
        comanda.adicionarItem(item);
        view.mostrarItemAdicionado(item);
    }
        public void exibirResumo() {
            view.mostrarDetalhesPedido(pedido);
    }
    // Mostra só o total final
    public void exibirTotal() {
        view.mostrarTotalPedido(pedido);
    }

    // Getter caso precise acessar o pedido diretamente
    public Pedido getPedido() {
        return pedido;
    }
}