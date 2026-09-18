package View;

import Model.Pedido;
import Model.Comanda;
import Model.ItemConsumacao;

public class PedidoView {

    // Mostra confirmação quando um item é adicionado a uma comanda
    public void mostrarItemAdicionado(ItemConsumacao item) {
        System.out.println("Item adicionado: " + item.getNome()
                + " | Qtd: " + item.getQuantidade()
                + " | R$ " + item.getSubtotal());
    }

    // Mostra só o total final do pedido
    public void mostrarTotalPedido(Pedido pedido) {
        System.out.println("Total do pedido " + pedido.getId() + ": R$ " + pedido.calcularTotalPedido());
    }

    // Mostra uma comanda específica e todos os itens dela
    public void mostrarComanda(Comanda comanda) {
        System.out.println("Comanda " + comanda.getComanda() + ":");

        for (ItemConsumacao item : comanda.getItemConsumacao()) {
            System.out.println("  - " + item.getNome()
                    + " x" + item.getQuantidade()
                    + " = R$ " + item.getSubtotal());
        }
    }

    // Mostra o resumo completo do pedido: todas as comandas + itens + total
    public void mostrarDetalhesPedido(Pedido pedido) {
        System.out.println("=== Detalhes do Pedido " + pedido.getId() + " ===");

        for (Comanda comanda : pedido.getComanda()) {
            mostrarComanda(comanda);
        }

        mostrarTotalPedido(pedido);
    }
}