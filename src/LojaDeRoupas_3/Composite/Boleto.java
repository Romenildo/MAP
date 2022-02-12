package LojaDeRoupas_3.Composite;

import java.util.Date;
import java.util.List;

public class Boleto implements Pagamento{

	private String nomeCliente;
	private double valor;
	private Date dataCompra;
	private List<Pagamento> pagamento;
	
	public Boleto(double valor, String nomeCliente, List<Pagamento> pagamento) {
		this.nomeCliente = nomeCliente;
		this.valor = valor;
		this.dataCompra = new Date();
		this.pagamento = pagamento;
	}
	
	@Override
	public void valorTotal() {
		System.out.println("Pagamento concluido: R$:"+ this.valor);
	}

	@Override
	public void mostrarComprovante() {
		System.out.println("*-------  COMPRA BOLETO -------*");
		System.out.println("Cliente: "+ this.nomeCliente + "\n");
		System.out.println("Data: " + dataCompra);
		for(Pagamento items:pagamento){
            if(items != null) {items.mostrar();}
        }
		System.out.println("\nTotal: "+ this.valor );
		System.out.println("*--------------------------*");
		
	}

	@Override
	public void mostrar() {
		System.out.println("Cliente: "+nomeCliente + "   Total: R$"+ this.valor);
	}

}
