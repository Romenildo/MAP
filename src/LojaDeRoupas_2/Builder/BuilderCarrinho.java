package LojaDeRoupas_2.Builder;

import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Vestidos.Vestido;
import LojaDeRoupas_2.Modelo.Carrinho;

public class BuilderCarrinho {
	
	//Item obrigatorio
	private String brinde;
	
	// item opcional
	private Calca calca;
	private Camisa camisa;
	private Chapeu chapeu;
	private Short shorts;
	private Vestido vestido;
	private Tenis tenis;
	
	public BuilderCarrinho(String brinde) {
		this.brinde = brinde;
	}
	
	public BuilderCarrinho addCamisa(Camisa camisa) {
		this.camisa = camisa;
		return this;
	}
	public BuilderCarrinho addCalca(Calca calca) {
		this.calca = calca;
		return this;
	}
	public BuilderCarrinho addChapeu(Chapeu chapeu) {
		this.chapeu = chapeu;
		return this;
	}
	
	public BuilderCarrinho addShort(Short shorts) {
		this.shorts = shorts;
		return this;
	}
	public BuilderCarrinho addVestido(Vestido vestido) {
		this.vestido = vestido;
		return this;
	}
	public BuilderCarrinho addTenis(Tenis tenis) {
		this.tenis = tenis;
		return this;
	}
	
	public Carrinho fimPedido() {
		return new Carrinho(brinde, calca, camisa, chapeu, shorts, vestido, tenis);
	}
}
