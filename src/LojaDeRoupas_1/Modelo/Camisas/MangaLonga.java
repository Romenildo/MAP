package LojaDeRoupas_1.Modelo.Camisas;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Factory.MarcasAbstractFactory.*;
import LojaDeRoupas_1.Modelo.Marcas.Marca;


public class MangaLonga extends Camisa{
	
	//Atributos
	private static final float preco = 120.00f;
    private static final String descricao = "Camisa MangaLonga";
    private static String cor;
    private static String tamanho;
    private static String genero;
    private static String info;
    
    private static Marca marca = new AdidasFactory().getMarca();
    
    //Construtor
    public MangaLonga(Pedido pedido) {
    	this.cor = pedido.cor;
    	this.tamanho = pedido.tamanho;
    	this.genero = pedido.genero;
    	this.info = "Tipo: " + descricao + "\nPreço R$:" + preco +"\nCor: "+cor+"\nTamanho: "+tamanho+"\nGenero: "+genero+"\nMarca: " +marca.getDescricaoMarca() +"\n" ;
    }
    
    //Getters
    public String getDescricao() {
    	return this.descricao;
    }
    
    public String getGenero() {
    	return this.genero;
    }
    
    public String getInfo() {
    	return this.info;
    }
    
	public float getPreco() {
		return this.preco;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public String getTamanho() {
		return this.tamanho;
	}
	
	public String getMarca() {
		 return this.marca.getDescricaoMarca();
	 }
    
}
