package LojaDeRoupas_1;

import LojaDeRoupas_1.Factory.*;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Vestidos.Vestido;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;

public class Cliente {
	public static void main(String [] args) {
		
		//Factorys
		CamisaFactory facCamisa = new CamisaFactory();
		VestidoFactory facVestido = new VestidoFactory();
		TenisFactory facTenis = new TenisFactory();
		
		//objetos
		Camisa camisa = facCamisa.pedidoCamisa("regata");
		Vestido vestido = facVestido.pedidoVestido("Longo");
		Tenis tenis = facTenis.pedidoTenis("CanoAlto");
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Camisa: ");
		System.out.println(camisa.getDescricao());
		System.out.println(camisa.getPreco());
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Vestido: ");
		System.out.println(vestido.getDescricao());
		System.out.println(vestido.getPreco());
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=");
		
		System.out.println("Tenis: ");
		System.out.println(tenis.getDescricao());
		System.out.println(tenis.getPreco());
	}
}

