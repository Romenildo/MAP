package LojaDeRoupas_2.Builder;

import LojaDeRoupas_2.Modelo.LojaDeRoupa;

public class BuilderLojaDeRoupa {
	
	//item obrigatorio que é uma calca
	private String calca;
	
	// item opcional
	private String camisa;
	private String chapeu;
	private String shorts;
	private String vestido;
	
	public BuilderLojaDeRoupa(String calca) {
		this.calca = calca;
	}
	
	public BuilderLojaDeRoupa umaCamisa(String camisa) {
		this.camisa = camisa;
		return this;
	}
	public BuilderLojaDeRoupa umChapeu(String chapeu) {
		this.chapeu = chapeu;
		return this;
	}
	
	public BuilderLojaDeRoupa umShort(String shorts) {
		// short é uma palavra reservada por isso foi colocado no plural 
		this.shorts = shorts;
		return this;
	}
	public BuilderLojaDeRoupa umVestido(String vestido) {
		this.vestido = vestido;
		return this;
	}
	
	public LojaDeRoupa fimPedido() {
		return new LojaDeRoupa(calca, camisa, chapeu, shorts, vestido);
	}
}
