package LojaDeRoupas_1.Modelo.Vestidos;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Factory.MarcasAbstractFactory.CalvinKleinFactory;
import LojaDeRoupas_1.Modelo.Marcas.Marca;

public class Longo extends Vestido{
	
	
	private static final float preco = 65.0f;
    private static final String descricao = "Vestido Longo";
    private static String cor;
	private static String tamanho;//P M G GG EGG
	private static String genero;//feminino
	private static String info; //juncao de todas as informacoes
    
	
    private static Marca marca = new CalvinKleinFactory().getMarca();

    //Construtor
    public Longo(Pedido pedido) {
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



