import Controller.PedidoController;
import Model.Comanda;

public class Main {
    public static void main(String[] args) {
        // Cria o controller, que já cria o Pedido e a View internamente
        PedidoController controller = new PedidoController(1);

        // Cria a primeira comanda e adiciona alguns itens nela
        Comanda comanda1 = controller.criarComandaEAdicionar(1, 101);
        controller.adicionarItemNaComanda(comanda1, "Refrigerante", 6.50, 2);
        controller.adicionarItemNaComanda(comanda1, "Couve de bruchelas", 18.00, 1);

        // Cria uma segunda comanda com outro item
        Comanda comanda2 = controller.criarComandaEAdicionar(2, 102);
        controller.adicionarItemNaComanda(comanda2, "Suco", 8.00, 1);

        // Mostra o resumo completo (todas as comandas + itens + total)
        controller.exibirResumo();
    }
}