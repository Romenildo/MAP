package LojaDeRoupas_1.Factory.MarcasAbstractFactory;

import LojaDeRoupas_1.Modelo.Marcas.CalvinKlein;
import LojaDeRoupas_1.Modelo.Marcas.Marca;

public class CalvinKleinFactory implements MarcasFactory{

	@Override
	public Marca getMarca() {
		// TODO Auto-generated method stub
		return new CalvinKlein();
	}

}
