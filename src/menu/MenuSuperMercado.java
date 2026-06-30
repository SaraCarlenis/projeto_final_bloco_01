package menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuSuperMercado {
	
	private static final Scanner leia = new Scanner(System.in);

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
				keyPress();
				break;
				
			case 2:
				System.out.println("Listar Produto pelo ID\n\n");
				keyPress();
				break;
				
			case 3:
				System.out.println("Cadastrar Produto\n\n");
				keyPress();
				break;
				
			case 4:
				System.out.println("Atualizar Produto\n\n");
				keyPress();
				break;
				
			case 5:
				System.out.println("Deletar Produto\n\n");
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

}
