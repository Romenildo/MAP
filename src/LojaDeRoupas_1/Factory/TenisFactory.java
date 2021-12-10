package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Tenis.*;

public class TenisFactory {
	
	public Tenis pedidoTenis(String nome, Pedido pedido) {
		
		Tenis novoTenis = null;
		
		switch (nome){
			case "CanoAlto": 
				novoTenis = new CanoAlto(pedido);
				break;
			case "Esportivo": 
				novoTenis = new Esportivo(pedido);
				break;
			case "Sapatenis": 
				novoTenis = new Sapatenis(pedido);
				break;
			default:
				System.out.println(nome + ": Modelo de tenis não existente");
            	break;
			}
		
		
		
		return novoTenis;
	}
}