package LojaDeRoupas_1.Modelo.Camisas;

import LojaDeRoupas_1.Pedido;


public class MangaLonga extends Camisa{
	
	private static final float preco = 120.00f;
    private static final String descricao = "Camisa MangaLonga";
    private static String cor;
    private static String tamanho;
    private static String genero;
    private static String info;
    //Falta marca
    
    
    public MangaLonga(Pedido pedido) {
    	this.cor = pedido.cor;
    	this.tamanho = pedido.tamanho;
    	this.genero = pedido.genero;
    	this.info = "Tipo: " + descricao + "\nPreço R$:" + preco +"\nCor: "+cor+"\nTamanho: "+tamanho+"\nGenero: "+genero+"\n";
    }
    public String getGenero() {
    	return this.genero;
    }
    
    public String getInfo() {
    	return this.info;
    }
    
}
