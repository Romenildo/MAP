package LojaDeRoupas_2;

import LojaDeRoupas_2.Builder.BuilderLojaDeRoupa;
import LojaDeRoupas_2.Modelo.LojaDeRoupa;

public class Cliente {

	public static void main(String[] args) {
				
		LojaDeRoupa pedido1 = new BuilderLojaDeRoupa("jeans")
				.umaCamisa("regata")
				.umChapeu("bone")
				.umShort("vermuda")
				.umVestido("longo")
				.fimPedido();
		
		System.out.println(pedido1);

	}

}
