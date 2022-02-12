package LojaDeRoupas_3.Composite;

public class Item  implements Pagamento{
	
	
	//pegar os itens e valores do carrinho
	private String item;
	private double preco;
	public Item(String item, double preco) {
		this.item = item;
		this.preco = preco;
	}

	@Override
	public void valorTotal() {
		System.out.println(preco);
		
	}

	//tirar dps
	@Override
	public void mostrarComprovante() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mostrar() {
		System.out.println(item + "------------ R$:"+preco);
		
	}

}
