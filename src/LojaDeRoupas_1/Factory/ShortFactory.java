package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;

public class ShortFactory {
	//Fazer Igual o da camisa mudando os objetos criados para os modelos de shorts
	
	public Short pedidoChapeu(String nome, Pedido pedido){
        Short novoShort = null;
        
        switch (nome) {
            case "modelo1": 
            	//novoShort = new (pedido); 
            	break;
            case "modelo2": 
            	//novoShort = new (pedido); 
            	break;
            case "modelo3": 
            	//novoShort = new (pedido); 
            	break;
            case "modelo4": 
            	//novoShort = new (pedido); 
            	break;
            default: 
            	System.out.println("Modelo do Short não existente");
            	break;
        }
        
        return novoShort;
 }
}
