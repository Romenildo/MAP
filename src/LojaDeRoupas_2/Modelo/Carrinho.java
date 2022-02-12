package LojaDeRoupas_2.Modelo;

import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Vestidos.Vestido;
import LojaDeRoupas_1.Modelo.Shorts.Short;

public class Carrinho {
	
	private String brinde;
	
	private Calca calca;
	private Camisa camisa;
	private Chapeu chapeu;
	private Short shorts;
	private Vestido vestido;
	private Tenis tenis;
	
	public Carrinho(String brinde, Calca calca, Camisa camisa, Chapeu chapeu, Short shorts, Vestido vestido, Tenis tenis) {
		
		this.brinde = brinde;
		this.calca = calca;
		this.camisa = camisa;
		this.chapeu = chapeu;
		this.shorts = shorts;
		this.vestido = vestido;
		this.tenis = tenis;

	}
	
	public int getQuantidadeItens(){
		int qnt_itens = 0;
		if (calca != null) qnt_itens++;
		if (camisa != null) qnt_itens++;
		if (chapeu != null) qnt_itens++;
		if (shorts != null) qnt_itens++;
		if (vestido != null) qnt_itens++;
		if (tenis != null) qnt_itens++;
		return qnt_itens;
	}

	public double getValorTotalCarrinho(){
		double valor = 0;
		if (calca != null) valor += calca.getPreco();
		if (camisa != null) valor += camisa.getPreco();
		if (chapeu != null) valor += chapeu.getPreco();
		if (shorts != null) valor += shorts.getPreco();
		if (vestido != null) valor += vestido.getPreco();
		if (tenis != null) valor += tenis.getPreco();
		return valor;
	}

	public String getItensCarrinho(){
		String itens = "Itens do Carrinho: \nBrinde: " + brinde + "\n";
		if (calca != null) itens += calca.getDescricao() + "   R$: "+ calca.getPreco() +"\n";
		if (camisa != null) itens += camisa.getDescricao() +"   R$: "+ camisa.getPreco() + "\n";
		if (chapeu != null) itens += chapeu.getDescricao() +"   R$: "+ chapeu.getPreco() + "\n";
		if (shorts != null) itens += shorts.getDescricao() +"   R$: "+ shorts.getPreco() + "\n";
		if (vestido != null) itens += vestido.getDescricao() +"   R$: "+ vestido.getPreco() + "\n";
		if (tenis != null) itens += tenis.getDescricao() +"   R$: "+ tenis.getPreco() + "\n";
		return itens;
	}
	

	public String getBrinde() {
		return brinde;
	}

	public Calca getCalca() {
		return calca;
	}

	public Camisa getCamisa() {
		return camisa;
	}

	public Chapeu getChapeu() {
		return chapeu;
	}

	public Short getShorts() {
		return shorts;
	}

	public Vestido getVestido() {
		return vestido;
	}

	public Tenis getTenis() {
		return tenis;
	}
	
	
}
