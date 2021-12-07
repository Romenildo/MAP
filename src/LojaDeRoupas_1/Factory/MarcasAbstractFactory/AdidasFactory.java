package LojaDeRoupas_1.Factory.MarcasAbstractFactory;

import LojaDeRoupas_1.Modelo.Marcas.Adidas;
import LojaDeRoupas_1.Modelo.Marcas.Marca;

public class AdidasFactory implements MarcasFactory{

	@Override
	public Marca getDescricaoMarca() {
		// TODO Auto-generated method stub
		return new Adidas();
	}

}
