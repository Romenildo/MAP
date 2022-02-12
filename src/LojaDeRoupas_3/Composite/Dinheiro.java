package LojaDeRoupas_3.Composite;

public class Dinheiro implements Pagamento{
	
	private String nomeCliente;
	private double valor;
	
	public Dinheiro(double valor, String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.valor = gerarDesconto(valor);
	}
	
	public double gerarDesconto(double valor) {
		return valor - valor * 0.10;
	}

	@Override
	public void valorTotal() {
		System.out.println("Pagamento concluido: R$:"+ this.valor);
	}

	@Override
	public void mostrarComprovante() {
		//fazer lista de itens com precos e o valor total no final
		
	}

}
