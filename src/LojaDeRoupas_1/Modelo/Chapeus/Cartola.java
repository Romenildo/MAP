package LojaDeRoupas_1.Modelo.Chapeus;

import LojaDeRoupas_1.Factory.MarcasAbstractFactory.CalvinKleinFactory;
import LojaDeRoupas_1.Factory.MarcasAbstractFactory.NikeFactory;
import LojaDeRoupas_1.Modelo.Marcas.CalvinKlein;
import LojaDeRoupas_1.Modelo.Marcas.Marca;
import LojaDeRoupas_1.Pedido;

public class Cartola extends Chapeu{
	//Fazer igual Manga Longa alterando os valores das variaveis, preco, descri��o...

    //Atributos
    private static final float preco = 69.00f;
    private static final String descricao = "Cartola";
    private static String cor;
    private static String tamanho;
    private static String genero;
    private static String info;

    //As marcas deve alterar tipo: quem faz regata nike, manga longa adidas, polo Calvin klein
    private static Marca marca = new CalvinKleinFactory().getMarca();

    //Construtor
    public Cartola(Pedido pedido) {
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
