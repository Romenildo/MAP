package LojaDeRoupas_4.Facade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import LojaDeRoupas_1.Pedido;
import LojaDeRoupas_1.Factory.CalcaFactory;
import LojaDeRoupas_1.Factory.CamisaFactory;
import LojaDeRoupas_1.Factory.ChapeuFactory;
import LojaDeRoupas_1.Factory.ShortFactory;
import LojaDeRoupas_1.Factory.TenisFactory;

import LojaDeRoupas_1.Modelo.Calcas.Calca;
import LojaDeRoupas_1.Modelo.Camisas.Camisa;
import LojaDeRoupas_1.Modelo.Chapeus.Chapeu;
import LojaDeRoupas_1.Modelo.Tenis.Tenis;
import LojaDeRoupas_1.Modelo.Shorts.Short;

import LojaDeRoupas_2.Builder.BuilderCarrinho;
import LojaDeRoupas_2.Modelo.Carrinho;
import LojaDeRoupas_3.Composite.Boleto;
import LojaDeRoupas_3.Composite.Cartao;
import LojaDeRoupas_3.Composite.Dinheiro;
import LojaDeRoupas_3.Composite.Item;
import LojaDeRoupas_3.Composite.Pagamento;

public class LojaFacade {
	private static CamisaFactory facCamisa;
	private static CalcaFactory facCalca ;
	private static ChapeuFactory facChapeu;
	private static ShortFactory facShort;
	private static TenisFactory facTenis ;
	
	private static ArrayList<Camisa> camisas;
	private static ArrayList<Calca> calcas;
	private static ArrayList<Chapeu> chapeus;
	private static ArrayList<Short> shorts;
	private static ArrayList<Tenis> tenis;
	
	private static ArrayList<Pagamento> pagamentos;
	
	private static int quantidadeEstoque;
 	
	
	private static Scanner scan = new Scanner(System.in);
	
	//MENUS
	public static void MenuPrincipal() {
		System.out.println("---BEM VINDO A LOJA DE ROUPAS---");
		System.out.println("1 - Cadastrar Roupa");
		System.out.println("2 - Verificar Estoque");
		System.out.println("3 - Realizar Compra(CONSTRUCAO)");
		System.out.println("4 - Mostrar Vendas");
		System.out.println("0 - Fechar Programa");
	}
	public static void MenuCadastrarRoupa() {
		System.out.println("--- CADASTRAR ROUPA ---");
		System.out.println("1 - Camisa");
		System.out.println("2 - Calca");
		System.out.println("3 - Chapeu");
		System.out.println("4 - Short");
		System.out.println("5 - Tenis");
		System.out.println("0 - Voltar");
	}
	
	public static void MenuTiposRoupas(int tipo) {
		switch(tipo) {
		case 1:
			System.out.println("--- TIPOS CAMISAS ---");
			System.out.println("1 - MangaCurta");
			System.out.println("2 - MangaLonga");
			System.out.println("3 - Polo");
			System.out.println("4 - Regata");
			break;
		case 2:
			System.out.println("--- TIPOS CALCAS ---");
			System.out.println("1 - Jeans");
			System.out.println("2 - Moleton");
			System.out.println("3 - Skinny");
			System.out.println("4 - Social");
			break;
		case 3:
			System.out.println("--- TIPOS CHAPEUS ---");
			System.out.println("1 - Boina");
			System.out.println("2 - Bone");
			System.out.println("3 - Cartola");
			System.out.println("4 - Fedora");
			break;
		case 4:
			System.out.println("--- TIPOS SHORTS ---");
			System.out.println("1 - Bermuda");
			System.out.println("2 - Elastico");
			System.out.println("3 - Praia");
			break;
		case 5:
			System.out.println("--- TIPOS TENIS ---");
			System.out.println("1 - Cano Alto");
			System.out.println("2 - Esportivo");
			System.out.println("3 - Sapa Tenis");
			break;
		}
	}
	
	//FUNCOES
	
	public static void setFabricasRoupas() {
		facCamisa = new CamisaFactory();
		facCalca = new CalcaFactory();
		facChapeu = new ChapeuFactory();
		facShort = new ShortFactory();
		facTenis = new TenisFactory();
	}
	
	public static void cadastrarPedido(int tipo, int tipoSub) {
		String cor, tamanho, sexo;
		
		System.out.println("Cor:");
		cor = scan.nextLine();
		System.out.println("Tamanho:");
		tamanho = scan.nextLine();
		System.out.println("Sexo:");
		sexo = scan.nextLine();
		
		switch(tipo) {
			case 1:
				Pedido pedidoCamisa = new Pedido(cor, tamanho, sexo);
				Camisa camisa = facCamisa.pedidoCamisa( retornarNomeRoupa(tipo, tipoSub), pedidoCamisa);
				camisas.add(camisa);
				break;
			case 2:
				Pedido pedidoCalca = new Pedido(cor, tamanho, sexo);
				Calca calca = facCalca.pedidoCalca(retornarNomeRoupa(tipo, tipoSub), pedidoCalca);
				calcas.add(calca);
				break;
			case 3:
				Pedido pedidoChapeu = new Pedido(cor, tamanho, sexo);
				Chapeu chapeu = facChapeu.pedidoChapeu(retornarNomeRoupa(tipo, tipoSub), pedidoChapeu);
				chapeus.add(chapeu);
				break;
			case 4:
				Pedido pedidoShort =new Pedido(cor, tamanho, sexo);
				Short shorte = facShort.pedidoShort(retornarNomeRoupa(tipo, tipoSub), pedidoShort);
				shorts.add(shorte);
				break;
			case 5:
				Pedido pedidoTenis = new Pedido(cor, tamanho, sexo);
				Tenis tenisUnidade = facTenis.pedidoTenis(retornarNomeRoupa(tipo, tipoSub), pedidoTenis);
				tenis.add(tenisUnidade);
				break;
		}
		quantidadeEstoque++;
		System.out.println("PEDIDO CADASTRADO COM SUCESSO");

	}
	
	
	public static void verificarEstoque() {
		System.out.println("--- ESTOQUE LOJA ---");
		
			for(Camisa camisa : camisas) {
				System.out.println(camisa.getInfo());
			}
			for(Calca calca : calcas) {
				System.out.println(calca.getInfo());
			}
			for(Chapeu chapeu : chapeus) {
				System.out.println(chapeu.getInfo());
			}
			for(Short shorte : shorts) {
				System.out.println(shorte.getInfo());
			}
			for(Tenis tenisUni : tenis) {
				System.out.println(tenisUni.getInfo());
			}
			
			if(quantidadeEstoque <= 0) {
				quantidadeEstoque = 0;
				System.out.println("ESTOQUE VAZIO");
			}else {
				System.out.println("Quantidade total no estoque: " + quantidadeEstoque);
			}
		
		pause();
		
	}
	
	public static void realizarPedido() {
		System.out.println("Digite Nome do cliente:");
		String nomeCliente = scan.nextLine();
		mostrarProdutos();
		
		// IMPLEMENTACAO DOS PROXIMOS MILESTONES
		//escolhe os itens
		//adiciona itens ao carrinho
		Carrinho carrinho = new BuilderCarrinho("Calendario de Natal").fimPedido();
		
		mostrarMenuPagamentos(carrinho, nomeCliente);
	}
	
	public static void mostrarProdutos() {
		System.out.println("--- PRODUTOS DISPONIVEIS ---");
		
	}
	
	public static void mostrarMenuPagamentos(Carrinho carrinho, String nomeCliente) {
		System.out.println("--- METODOS DE PAGAMENTOS---");
		System.out.println("1 - Cartao");
		System.out.println("2 - Dinheiro");
		System.out.println("3 - Boleto");
		
		String tipoPagamento = scan.nextLine();
		realizarPagamento(carrinho, Integer.parseInt(tipoPagamento), nomeCliente);
	}
	
	public static void realizarPagamento(Carrinho carrinho1, int tipoPagamento, String nomeCliente) {
		Pagamento [] itens = new Item[6];
		Pagamento pagamento;
		String[][] arrayItens = carrinho1.getArrayCarrinho();
		
		
		for(int i = 0; i< carrinho1.getQuantidadeItens();i++) {
			itens[i] = new Item(arrayItens[i][0], Double.parseDouble(arrayItens[i][1]));
		}
		
		if(tipoPagamento == 1) {
			
			System.out.println("Digite numero: Cartao");
			String numCartao = scan.nextLine();
			
			System.out.println("--- TIPO DO CARTAO ---");
			System.out.println("1 - Debito");
			System.out.println("2 - Credito");
			String tipoCartao = scan.nextLine();
			
			System.out.println("Senha: ");
			String senha = scan.nextLine();
			
			pagamento = new Cartao(carrinho1.getValorTotalCarrinho(),nomeCliente, numCartao, Integer.parseInt(tipoCartao), Arrays.asList(itens) );
		}else if(tipoPagamento== 2) {
			pagamento = new Dinheiro(carrinho1.getValorTotalCarrinho(),nomeCliente, Arrays.asList(itens) );

		}else {
			pagamento = new Boleto(carrinho1.getValorTotalCarrinho(),nomeCliente, Arrays.asList(itens) );

		}
		pagamentos.add(pagamento);
		pagamento.valorTotal();
		pause();
		
	}
	
	public static void mostrarVendas() {
		System.out.println("--- LISTA DE VENDAS ---");
		if(pagamentos!=null) {
			for(Pagamento pag : pagamentos) {
				pag.mostrarComprovante();
			}
		}else {
			System.out.println("Nenhum pagamento Realizado");
		}
		pause();
		
	}

	//FUNCIONALIDADES
	
	public static void pause() {
		System.out.println("Pressione Enter para continuar:");
		String pause = scan.nextLine();
	}
	
	public static void instanciarDeposito() {
		camisas = new ArrayList<Camisa>();
		calcas = new ArrayList<Calca>();
		chapeus = new ArrayList<Chapeu>();
		shorts = new ArrayList<Short>();
		tenis = new ArrayList<Tenis>();
		pagamentos = new ArrayList<Pagamento>();
		quantidadeEstoque = 0;
	}
	
	
	public static String retornarNomeRoupa(int tipo, int subTipo) {
		
		switch(tipo) {
		case 1:
			if(subTipo==1)return "MangaCurta";
			if(subTipo==2)return "Mangalonga";
			if(subTipo==3)return "Polo";
			if(subTipo==4)return "Regata";
			break;
		case 2:
			if(subTipo==1)return "Jeans";
			if(subTipo==2)return "Moleton";
			if(subTipo==3)return "Skinny";
			if(subTipo==4)return "Social";
			break;
		case 3:
			if(subTipo==1)return "Boina";
			if(subTipo==2)return "Bone";
			if(subTipo==3)return "Cartola";
			if(subTipo==4)return "Fedora";
			break;
		case 4:
			if(subTipo==1)return "Bermuda";
			if(subTipo==2)return "Elastico";
			if(subTipo==3)return "Praia";
			break;
		case 5:
			if(subTipo==1)return "CanoAlto";
			if(subTipo==2)return "Esportivo";
			if(subTipo==3)return "SapaTenis";
			break;
		}
		return "";
	}

}
