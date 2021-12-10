package LojaDeRoupas_1.Factory;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Modelo.Chapeus.*;

public class ChapeuFactory {
	
	public Chapeu pedidoChapeu(String nome, Pedido pedido){
        Chapeu novoChapeu = null;
        
        switch (nome) {
            case "Boina": 
            	novoChapeu = new Boina(pedido);
            	break;
            case "Bone": 
            	novoChapeu = new Bone(pedido); 
            	break;
            case "Cartola": 
            	novoChapeu = new Cartola(pedido); 
            	break;
            case "Fedora": 
            	novoChapeu = new Fedora(pedido); 
            	break;
            default: 
            	System.out.println(nome + ": Modelo de Chapeu não existente");
            	break;
        }
        
        return novoChapeu;
 }
}
