package LojaDeRoupas_3.Composite;

import java.util.List;

public class Dinheiro implements Pagamento{
	
	private String nomeCliente;
	private double valor;
	private List<Pagamento> pagamento;
	
	public Dinheiro(double valor, String nomeCliente, List<Pagamento> pagamento) {
		this.pagamento = null;
		this.nomeCliente = nomeCliente;
		this.valor = valor;
		this.pagamento = pagamento;
	}
	
	public double gerarDesconto(double valor) {
		return valor - valor * 0.10;
	}

	@Override
	public void valorTotal() {
		System.out.println("Pagamento concluido: R$:"+ gerarDesconto(valor));
	}

	@Override
	public void mostrarComprovante() {
		System.out.println("*-------  COMPRA DINHEIRO-------*");
		System.out.println("Cliente: "+ this.nomeCliente + "\n");
		for(Pagamento items:pagamento){
			if(items != null) {items.mostrar();}
        }
		System.out.println("\nPreço: R$:"+ this.valor );
		System.out.println("Total Com desconto: R$: "+ gerarDesconto(valor));
		System.out.println("*--------------------------*");
	}

	@Override
	public void mostrar() {
		System.out.println("Cliente: "+nomeCliente + "   Total: R$"+ this.valor);
		
	}

}
