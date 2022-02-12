

import java.util.Arrays;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Factory.*;
import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Vestidos.Vestido;
import LojaDeRoupas_1.Modelo.Shorts.Short;

import LojaDeRoupas_2.Builder.BuilderCarrinho;
import LojaDeRoupas_2.Modelo.Carrinho;

import LojaDeRoupas_3.Composite.*;

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
		
		Carrinho carrinho2  = new BuilderCarrinho("brinde")
				.addTenis(tenis1)
				.fimPedido();
		/* APRESENTACAO MILESTONE 2
		//CARRINHO 1
		System.out.println("---Carrinho1----");
		System.out.print(carrinho1.getItensCarrinho());
		System.out.println("Preco total: R$: "+ carrinho1.getValorTotalCarrinho());
		System.out.println("Quantidade de itens no carrinho:" + carrinho1.getQuantidadeItens());
		
		//Ver informacao da roupa com mais detalhes
		System.out.println("\n--Detalhes da camisa--\n" + carrinho1.getCamisa().getInfo());
		
		// CARRINHO 2
		System.out.println("---Carrinho2----");
		System.out.print(carrinho2.getItensCarrinho());
		System.out.println("Preco total: R$: "+ carrinho2.getValorTotalCarrinho());
		System.out.println("Quantidade de itens no carrinho:" + carrinho2.getQuantidadeItens());
		
		//Ver informacao da roupa com mais detalhes
		System.out.println("\n--Detalhes da camisa--\n" + carrinho2.getTenis().getInfo());
		*/
		
		/*MILESTONE 3*/
		//Composite
		Pagamento [] itens = new Item[6];
		String[][] arrayItens = carrinho1.getArrayCarrinho();
		
		
		for(int i = 0; i< carrinho1.getQuantidadeItens();i++) {
			itens[i] = new Item(arrayItens[i][0], Double.parseDouble(arrayItens[i][1]));
		}
		
		Pagamento pagamento1 = new Cartao(carrinho1.getValorTotalCarrinho(),"Joaquim", "1829 9182 1928 2020", 1, Arrays.asList(itens) );
		pagamento1.mostrarComprovante();
		pagamento1.valorTotal();
		
		
		System.out.println("\nSEGUNDA COMPRA  \n");
		
		itens = new Item[6];
		arrayItens = carrinho2.getArrayCarrinho();
		for(int i = 0; i< carrinho2.getQuantidadeItens();i++) {
			itens[i] = new Item(arrayItens[i][0], Double.parseDouble(arrayItens[i][1]));
		}
		
		Pagamento pagamento2 = new Dinheiro(carrinho2.getValorTotalCarrinho(),"Maria Jose", Arrays.asList(itens));
		pagamento2.mostrarComprovante();
	}
}

