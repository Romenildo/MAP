package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Tenis.CanoAlto;
import LojaDeRoupas_1.Modelo.Tenis.Esportivo;
import LojaDeRoupas_1.Modelo.Tenis.Sapatenis;

public class TenisFactory {
	
	public Tenis pedidoTenis(String tipoDeTenis, String pedido) {
		
		//adicionar o pedido nos parametros de criacao do mdoelo
		
		Tenis novoTenis = null;
		
		switch (tipoDeTenis){
			case "CanoAlto": 
				novoTenis = new CanoAlto();
				break;
			case "Esportivo": 
				novoTenis = new Esportivo();
				break;
			case "Sapatenis": 
				novoTenis = new Sapatenis();
				break;
			default:
				System.out.println("Modelo de tenis não existente");
            	break;
			}
		
		
		
		return novoTenis;
	}
}