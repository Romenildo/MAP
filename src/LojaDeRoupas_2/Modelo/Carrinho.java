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

	public void MostrarItens() {
		System.out.println(this.calca.getDescricao());
	}
	
	//get valor total
	//get itens do carrinho
	
	
}
