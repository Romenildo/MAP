package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Modelo.Tenis.*;

public class TenisFactory {
	
	public Tenis pedidoTenis(String tipoDeTenis, String pedido) {
		
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