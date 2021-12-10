package LojaDeRoupas_1.Modelo.Tenis;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Factory.MarcasAbstractFactory.AdidasFactory;
import LojaDeRoupas_1.Modelo.Marcas.Marca;

public class Sapatenis extends Tenis{
	
	
	private static final float preco = 90.0f;
    private static final String descricao = "Tenis modelo Sapatenis";
    private static String cor;
	private static String tamanho;// (32,33,34,35,36,37,38,40,41,42)
	private static String genero;//unisex/masculino/feminino
	private static String info; //juncao de todas as informacoes
    
	
    private static Marca marca = new AdidasFactory().getMarca();

    //Construtor
    public Sapatenis(Pedido pedido) {
        this.cor = pedido.cor;
        this.tamanho = pedido.tamanho;
        this.genero = pedido.genero;
    	this.info = "Tipo: " + descricao + "\nPreço R$:" + preco +"\nCor: "+cor+"\nTamanho: "+tamanho+"\nGenero: "+genero+"\nMarca: " +marca.getDescricaoMarca() +"\n" ;
    }
    
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
	 
	 public String getInfo() {
		 return this.info;
	 }
}