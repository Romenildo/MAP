package LojaDeRoupas_3.Composite;

public class Cartao implements Pagamento{
	
	private double valor;
	private String nomeCliente;
	private String numCartao;
	
	public Cartao(double valor, String nomeCliente, String numCartao) {
		this.valor = gerarTaxaCartao(valor);
		this.nomeCliente = nomeCliente;
		this.numCartao = numCartao;
	}
	
	//fazer uma certa % na taxa do valor dependendo do tipo do cartao
	
	public double gerarTaxaCartao(double valor) {
		return valor * 0.15;
	}
	
	

	@Override
	public void valorTotal() {
		System.out.println("Valor a ser pago:"+ this.valor);
		
	}

}
