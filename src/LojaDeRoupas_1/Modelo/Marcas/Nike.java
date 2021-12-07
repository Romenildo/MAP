package LojaDeRoupas_1.Modelo.Marcas;

import LojaDeRoupas_1.Modelo.Marcas.Marca;

public class Nike implements Marca{
	
	String descricao = "Nike";
	@Override
	public String getDescricaoMarca() {
		// TODO Auto-generated method stub
		return this.descricao;
	}
}

