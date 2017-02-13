package br.com.jose;

import java.util.ArrayList;
import java.util.Scanner;

public class Operacao {

	static ArrayList<Produtos> prod = new ArrayList<Produtos>();

	public static void main(String[] args) {

		Menu();

	}

	public static void Menu() {

		Scanner scan = new Scanner(System.in);
		int opcao;

		System.out.println("\nSistema de Supermercado\n\n"
				+ "Escolha a Opção:\n\n\n "
				+ "1 – Cadastrar novo produto\n "
				+ "2 – Exibir todos os produtos cadastrados da loja\n "
				+ "3 - Consultar dados de um produto\n "
				+ "4 – Excluir um produto cadastrado da loja\n\n "
				+ "Digite sua Opção");
		opcao = scan.nextInt();

		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("");

		while (opcao < 1 || opcao > 4) {
			System.out.println("Opção Inválida! Digite Novamente");
			System.out.println("");
			System.out.println("********************************************************************");
			System.out.println("");
			opcao = scan.nextInt();
			System.out.println("");
		}

		if (opcao == 1) {
			Cadastro();
		} else if (opcao == 2) {
			Imprime();
		} else if (opcao == 3) {
			ConsultaProd();
		} else if (opcao == 4) {
			Excluir_Produto();
		}

		scan.close();

	}

	public static void Cadastro() {

		Produtos produto = new Produtos();

		Scanner scan = new Scanner(System.in);
		System.out.println("Cadastro de Produto");
		System.out.println("");
		System.out.println("");
		System.out.println("Código:");
		produto.setCod(scan.nextInt());
		System.out.println("Nome:");
		produto.setNome(scan.next());
		System.out.println("Peso:");
		produto.setPeso(scan.nextDouble());
		System.out.println("Valor Custo:");
		produto.setValor_Custo(scan.nextDouble());
		System.out.println("Valor Venda:");
		produto.setValor_Venda(scan.nextDouble());
		System.out.println("Quantidade:");
		produto.setQtd(scan.nextInt());
		prod.add(produto);

		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("Produto cadastrado com Sucesso!");
		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println();
		Menu();
		scan.close();

	}

	public static void Imprime() {
		while (prod.size() == 0) {
			System.out.println("");
			System.out.println("********************************************************************");
			System.out.println("Cadastre um Produto! Sistema Vazio!");
			System.out.println("");
			System.out.println("********************************************************************");
			Menu();
		}

		System.out.println("Consulta de Produtos Cadastrados");
		System.out.println();
		System.out.println("********************************************************************");
		System.out.println("");

		for (int i = 0; i < prod.size(); i++) {

			System.out.println("Id: " + prod.get(i).getCod());
			System.out.println("Nome: " + prod.get(i).getNome());
			System.out.println("Valor Custo: " + prod.get(i).getValor_Custo());
			System.out.println("Valor Venda: " + prod.get(i).getValor_Venda());
			System.out.println("Quantidade: " + prod.get(i).getQtd());
			System.out.println("");
			System.out.println("********************************************************************");
			System.out.println("");
		}
		Menu();

	}

	public static void ConsultaProd() {

		while (prod.size() == 0) {
			System.out.println("");
			System.out.println("********************************************************************");
			System.out.println("Cadastre um Produto! Sistema Vazio!");
			System.out.println("");
			System.out.println("********************************************************************");
			Menu();
		}
		System.out.println("Consulta Produto pelo ID");
		System.out.println();
		System.out.println("Digite o ID do produto desejado:");
		Scanner scan = new Scanner(System.in);
		int cod_prod = scan.nextInt();

		while (prod.size() == 0) {
			System.out.println("Cadastre um Produto! Sistema Vazio!");
			Menu();
		}

		for (int i = 0; i < prod.size(); i++) {
			if (cod_prod == prod.get(i).getCod()) {
				System.out.println("Id: " + prod.get(i).getCod());
				System.out.println("Nome: " + prod.get(i).getNome());
				System.out.println("Valor Custo: " + prod.get(i).getValor_Custo());
				System.out.println("Valor Venda: " + prod.get(i).getValor_Venda());
				System.out.println("Quantidade: " + prod.get(i).getQtd());
				System.out.println("");
				System.out.println("********************************************************************");
				System.out.println("");
			} else if (cod_prod != prod.get(i).getCod()) {

				System.out.println("");
				System.out.println("");
				System.out.println("********************************************************************");
				System.out.println("Produto não encontrado no Cadastro!");
				System.out.println("");
				System.out.println("********************************************************************");
				System.out.println("");

			}
		}
		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("");
		Menu();
		scan.close();

	}

	public static void Excluir_Produto() {

		while (prod.size() == 0) {
			System.out.println("");
			System.out.println("********************************************************************");
			System.out.println("Cadastre um Produto! Sistema Vazio!");
			System.out.println("");
			System.out.println("********************************************************************");
			Menu();
		}
		System.out.println("Excluir Produto pelo ID");
		System.out.println();
		System.out.println("Digite o ID do produto desejado:");
		Scanner scan = new Scanner(System.in);
		int cod_prod = scan.nextInt();

		for (int i = 0; i < prod.size(); i++) {
			if (cod_prod == prod.get(i).getCod()) {
				prod.remove(i);
				System.out.println("");
				System.out.println("");
				System.out.println("********************************************************************");
				System.out.println("Produto Excluído com Sucesso!");
				System.out.println("");
				System.out.println("********************************************************************");
				System.out.println("");
			} else if (cod_prod != prod.get(i).getCod()) {
				System.out.println("");
				System.out.println("");
				System.out.println("********************************************************************");
				System.out.println("Produto não encontrado no Cadastro!");
				System.out.println("");
				System.out.println("********************************************************************");
				System.out.println("");
			}

		}
		System.out.println("");
		System.out.println("********************************************************************");
		System.out.println("");
		Menu();
		scan.close();

	}

}
