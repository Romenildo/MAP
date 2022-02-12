package LojaDeRoupas_3.Composite;

import java.util.List;

public class Cartao implements Pagamento{
	
	private double valor;
	private String nomeCliente;
	private String numCartao;
	private int tipo;//1-debito  2-credito
	private String tipoCartao;
	private List<Pagamento> pagamento;
	
	public Cartao(double valor, String nomeCliente, String numCartao, int tipo, List<Pagamento> pagamento) {
		this.valor = valor;
		this.nomeCliente = nomeCliente;
		this.numCartao = numCartao;
		this.tipoCartao = (tipo == 1)?"Debito": "Credito";
		this.pagamento = pagamento;
	}
	
	public double gerarTaxaCartao(double valor,int tipo) {
		if(tipo == 2) {
			return valor + valor * 0.15;
		}else {
			return valor;
		}
	}
	
	@Override
	public void valorTotal() {
		System.out.println("Pagamento concluido: R$:"+ gerarTaxaCartao(valor, tipo));
		
	}

	@Override
	public void mostrarComprovante() {
		System.out.println("*-------  COMPRA CARTAO -------*");
		System.out.println("Cliente: "+ this.nomeCliente);
		System.out.println("NumCartao: "+ this.numCartao);
		System.out.println("Tipo: " + this.tipoCartao + "\n");
		for(Pagamento items:pagamento){
			if(items != null) {items.mostrar();}
        }
		System.out.println("\nPreço:                R$:"+ this.valor );
		System.out.println("Total com Acrescimos: R$: "+ gerarTaxaCartao(valor, tipo));
		System.out.println("*--------------------------*");
		
	}

	@Override
	public void mostrar() {
		System.out.println("Cliente: "+nomeCliente + "   Total: R$"+ this.valor);
		
	}

}
