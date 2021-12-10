package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Vestidos.*;

public class VestidoFactory {
	
	 public Vestido pedidoVestido(String nome, Pedido pedido){
		 
		 Vestido novoVestido = null; 
		 
	        switch (nome) {
	            case "Curto": 
	            	novoVestido = new Curto(pedido); 
	            	break;
	            case "Longo": 
	            	novoVestido = new Longo(pedido); 
	            	break;
	            default: 
	            	System.out.println(nome + ": Modelo de Vestido não existente");
	            	break;
	        }
	        return novoVestido;
	 }
}