package LojaDeRoupas_2.Modelo;

import java.util.ArrayList;
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
	private ArrayList<Object> carrinho;
	
	public Carrinho(String brinde, Calca calca, Camisa camisa, Chapeu chapeu, Short shorts, Vestido vestido, Tenis tenis) {
		
		carrinho = new ArrayList<>();
		this.brinde = brinde;
		this.calca = calca;
		this.camisa = camisa;
		this.chapeu = chapeu;
		this.shorts = shorts;
		this.vestido = vestido;
		this.tenis = tenis;
		
		carrinho.add(brinde);
		if ( calca != null) carrinho.add(calca);
		if ( camisa != null) carrinho.add(camisa);
		if ( chapeu != null) carrinho.add(chapeu);
		if ( shorts != null) carrinho.add(shorts);
		if ( vestido != null) carrinho.add(vestido);
		if ( tenis != null) carrinho.add(tenis);

	}
	
	@Override
	public String toString() {
		return "Carrinho [brinde=" + brinde + ", calca=" + calca.getDescricao() + ", camisa=" + camisa + ", chapeu=" + chapeu
				+ ", shorts=" + shorts + ", vestido=" + vestido + ", tenis=" + tenis + "]";
	}
	
	
	public int getQuantidadeItens(){
		return carrinho.size();
		
	}

	
	public int getValorCarrinho(){
		int valor = 0;
		if (calca != null) valor += calca.getPreco();
		if (camisa != null) valor += camisa.getPreco();
		if (chapeu != null) valor += chapeu.getPreco();
		
		//atencao:
		//if (shorts != null) valor += shorts.getPreco();
		
		if (vestido != null) valor += vestido.getPreco();
		if (tenis != null) valor += tenis.getPreco();
		return valor;
	}
	
	
	public String getItensCarrinho(){
		String itens = "";
		for (Object item : carrinho) {
			itens += item + ", ";
		}
		return itens;
	}
	
}
