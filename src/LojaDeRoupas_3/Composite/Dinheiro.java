package LojaDeRoupas_3.Composite;

public class Dinheiro implements Pagamento{
	
	private String nomeCliente;
	private double valor;
	
	public Dinheiro(double valor, String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.valor = valor;
	}

	@Override
	public void valorTotal() {
		System.out.println("Valor a ser pago:"+ this.valor);
		
	}

}
