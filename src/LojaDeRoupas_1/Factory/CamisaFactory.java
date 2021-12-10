package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Camisas.*;

public class CamisaFactory {
	
	 public Camisa pedidoCamisa(String nome, Pedido pedido){
	        Camisa novaCamisa = null;
	        
	        switch (nome) {
	            case "regata": 
	            	novaCamisa = new Regata(pedido);
	            	break;
	            case "Mangalonga": 
	            	novaCamisa = new MangaLonga(pedido); 
	            	break;
	            case "Polo": 
	            	novaCamisa = new Polo(pedido);
	            	break;
	            case "MangaCurta": 
	            	novaCamisa = new MangaCurta(pedido);
	            	break;
	            default: 
	            	System.out.println("Modelo de Camisa não existente");
	            	break;
	        }
	        
	        return novaCamisa;
	 }
}
