package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Modelo.Vestidos.Longo;
import LojaDeRoupas_1.Modelo.Vestidos.Curto;
import LojaDeRoupas_1.Modelo.Vestidos.Vestido;

public class VestidoFactory {
	
	 public Vestido pedidoVestido(String nome, String pedido){
		 
		 //Adicionar o pedido nos parametros de criacao
		 Vestido novoVestido = null; 
		 
	        switch (nome) {
	            case "Curto": 
	            	novoVestido = new Curto(); 
	            	break;
	            case "Longo": 
	            	novoVestido = new Longo(); 
	            	break;
	            default: 
	            	System.out.println("Modelo de Vestido n�o existente");
	            	break;
	        }
	        
	        return novoVestido;
	 }
}