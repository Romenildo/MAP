package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Shorts.*;
import LojaDeRoupas_1.Modelo.Shorts.Short;


public class ShortFactory {
	
	public Short pedidoShort(String nome, Pedido pedido){
        Short novoShort = null;
        
        switch (nome) {
            case "Bermuda": 
            	novoShort = new Bermuda(pedido); 
            	break;
            case "Elastico": 
            	novoShort = new Elastico(pedido); 
            	break;
            case "Praia": 
            	novoShort = new Praia(pedido); 
            	break;
            default: 
            	System.out.println(nome + ": Modelo do Short não existente");
            	break;
        }
        
        return novoShort;
 }
}

	
	 
	        
	        
	        

