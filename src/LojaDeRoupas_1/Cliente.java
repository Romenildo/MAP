package LojaDeRoupas_1;

import LojaDeRoupas_1.Factory.*;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;

public class Cliente {
	public static void main(String [] args) {
		//Factorys
		CamisaFactory facCamisa = new CamisaFactory();
		
		
		//pedidos
		Pedido pedido1 = new Pedido("vermelho", "M", "Masculino");
		
		//objetos
		
		Camisa camisa = facCamisa.pedidoCamisa("Mangalonga", pedido1);
		
		System.out.println(camisa.getInfo());
	}
}

