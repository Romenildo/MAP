package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Tenis.CanoAlto;
import LojaDeRoupas_1.Modelo.Tenis.Esportivo;
import LojaDeRoupas_1.Modelo.Tenis.Sapatenis;

public class TenisFactory {
	
	public Tenis pedidoTenis(String tipoDeTenis) {
		Tenis tenis = null;
		
		switch (tipoDeTenis){
			case "CanoAlto": 
				tenis = new CanoAlto();
				break;
			case "Esportivo": 
				tenis = new Esportivo();
				break;
			case "Sapatenis": 
				tenis = new Sapatenis();
				break;
			default:
				System.out.println("Modelo de tenis não existente");
            	break;
			}
		
		tenis.getDescricao();
		tenis.getPreco();
		
		return tenis;
	}
}
