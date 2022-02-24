package LojaDeRoupas_2.Modelo;

import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Shorts.Short;

public class Carrinho {
	
	private String brinde;
	
	private Calca calca;
	private Camisa camisa;
	private Chapeu chapeu;
	private Short shorts;
	private Tenis tenis;
	private String [][]arrayItens;
	
	public Carrinho(String brinde, Calca calca, Camisa camisa, Chapeu chapeu, Short shorts, Tenis tenis) {
		
		this.brinde = brinde;
		this.calca = calca;
		this.camisa = camisa;
		this.chapeu = chapeu;
		this.shorts = shorts;
		this.tenis = tenis;
		arrayItens = new String[6][2];

	}
	
	public int getQuantidadeItens(){
		int qnt_itens = 0;
		if (calca != null) qnt_itens++;
		if (camisa != null) qnt_itens++;
		if (chapeu != null) qnt_itens++;
		if (shorts != null) qnt_itens++;
		if (tenis != null) qnt_itens++;
		return qnt_itens;
	}

	public double getValorTotalCarrinho(){
		double valor = 0;
		if (calca != null) valor += calca.getPreco();
		if (camisa != null) valor += camisa.getPreco();
		if (chapeu != null) valor += chapeu.getPreco();
		if (shorts != null) valor += shorts.getPreco();
		if (tenis != null) valor += tenis.getPreco();
		return valor;
	}

	public String getItensCarrinho(){
		String itens = "Itens do Carrinho: \nBrinde: " + brinde + "\n";
		if (calca != null) itens += calca.getDescricao() + "   R$: "+ calca.getPreco() +"\n";
		if (camisa != null) itens += camisa.getDescricao() +"   R$: "+ camisa.getPreco() + "\n";
		if (chapeu != null) itens += chapeu.getDescricao() +"   R$: "+ chapeu.getPreco() + "\n";
		if (shorts != null) itens += shorts.getDescricao() +"   R$: "+ shorts.getPreco() + "\n";
		if (tenis != null) itens += tenis.getDescricao() +"   R$: "+ tenis.getPreco() + "\n";
		return itens;
	}
	
	public String[][] getArrayCarrinho(){
		int i = 0;
		if (calca != null) {arrayItens[i][0] = calca.getDescricao();arrayItens[i][1] = String.valueOf(calca.getPreco());i++;}
		if (camisa != null) {arrayItens[i][0] = camisa.getDescricao();arrayItens[i][1] = String.valueOf(camisa.getPreco());i++;}
		if (chapeu != null) {arrayItens[i][0] = chapeu.getDescricao();arrayItens[i][1] = String.valueOf(chapeu.getPreco());i++;}
		if (shorts != null) {arrayItens[i][0] = shorts.getDescricao();arrayItens[i][1] = String.valueOf(shorts.getPreco());i++;}
		if (tenis != null) {arrayItens[i][0] = tenis.getDescricao();arrayItens[i][1] = String.valueOf(tenis.getPreco());i++;}

		return arrayItens;
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


	public Tenis getTenis() {
		return tenis;
	}
	
	
}
