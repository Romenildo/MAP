package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Camisas.*;

public class CamisaFactory {
	
	 public Camisa pedidoCamisa(String nome, Pedido pedido){
	        Camisa novaCamisa = null;
	        
	        switch (nome) {
	            case "regata": 
	            	novaCamisa = new Regata(); 
	            	break;
	            case "Mangalonga": 
	            	novaCamisa = new MangaLonga(pedido); 
	            	break;
	            default: 
	            	System.out.println("Modelo de Camisa n�o existente");
	            	break;
	        }
	        
	        novaCamisa.getPreco();
	        novaCamisa.getDescricao();
	        
	        return novaCamisa;
	 }
}
