

import java.util.Arrays;
import java.util.Scanner;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Factory.*;
import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Shorts.Short;

import LojaDeRoupas_2.Builder.BuilderCarrinho;
import LojaDeRoupas_2.Modelo.Carrinho;

import LojaDeRoupas_3.Composite.*;
import LojaDeRoupas_4.Facade.LojaFacade;

public class Cliente {
	public static void main(String [] args) {
		//Factorys
		
		/*
		
		Pedido pedidoVestido1 = new Pedido("Rosa", "M", "Feminino");
		
		//objetos
		Camisa camisa1 = facCamisa.pedidoCamisa("Mangalonga", pedidoCamisa1);
		Camisa camisa2 = facCamisa.pedidoCamisa("Regata", pedidoCamisa1);
		
		
		*/
		
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
		/*
		Carrinho carrinho1 = new BuilderCarrinho("Calendario de Natal")
				.addCamisa(camisa1)
				.addCalca(calca1)
				.fimPedido();
		
		Carrinho carrinho2  = new BuilderCarrinho("brinde")
				.addTenis(tenis1)
				.fimPedido();
				
				*/
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
		/*
		
		System.out.println("\nSEGUNDA COMPRA  \n");
		
		itens = new Item[6];
		arrayItens = carrinho2.getArrayCarrinho();
		for(int i = 0; i< carrinho2.getQuantidadeItens();i++) {
			itens[i] = new Item(arrayItens[i][0], Double.parseDouble(arrayItens[i][1]));
		}
		
		Pagamento pagamento2 = new Dinheiro(carrinho2.getValorTotalCarrinho(),"Maria Jose", Arrays.asList(itens));
		pagamento2.mostrarComprovante();
		*/
		
		//MILESTONE 4
		Scanner scan = new Scanner(System.in);
		 
		boolean start = true;
		int pedidoTipo, pedidoSubTipo;
		int op;
		do {
			LojaFacade.MenuPrincipal();
			LojaFacade.setFabricasRoupas();
			op = scan.nextInt();
			
			switch(op) {
			case 1:
				LojaFacade.MenuCadastrarRoupa();
				do {
				pedidoTipo = scan.nextInt();
				}while(pedidoTipo > 5 || pedidoTipo < 0);
				if(pedidoTipo== 0)break;
				
				LojaFacade.MenuTiposRoupas(pedidoTipo);
				pedidoSubTipo = scan.nextInt();
				LojaFacade.cadastrarPedido(pedidoTipo, pedidoSubTipo);
				break;
			case 2:
				break;
			case 3:
				LojaFacade.realizarPedido();
				break;
			case 0:
				start = false;
				break;
			default :
				System.out.println("VALOR INVALIDO...");
				break;
			}
			
		}while(start);
		System.out.println("PROGRAMA FINALIZADO ...");
		
	}
}

