package LojaDeRoupas_3.Composite;

public class Cartao implements Pagamento{
	
	private double valor;
	private String nomeCliente;
	private String numCartao;
	private int tipo;//1-debito  2-credito
	
	public Cartao(double valor, String nomeCliente, String numCartao, int tipo) {
		this.valor = gerarTaxaCartao(valor);
		this.nomeCliente = nomeCliente;
		this.numCartao = numCartao;
		this.tipo = tipo;
	}
	
	public double gerarTaxaCartao(double valor) {
		if(this.tipo == 2) {
			return valor + valor * 0.15;
		}else {
			return valor;
		}
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
