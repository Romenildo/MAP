package LojaDeRoupas_4.Facade;

import java.util.Arrays;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Factory.CalcaFactory;
import LojaDeRoupas_1.Factory.CamisaFactory;
import LojaDeRoupas_1.Factory.ChapeuFactory;
import LojaDeRoupas_1.Factory.ShortFactory;
import LojaDeRoupas_1.Factory.TenisFactory;
import LojaDeRoupas_1.Factory.VestidoFactory;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_2.Builder.BuilderCarrinho;
import LojaDeRoupas_2.Modelo.Carrinho;
import LojaDeRoupas_3.Composite.Cartao;
import LojaDeRoupas_3.Composite.Item;
import LojaDeRoupas_3.Composite.Pagamento;

public class LojaFacade {
	private static CamisaFactory facCamisa;
	private static CalcaFactory facCalca ;
	private static ChapeuFactory facChapeu;
	private static ShortFactory facShort;
	private static TenisFactory facTenis ;
	private static VestidoFactory facVestido ;
	
	public static void MenuFabrica() {
		
	}
	
	public static void MenuPrincipal() {
		System.out.println("---BEM VINDO A LOJA DE ROUPAS---");
		System.out.println("1 - Cadastrar Roupa");
		System.out.println("2 - Verificar Estoque ");
		System.out.println("3 - Realizar Compra");
		System.out.println("4 - Mostrar Historico");
		System.out.println("0 - Fechar Programa");
	}
	
	public static void setFabricasRoupas() {
		facCamisa = new CamisaFactory();
		facCalca = new CalcaFactory();
		facChapeu = new ChapeuFactory();
		facShort = new ShortFactory();
		facTenis = new TenisFactory();
		facVestido = new VestidoFactory();
	}
	public static void cadastrarRoupa() {
		Pedido pedidoCamisa1 = new Pedido("vermelha", "M", "Masculino");
		Camisa camisa1 = facCamisa.pedidoCamisa("Mangalonga", pedidoCamisa1);

	}
	
	
	public static void realizarPedido() {
		Carrinho carrinho1 = new BuilderCarrinho("Calendario de Natal")
				
				.fimPedido();
	}
	
	public static void realizarCompra(Carrinho carrinho1) {
		Pagamento [] itens = new Item[6];
		String[][] arrayItens = carrinho1.getArrayCarrinho();
		
		
		for(int i = 0; i< carrinho1.getQuantidadeItens();i++) {
			itens[i] = new Item(arrayItens[i][0], Double.parseDouble(arrayItens[i][1]));
		}
		
		Pagamento pagamento1 = new Cartao(carrinho1.getValorTotalCarrinho(),"Joaquim", "1829 9182 1928 2020", 1, Arrays.asList(itens) );
		pagamento1.mostrarComprovante();
		pagamento1.valorTotal();
		
	}
	
	public static void MenuPagamento() {
		//imprimir comprovante
	}
	public LojaFacade() {
		// TODO Auto-generated constructor stub
	}

}
