package LojaDeRoupas_2.Modelo;

import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Vestidos.Vestido;

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
	
	@Override
	public String toString() {
		return "Carrinho [brinde=" + brinde + ", calca=" + calca.getDescricao() + ", camisa=" + camisa + ", chapeu=" + chapeu
				+ ", shorts=" + shorts + ", vestido=" + vestido + ", tenis=" + tenis + "]";
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

	
	public int getValorCarrinho(){
		int valor = 0;
		if (calca != null) valor += calca.getPreco();
		if (camisa != null) valor += camisa.getPreco();
		if (chapeu != null) valor += chapeu.getPreco();
		
		//sem funcionar:
		//if (shorts != null) valor += shorts.getPreco();
		
		if (vestido != null) valor += vestido.getPreco();
		if (tenis != null) valor += tenis.getPreco();
		return valor;
	}
	
	
	public String getItensCarrinho(){
		String itens = "Brinde: " + brinde + ", ";
		if (calca != null) itens += calca + ", ";
		if (camisa != null) itens += camisa + ", ";
		if (chapeu != null) itens += chapeu + ", ";
		if (shorts != null) itens += shorts + ", ";
		if (vestido != null) itens += vestido + ", ";
		if (tenis != null) itens += tenis;
		return itens;
	}
}
