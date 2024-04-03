// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : PROJETOS JAVA
// Ano/S: 2024/1S
// ------------------------------------

// VERSÃO 3
// - dois arquivos
// - ações realizadas por métodos separados do 'main'
// --------------------------------------------------

// importação de classe para leitura de dados do teclado
import java.util.Scanner;

// classe que contém o PROGRAMA PRINCIPAL ('main')
public class Lab_02_ProjetosJava_APOS_AULA_METODO_V3 {

	// ATRIBUTOS
	// ---------

	// CONSTRUTOR
	// ----------

	// MÉTODOS
	// -------

	// case 1 : exibe pares
	private void exibePares(Scanner teclado) {
		// declaração de variáveis para esta Ação
		int n1, n2;
		// obtenção dos valores via teclado
		System.out.print("Informe o menor valor (n1): ");
		n1 = teclado.nextInt();
		System.out.print("Informe o maior valor (n2): ");
		n2 = teclado.nextInt();
		// correção AUTOMÁTICA e ARBITRÁRIA do maior e menor valor
		if (n1 > n2) {
			int temp = n1; // 'triângulo de troca'
			n1 = n2;
			n2 = temp;
		}
		// exibição dos números pares do intervalo
		// AQUI...
		System.out.println("Os valores pares entre " + n1 + " e " + n2 + " (inclusive) são:");
		for (int n = n1; n <= n2; n++) {
			if (n % 2 == 0) {
				System.out.print(n + " ");
			}
		}
		// 'return' desnecessário porque o método é 'void'
	}

	// case 2 : exibe caracteres
	private void exibeCaracteres() {
		// exibição dos caracteres
		System.out.print("Os dez primeiros caracteres (em maiúsculas) do alfabeto são:");
		// AQUI...
		for (char c = 65; c < 75; c++) {
			System.out.print(" " + c);
		}
		// 'return' desnecessário porque o método é 'void'
	}

	// case 3 : exibe múltiplos
	private void exibeMultiplos(Scanner teclado) {
		// declaração de variável para esta Ação
		int valor_inicial;
		// obtenção dos valor via teclado
		System.out.print("Informe o valor de início da série: ");
		valor_inicial = teclado.nextInt();
		// exibição dos múltiplos
		System.out.println("Os múltiplos de 3 entre " + valor_inicial + " e 99 são:");
		// ajusta o valor inicial para um múltiplo de 3
		// AQUI...
		while ((valor_inicial % 3) != 0) {
			valor_inicial++;
		}
		// repetição para exibição dos múltiplos desejados
		// AQUI...
		for (int n = valor_inicial; n < 100; n += 3) {
			System.out.print(n + " ");
		}
		// 'return' desnecessário porque o método é 'void'
	}

	// case 4 : exibe segundos equivalentes
	private void exibeSegundosEquivalentes(Scanner teclado) {
		// declaração de variáveis para esta Ação
		int horas, minutos, segundos;
		// obtenção dos valores via teclado
		System.out.print("Informe a quantidade de horas    (entre 0 e 23): ");
		horas = teclado.nextInt();
		System.out.print("Informe a quantidade de minutos  (entre 0 e 59): ");
		minutos = teclado.nextInt();
		System.out.print("Informe a quantidade de segundos (entre 0 e 59): ");
		segundos = teclado.nextInt();
		// correção AUTOMÁTICA e ARBITRÁRIA dos valores informados
		horas = horas % 24;
		minutos = minutos % 60;
		segundos = segundos % 60;
		// cálculo e exibição do resultado
		System.out.print("Quantidade equivalente em segundos: ");
		// AQUI...
		int segundosEquivalentes = horas * 60 * 60 + minutos * 60 + segundos;
		System.out.print(segundosEquivalentes);
		// 'return' desnecessário porque o método é 'void'
	}

	// case 5 : exibe horas e minutos
	private void exibeHorasMinutos(Scanner teclado) {
		// declaração de variável para esta Ação
		int qtdMinutos;
		int qtdHoras;
		// obtenção do valor via teclado
		System.out.print("Informe a quantidade total de minutos (entre 0 e 1439): ");
		qtdMinutos = teclado.nextInt();
		// transformação e exibição do resultado
		// AQUI...
		qtdHoras = qtdMinutos / 60; // divisão inteira (DIV)
		qtdMinutos = qtdMinutos % 60; // resto inteiro da divisão (MOD)
		System.out.println("Valor informado equivale a " + qtdHoras + " horas e " + qtdMinutos + " minutos.");
		// 'return' desnecessário porque o método é 'void'
	}

	// método que coordena a execução das Ações do programa
	public void executaTudo() {

		// criação de um objeto 'Scanner' para a interação com o teclado
		Scanner teclado = new Scanner(System.in);

		// declaração de variáveis a serem usadas (independentemente da Ação)
		int escolha;

		// menu de escolha da Ação a ser executada
		do {
			// apresentação das opções de escolha
			System.out.println("\n\n");
			System.out.println("Escolha uma das opções abaixo:");
			System.out.println("1 - Ação 1 -> números pares");
			System.out.println("2 - Ação 2 -> dez caracteres do alfabeto");
			System.out.println("3 - Ação 3 -> múltiplos de 3");
			System.out.println("4 - Ação 4 -> horas, minutos e segundos para segundos");
			System.out.println("5 - Ação 5 -> minutos para horas e minutos");
			System.out.println("9 - Sair");

			System.out.print("\nDigite aqui a sua opção: ");
			// coleta da opção digitada
			escolha = teclado.nextInt();

			// avaliação da opção e acionamento da respectiva Ação
			switch (escolha) {

				case 1:
					System.out.println("Ação 1 -> números pares !\n");
					// acionamento do método que realiza a Ação 1
					exibePares(teclado);
					break;

				case 2:
					System.out.println("Ação 2: -> dez caracteres do alfabeto !\n");
					// acionamento do método que realiza a Ação 2
					exibeCaracteres();
					break;

				case 3:
					System.out.println("Ação 3: -> múltiplos de 3 !\n");
					// acionamento do método que realiza a Ação 3
					exibeMultiplos(teclado);
					break;

				case 4:
					System.out.println("Ação 4 -> horas, minutos e segundos para segundos !\n");
					// acionamento do método que realiza a Ação 4
					exibeSegundosEquivalentes(teclado);
					break;

				case 5:
					System.out.println("Ação 5 -> minutos para horas e minutos !\n");
					// acionamento do método que realiza a Ação 5
					exibeHorasMinutos(teclado);
					break;

				case 9:
					System.out.println("Sair ...\n");
					break;

				default:
					System.out.println("Opção inválida !  Tente novamente ...\n");
			}

		} while (escolha != 9);

		teclado.close();

		// identificação do autor do trabalho
		System.out.println();
		System.out.println("---------------------------------");
		System.out.println("ESTRUTURAS DE DADOS - 2024/1S");
		System.out.println("Lab.: FUNDAMENTOS DE JAVA");
		System.out.println("---------------------------------");
		System.out.println("Nome: GUSTAVO HENRIQUE ZINATTO DE SIQUEIRA ");
		System.out.println("R.A.: 121 092 231 1 009");
		System.out.println("---------------------------------");
		System.out.println();

		// 'return' desnecessário porque o método é 'void'
	}

	// PROGRAMA PRINCIPAL (main)
	// -------------------------

}  // fim do 'class'
