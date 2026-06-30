package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

import controller.ProdutoController;
import model.Produto;

public class MenuSuperMercado {
	
	private static final Scanner leia = new Scanner(System.in);
	private static ProdutoController produtoController = new ProdutoController();

	public static void main(String[] args) {

		
int opcao = -1;

		while (opcao != 0) {

			System.out.println("*****************************************************");
			System.out.println("              SuperMercado MasterGama                ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("       1 - Listar todos os Produtos                  ");
			System.out.println("       2 - Listar Produto pelo ID                    ");
			System.out.println("       3 - Cadastrar Produto                         ");
			System.out.println("       4 - Atualizar Produto                         ");
			System.out.println("       5 - Deletar Produto                           ");
			System.out.println("       0 - Sair                                      ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			
			try {
				opcao = leia.nextInt();
				leia.nextLine();
			} catch(InputMismatchException e) {
				opcao = -1;
				System.out.println("Digite um número entre 0 e 5");
				leia.nextLine();
			}

			if (opcao == 0) {
				System.out.println("\nObrigada por sua visita. Volte Sempre!\n");
				sobre();
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			
			case 1:
				System.out.println("Listar todos os Produtos\n\n");
				visualizar();
				keyPress();
				break;
				
			case 2:
				System.out.println("Listar Produto pelo ID\n\n");
				listaProdutoId();
				keyPress();
				break;
				
			case 3:
				System.out.println("Cadastrar Produto\n\n");
				cadastrarProduto();
				keyPress();
				break;
				
			case 4:
				System.out.println("Atualizar Produto\n\n");
				atualizarProduto();
				keyPress();
				break;
				
			case 5:
				System.out.println("Deletar Produto\n\n");
				deletarProduto();
				keyPress();
				break;
			default:
				System.out.println("\nOpção Inválida!\n");
				keyPress();
				break;
			}
		}

	}
	
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Sara Hurtado - sarac@genstudents.org");
		System.out.println("https://github.com/SaraCarlenis");
		System.out.println("*********************************************************");
	}

	public static void keyPress() {
		System.out.println("\n\nPressione Enter para continuar...");
		leia.nextLine();
	}
	

	private static void visualizar() {
		produtoController.listarTodas();
	}
	
	private static void listaProdutoId() {
		System.out.print("Digite o Id do produto: ");
	    int id = leia.nextInt();
	    leia.nextLine();

	    produtoController.procurarPorId(id);
	}
	
	private static void cadastrarProduto() {
		System.out.println("Escolha a categoria:");
	    System.out.println("1 - Limpeza");
	    System.out.println("2 - Alimento");
	    int categoria = leia.nextInt();
	    leia.nextLine();

	    System.out.print("Digite o nome do produto: ");
	    String nome = leia.nextLine();

	    System.out.print("Digite o preço do produto: ");
	    double preco = leia.nextDouble();
	    leia.nextLine();
	    

	    System.out.print("Digite a quantidade em estoque: ");
	    int quantidadeEstoque = leia.nextInt();
	    leia.nextLine();
	    
	    Produto produto = new Produto(produtoController.gerarId(), nome, preco, categoria, quantidadeEstoque);
	    
	    produtoController.cadastrar(produto);
	}
	
	private static void deletarProduto() {
		System.out.print("Digite o Id do produto: ");
		int id = leia.nextInt();
		leia.nextLine();

		Produto produto = produtoController.procurarPorId(id);

		if (produto != null) {

			System.out.print("\nTem certeza que deseja excluir o produto? (S/N): ");
			String confirmacao = leia.nextLine();

			if (confirmacao.equalsIgnoreCase("S")) {
				produtoController.deletar(id);
			} else {
				System.out.println("\nOperação cancelada!");
			}

		} else {
			System.out.printf("\nO produto Id %d não foi encontrado!", id);
		}
	}
	
	private static void atualizarProduto() {
	    System.out.print("Digite o Id do produto que deseja atualizar: ");
	    int id = leia.nextInt();
	    leia.nextLine();

	    Produto produtoExistente = produtoController.procurarPorId(id);

	    if (produtoExistente != null) {
	        System.out.print("Digite o novo nome do produto: ");
	        String novoProduto = leia.nextLine();

	        Produto produtoAtualizado = produtoController.procurarPorId(id);
	        produtoController.atualizar(produtoAtualizado);
	    } else {
	        System.out.printf("\nO produto Id %d não foi encontrado!\n", id);
	    }
	}

}
