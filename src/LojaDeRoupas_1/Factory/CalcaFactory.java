package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Calcas.*;


public class CalcaFactory {

	public Calca pedidoCamisa(String nome, Pedido pedido){
        Calca novaCamisa = null;
        
        switch (nome) {
            case "Jeans": 
            	novaCamisa = new Jeans(pedido);
            	break;
            case "Moleton": 
            	novaCamisa = new Moleton(pedido); 
            	break;
            case "Skinny": 
            	novaCamisa = new Skinny(pedido);
            	break;
            case "Social": 
            	novaCamisa = new Social(pedido);
            	break;
            default: 
            	System.out.println("Modelo de Calca não existente");
            	break;
        }
        
        return novaCamisa;
 }
	
}
