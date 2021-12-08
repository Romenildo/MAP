package LojaDeRoupas_1.Modelo.Tenis;

import LojaDeRoupas_1.Modelo.Marcas.Marca;

public abstract class Tenis {
	
	private float preco; //Em Reais
	 private String descricao;
	 private String cor;
	 private String tamanho;// (32,33,34,35,36,37,38,40,41,42)
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
