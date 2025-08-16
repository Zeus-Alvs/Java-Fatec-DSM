package br.edu.fatecpg.tecprog.estruturada.matriz;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		String[][] mat = new String[3][3];
		String[][] matrev = new String[3][3];
		Scanner scan = new Scanner(System.in);
		
		for(int x=0; x<3; x++) {
			
			for(int y=0; y<3; y++) {
				System.out.println("Digite uma palavra: ");
				mat[x][y] = scan.nextLine();
			}
		}
		
		for(int x=0; x<3; x++) {
			
			for(int y=0; y<3; y++) {
				matrev[y][x] = mat[x][y];
			}
		}

		System.out.println("Não invertido: ");
		for(int x=0; x<3; x++) {
			
			for(int y=0; y<3; y++) {
				System.out.print(mat[x][y] + " | ");
			}
			System.out.println();
		}
		
		System.out.println("Invertido: ");
		for(int x=0; x<3; x++) {
			
			for(int y=0; y<3; y++) {
				System.out.print(matrev[x][y] + " | ");
			}
			System.out.println();
		}
		
		scan.close();
	}

}