package LojaDeRoupas_1;

import LojaDeRoupas_1.Factory.*;
import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Vestidos.Vestido;
import LojaDeRoupas_1.Modelo.Shorts.Short;

import LojaDeRoupas_2.Builder.BuilderCarrinho;
import LojaDeRoupas_2.Modelo.Carrinho;

public class Cliente {
	public static void main(String [] args) {
		//Factorys
		CamisaFactory facCamisa = new CamisaFactory();
		CalcaFactory facCalca = new CalcaFactory();
		ChapeuFactory facChapeu = new ChapeuFactory();
		ShortFactory facShort = new ShortFactory();
		TenisFactory facTenis = new TenisFactory();
		VestidoFactory facVestido = new VestidoFactory();
		
		//pedidos
		Pedido pedidoCamisa1 = new Pedido("vermelha", "M", "Masculino");
		Pedido pedidoCalca1 = new Pedido("Preta","P", "Feminino");
		Pedido pedidoChapeu1 = new Pedido("Verde", "M", "Unissex");
		Pedido pedidoShort1 = new Pedido("Azul", "EGG", "Masculino");
		Pedido pedidoTenis1 = new Pedido("Branco", "42", "Masculino");
		Pedido pedidoVestido1 = new Pedido("Rosa", "M", "Feminino");
		
		//objetos
		Camisa camisa1 = facCamisa.pedidoCamisa("Mangalonga", pedidoCamisa1);
		Camisa camisa2 = facCamisa.pedidoCamisa("Regata", pedidoCamisa1);
		
		Calca calca1 = facCalca.pedidoCalca("Skinny", pedidoCalca1);
		
		Chapeu chapeu1 = facChapeu.pedidoChapeu("Fedora", pedidoChapeu1);
		
		Short short1 = facShort.pedidoShort("Praia", pedidoShort1);
		
		Tenis tenis1 = facTenis.pedidoTenis("Esportivo", pedidoTenis1);
		
		Vestido vestido1 = facVestido.pedidoVestido("Longo", pedidoVestido1);
		
		
		/*   --- MILESTONE 1 mostrar os dados dos pedidos----
		//Mostrar 
		System.out.println("------Camisas-----");
		System.out.println(camisa1.getInfo());
		System.out.println("-----------");
		System.out.println(camisa2.getInfo());
		System.out.println("------Calcas-----");
		System.out.println(calca1.getInfo());
		System.out.println("------Chapeu-----");
		System.out.println(chapeu1.getInfo());
		System.out.println("------Tenis-----");
		System.out.println(tenis1.getInfo());
		System.out.println("------Vestido-----");
		System.out.println(vestido1.getInfo());
		*/
		
		// --- MILESTONE 2 ---
		
		// Carrinhos de Compras
		Carrinho carrinho1 = new BuilderCarrinho("Calendario de Natal")
				.addCamisa(camisa1)
				.addCalca(calca1)
				.fimPedido();
		
		System.out.println(carrinho1.toString());
		carrinho1.MostrarItens();
	}
}

