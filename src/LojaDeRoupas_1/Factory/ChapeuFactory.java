package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;


public class ChapeuFactory {
	
	public Chapeu pedidoChapeu(String nome, Pedido pedido){
        Chapeu novoChapeu = null;
        
        switch (nome) {
            case "modelo1": 
            	//novoChapeu = new (pedido); 
            	break;
            case "modelo2": 
            	//novoChapeu = new (pedido); 
            	break;
            case "modelo3": 
            	//novoChapeu = new (pedido); 
            	break;
            case "modelo4": 
            	//novoChapeu = new (pedido); 
            	break;
            default: 
            	System.out.println("Modelo de Chapeu não existente");
            	break;
        }
        
        return novoChapeu;
 }
}
