package LojaDeRoupas_3.Composite;

public class Item  implements Pagamento{
	
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
		System.out.println("Valor do produto R$:"+preco);
		
	}

	@Override
	public void mostrar() {
		System.out.println(item + "------------ R$:"+preco);
		
	}

}
