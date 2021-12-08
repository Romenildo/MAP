package LojaDeRoupas_1.Modelo.Chapeus;

import LojaDeRoupas_1.Modelo.Marcas.Marca;

public class Chapeu {
	
	private float preco; //Em Reais
	 private String descricao;
	 private String cor;
	 private String tamanho;//P M G GG EGG
	 private String genero;//unisex/masculino/feminino
	 private String info; //juncao de todas as informacoes
	 
	 private Marca marca;
	 
	 public float getPreco(){
	      return this.preco;
	 }

	 public String getDescricao(){
	      return this.descricao;
	 }
	 
	 public String getCor() {
		 return this.cor;
	 }
	 
	 public String getTamanho() {
		 return this.tamanho;
	 }
	 public String getGenero() {
		 return this.genero;
	 }
	 
	 public String getMarca() {
		 return this.marca.getDescricaoMarca();
	 }
	 public String getInfo() {
		 return this.info;
	 }
}
