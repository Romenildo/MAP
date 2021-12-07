package LojaDeRoupas_1.Modelo.Marcas;

import LojaDeRoupas_1.Modelo.Marcas.Marca;

public class Adidas implements Marca{
	
	String descricao = "Adidas";
	@Override
	public String getDescricaoMarca() {
		// TODO Auto-generated method stub
		return this.descricao;
	}
}

