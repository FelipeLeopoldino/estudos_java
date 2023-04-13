package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {

		Compra compra1 = new Compra();

		compra1.cliente = "Felipe";
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 12, 3.45));
		compra1.adicionarItem(new Item("Caderno", 3, 18.45));

		System.out.println(compra1.itens.size());
		System.out.println(compra1.obterValorTotal());

		// so para mostrar a relçacao bidirecional
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total é " + total);
	}
}
