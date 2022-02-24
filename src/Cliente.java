

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
	
	private static Scanner scan = new Scanner(System.in);
	 
	public static void main(String [] args) {

		//MILESTONE 4
		boolean start = true;
		int pedidoTipo, pedidoSubTipo, op;
		
		LojaFacade.instanciarDeposito();
		LojaFacade.setFabricasRoupas();
		
		do {
			LojaFacade.MenuPrincipal();
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
				LojaFacade.verificarEstoque();
				break;
			case 3:
				LojaFacade.realizarPedido();
				break;
			case 4:
				LojaFacade.mostrarVendas();
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

