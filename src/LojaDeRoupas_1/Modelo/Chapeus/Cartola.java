package LojaDeRoupas_1.Modelo.Chapeus;

import LojaDeRoupas_1.Factory.MarcasAbstractFactory.CalvinKleinFactory;
import LojaDeRoupas_1.Factory.MarcasAbstractFactory.NikeFactory;
import LojaDeRoupas_1.Modelo.Marcas.CalvinKlein;
import LojaDeRoupas_1.Modelo.Marcas.Marca;
import LojaDeRoupas_1.Pedido;

public class Cartola extends Chapeu{

    //Atributos
    private static final float preco = 70.00f;
    private static final String descricao = "Chapeu modelo Cartola";
    private static String cor;
    private static String tamanho;
    private static String genero;
    private static String info;

    private static Marca marca = new CalvinKleinFactory().getMarca();

    //Construtor
    public Cartola(Pedido pedido) {
        this.cor = pedido.cor;
        this.tamanho = pedido.tamanho;
        this.genero = pedido.genero;
    	this.info = "Tipo: " + descricao + "\nPreço R$:" + preco +"\nCor: "+cor+"\nTamanho: "+tamanho+"\nGenero: "+genero+"\nMarca: " +marca.getDescricaoMarca() +"\n" ;
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
