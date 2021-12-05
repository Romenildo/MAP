package LojaDeRoupas_1;

import LojaDeRoupas_1.Factory.*;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;

public class Cliente {
	public static void main(String [] args) {
		//Factorys
		CamisaFactory facCamisa = new CamisaFactory();
		
		//objetos
		Camisa camisa = facCamisa.pedidoCamisa("regata");
		
		System.out.println(camisa.getDescricao());
	}
}

