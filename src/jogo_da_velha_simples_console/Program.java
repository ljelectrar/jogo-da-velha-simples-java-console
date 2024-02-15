package jogo_da_velha_simples_console;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		char[][] matrix = new char[3][3];

		int lin;
		int col;

		int j = 0;

		final int TRUE = 1;
		final char o = 'O';
		final char x = 'X';

		System.out.println("Digite coodernadas na forma lin col: ");

		for (lin = 0; lin < 3; lin++) {
			for (col = 0; col < 3; col++) {
				System.out.print(matrix[lin][col] = '.');
			}
			System.out.println();
		}

		while (true) {
			for (lin = 0; lin < 3; lin++) {
				for (col = 0; col < 3; col++) {
					System.out.print(matrix[lin][col]);
				}
				System.out.println();
			}

			if ((matrix[0][0] == o && matrix[0][1] == o && matrix[0][2] == o)
					|| (matrix[1][0] == o && matrix[1][1] == o && matrix[1][2] == o)
					|| (matrix[2][0] == o && matrix[2][1] == o && matrix[2][2] == o)
					|| (matrix[0][0] == o && matrix[1][0] == o && matrix[2][0] == o)
					|| (matrix[0][1] == o && matrix[1][1] == o && matrix[2][1] == o)
					|| (matrix[1][2] == o && matrix[1][2] == o && matrix[2][2] == o)
					|| (matrix[0][0] == o && matrix[1][1] == o && matrix[2][2] == o)
					|| (matrix[0][2] == o && matrix[1][1] == o && matrix[2][0] == o)) {

				System.out.println("Você ganhou, Jogador 'O' Bolinha");
				break;
			}

			if ((matrix[0][0] == o && matrix[0][1] == x && matrix[0][2] == x)
					|| (matrix[1][0] == x && matrix[1][1] == x && matrix[1][2] == x)
					|| (matrix[2][0] == x && matrix[2][1] == x && matrix[2][2] == x)
					|| (matrix[0][0] == x && matrix[1][0] == x && matrix[2][0] == x)
					|| (matrix[0][1] == x && matrix[1][1] == x && matrix[2][1] == x)
					|| (matrix[1][2] == x && matrix[1][2] == x && matrix[2][2] == x)
					|| (matrix[0][0] == x && matrix[1][1] == x && matrix[2][2] == x)
					|| (matrix[0][2] == x && matrix[1][1] == x && matrix[2][0] == x)) {

				System.out.println("Você ganhou, Jogador 'X' Xizinho");
				break;
			}

			if (j == 9) {
				System.out.println("Empate!");
				break;
			}

			System.out.println(" Digite a Coordenadas: x [linha]");
			lin = sc.nextInt();
			sc.nextLine();
			System.out.println(" Digite a Coordenadas: y [col]");
			col = sc.nextInt();
			sc.nextLine();

			if (matrix[lin][col] == '.') {
				if (j % 2 == 0)
					matrix[lin][col] = x;
				else
					matrix[lin][col] = 0;
				j++;
			}

			// Add a flush
			System.out.print("\033[H\033[2J");
			System.out.flush(); // limpa a tela
		}

	}

}
