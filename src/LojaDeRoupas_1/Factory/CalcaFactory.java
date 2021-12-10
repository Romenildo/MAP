package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Calcas.*;


public class CalcaFactory {

	public Calca pedidoCalca(String nome, Pedido pedido){
        Calca novaCalca = null;
        
        switch (nome) {
            case "Jeans": 
            	novaCalca = new Jeans(pedido);
            	break;
            case "Moleton": 
            	novaCalca = new Moleton(pedido); 
            	break;
            case "Skinny": 
            	novaCalca = new Skinny(pedido);
            	break;
            case "Social": 
            	novaCalca = new Social(pedido);
            	break;
            default: 
            	System.out.println(nome + ":Modelo de Calca não existente");
            	break;
        }
        
        return novaCalca;
 }
	
}
