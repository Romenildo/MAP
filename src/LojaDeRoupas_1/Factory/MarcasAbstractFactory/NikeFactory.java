package LojaDeRoupas_1.Factory.MarcasAbstractFactory;

import LojaDeRoupas_1.Modelo.Marcas.Marca;
import LojaDeRoupas_1.Modelo.Marcas.Nike;

public class NikeFactory implements MarcasFactory{

	@Override
	public Marca getDescricaoMarca() {
		// TODO Auto-generated method stub
		return new Nike();
	}
	

}
