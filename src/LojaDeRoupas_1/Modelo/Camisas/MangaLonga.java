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
    
    //As marcas deve alterar tipo: quem faz regata nike, manga longa adidas, polo Calvin klein
    private static Marca marca = new NikeFactory().getMarca();
    
    //Construtor
    public MangaLonga(Pedido pedido) {
    	this.cor = pedido.cor;
    	this.tamanho = pedido.tamanho;
    	this.genero = pedido.genero;
    	this.info = "Tipo: " + descricao + "\nPre�o R$:" + preco +"\nCor: "+cor+"\nTamanho: "+tamanho+"\nGenero: "+genero+"\n";
    }
    
    //Getters
    public String getGenero() {
    	return this.genero;
    }
    
    public String getInfo() {
    	return this.info;
    }
    
	public float getPreco() {
		return preco;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String getTamanho() {
		return tamanho;
	}
	
	public String getMarca() {
		 return this.marca.getDescricaoMarca();
	 }
    
}
