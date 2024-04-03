/*Faça um programa que receba os produtos lançados em uma comanda de acordo com o menu: 
 * 1 - Almoço Self-Service - R$25
 * 2 - Prato Feito - R$20
 * 3 - Bebida Lata - R$8
 * 4 - Água - R$3
 * 5 - Doces - R$2,50
 * O usuário deverá digitar o código e a quantidade lançada, o programa deve mostrar 
 * o valor unitário e total em cada lançmento. Ao digitar 20, o programa  termina mostrando
 * toda comanda, valor unitário e total do item e o total da comanda
 * No final, o sistema deverá mostrar a lista de compra do maior para o menor e o maior/menor gasto
*/

import java.util.Scanner;

public class backup {

    public static void main(String[] args) throws Exception {

        Scanner teclado = new Scanner(System.in);
        final double produto1 = 25.00, produto2 = 20.00, produto3 = 8.00, produto4 = 3.00, produto5 = 2.50;

        // declaração das constantes
        double contaFinal = 0, maiorGasto = 0, menorGasto = Double.MAX_VALUE;
        int qnt1 = 0, qnt2 = 0, qnt3 = 0, qnt4 = 0, qnt5 = 0, quantProduto = 0, pedido = 0;
        double total1 = 0, total2 = 0, total3 = 0, total4 = 0, total5 = 0;
        int x = 0, y = 0; // Declaração da variaveis para Array Vendas
        String lista = new String();

        String produtos[] = new String[6]; // Atribuição do Array para o MENU
        produtos[0] = "Almoço Self-Service R$25,00 --> Digite 1";
        produtos[1] = "Prato Feito R$20,00 --> Digite 2";
        produtos[2] = "Bebida Lata R$8,00 --> Digite 3";
        produtos[3] = "Água R$3,00 --> Digite 4";
        produtos[4] = "Doces R$2,50 --> Digite 5";
        produtos[5] = "Conta Final --> Digite 20";

        String vendas[] = new String[5];
        vendas[0] = "Almoço Self-Service";
        vendas[1] = "Prato Feito";
        vendas[2] = "Bebida Lata";
        vendas[3] = "Água";
        vendas[4] = "Doces";

        do {
            System.out.println("\n--- MENU --- ");
            for (int i = 0; i < 5; i++) {
                System.out.println(produtos[i]);
            }

            System.out.print("\nOlá! Digite a opção que você deseja do Menu: ");
            pedido = teclado.nextInt();

            switch (pedido) {
                case 1:
                    System.out.print("Digite a quantidade que deseja: ");
                    quantProduto = teclado.nextInt();
                    contaFinal += quantProduto * produto1;
                    qnt1 = quantProduto;
                    total1 = quantProduto * produto1;
                    if (total1 >= maiorGasto) {
                        maiorGasto = total1;
                        x = 0;
                    } else if (total1 <= menorGasto) {
                        menorGasto = total1;
                        y = 0;
                    }

                    System.out.println("\nAlmoço Self-Service R$25.00 " + qnt1 + "x = R$" + total1);
                    lista += "\n" + vendas[0] + " ---> " + qnt1 + "x" + " ---> R$" + total1;

                    break;

                case 2:
                    System.out.print("Digite a quantidade que deseja: ");
                    quantProduto = teclado.nextInt();
                    contaFinal += quantProduto * produto2;
                    qnt2 = quantProduto;
                    total2 = quantProduto * produto2;
                    if (total2 >= maiorGasto) {
                        maiorGasto = total2;
                        x = 1;
                    } else if (total2 <= menorGasto) {
                        menorGasto = total2;
                        y = 1;
                    }

                    System.out.println("Prato Feito R$20.00 - " + qnt2 + "x = R$");
                    lista += "\n" + vendas[1] + " ---> " + qnt2 + "x" + " ---> R$" + total2;

                    break;

                case 3:
                    System.out.print("Digite a quantidade que deseja: ");
                    quantProduto = teclado.nextInt();
                    contaFinal += quantProduto * produto3;
                    qnt3 = quantProduto;
                    total3 = quantProduto * produto3;
                    if (total3 >= maiorGasto) {
                        maiorGasto = total3;
                        x = 2;
                    } else if (total3 <= menorGasto) {
                        menorGasto = total3;
                        y = 2;
                    }

                    System.out.println("Bebida Lata R$8.00 - " + qnt3 + "x = R$");
                    lista += "\n" + vendas[2] + " ---> " + qnt3 + "x" + " ---> R$" + total3;
                    break;

                case 4:
                    System.out.print("Digite a quantidade que deseja: ");
                    quantProduto = teclado.nextInt();
                    contaFinal += quantProduto * produto4;
                    qnt4 = quantProduto;
                    total4 = quantProduto * produto4;
                    if (total4 >= maiorGasto) {
                        maiorGasto = total4;
                        x = 3;
                    } else if (total4 < menorGasto) {
                        menorGasto = total4;
                        y = 3;
                    }
                    lista += "\n" + vendas[3] + " ---> " + qnt4 + "x" + " ---> R$" + total4;
                    System.out.println("Água R$3.00 - " + qnt4 + "x = R$");
                    break;

                case 5:
                    System.out.print("Digite a quantidade que deseja: ");
                    quantProduto = teclado.nextInt();
                    contaFinal += quantProduto * produto5;
                    qnt5 = quantProduto;
                    total5 = quantProduto * produto5;
                    if (total5 >= maiorGasto) {
                        maiorGasto = total5;
                        x = 4;
                    } else if (total5 < menorGasto) {
                        menorGasto = total5;
                        y = 4;
                    }
                    lista += "\n" + vendas[4] + " ---> " + qnt5 + "x" + " ---> R$" + total5;
                    System.out.println("Doces R$2.00 - " + qnt5 + "x = R$");
                    break;

                default:
                    System.out.println("Você digitou uma opção inválida... [Digite 6 - Sim | 20 - Não]");
                    pedido = teclado.nextInt();
                    break;
            }

            System.out.println("\n Produtos adicionados! Deseja mais algum? [Digite 6 - Sim | 20 - Não]");
            pedido = teclado.nextInt();

        } while (pedido != 20);

        System.out.println("\n--- CONTA FINAL --- ");
        System.out.println("\n Almoço Self-Service R$25.00 " + qnt1 + "x = R$" + total1);
        System.out.println(" Prato Feito 2 R$20.00 " + qnt2 + "x = R$" + total2);
        System.out.println(" Bebida Lata 3 R$8.00 " + qnt3 + "x = R$" + total3);
        System.out.println(" Água 4 R$3.00 " + qnt4 + "x = R$" + total4);
        System.out.println(" Doce 5 R$2.00 " + qnt5 + "x = R$" + total5);
        System.out.println("\n Conta Final: R$" + contaFinal);

        System.out.println("\n--- MAIORES E PIORES GASTOS --- ");
        System.out.println("\n Maior Gasto: " + vendas[x] + ", total gasto: R$" + maiorGasto);
        System.out.println("\n Menor Gasto: " + vendas[y] + ", total gasto: R$" + menorGasto);

        System.out.println("\n--- LISTA DE COMPRAS ---");
        System.out.println(lista);

        System.out.println("\n Obrigado pela preferência, volte sempre!");
        System.out.println(" ");

        teclado.close();
    }
}
