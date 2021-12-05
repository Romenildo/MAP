package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Modelo.Camisas.*;

public class CamisaFactory {
	
	 public Camisa pedidoCamisa(String nome){
	        Camisa novaCamisa = null;
	        
	        switch (nome) {
	            case "regata": 
	            	novaCamisa = new Regata(); 
	            	break;
	            case "Mangalonga": 
	            	novaCamisa = new MangaLonga(); 
	            	break;
	            default: 
	            	System.out.println("Modelo de Camisa não existente");
	            	break;
	        }
	        
	        novaCamisa.getPreco();
	        novaCamisa.getDescricao();
	        
	        return novaCamisa;
	 }
}
