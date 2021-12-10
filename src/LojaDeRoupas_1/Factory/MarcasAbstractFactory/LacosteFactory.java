package LojaDeRoupas_1.Factory.MarcasAbstractFactory;

import LojaDeRoupas_1.Modelo.Marcas.Lacoste;
import LojaDeRoupas_1.Modelo.Marcas.Marca;

public class LacosteFactory implements MarcasFactory{

	@Override
	public Marca getMarca() {
		// TODO Auto-generated method stub
		return new Lacoste();
	}

}
