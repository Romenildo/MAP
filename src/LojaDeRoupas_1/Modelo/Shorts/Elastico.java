package LojaDeRoupas_1.Modelo.Shorts;

import LojaDeRoupas_1.Factory.MarcasAbstractFactory.AdidasFactory;
import LojaDeRoupas_1.Modelo.Marcas.Marca;
import LojaDeRoupas_1.Pedido;

public class Elastico extends Short{

    //Atributos
    private static final float preco = 25.00f;
    private static final String descricao = "Short Elastico";
    private static String cor;
    private static String tamanho;
    private static String genero;
    private static String info;

    private static Marca marca = new AdidasFactory().getMarca();

    //Construtor
    public Elastico(Pedido pedido) {
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
