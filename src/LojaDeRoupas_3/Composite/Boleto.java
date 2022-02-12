package LojaDeRoupas_3.Composite;

import java.util.Date;

public class Boleto implements Pagamento{

	private String nomeCliente;
	private double valor;
	private Date dataCompra;
	
	public Boleto(double valor, String nomeCliente) {
		this.nomeCliente = nomeCliente;
		this.valor = valor;
		this.dataCompra = new Date();
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
