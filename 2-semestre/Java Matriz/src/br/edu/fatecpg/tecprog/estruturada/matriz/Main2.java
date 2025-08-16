package br.edu.fatecpg.tecprog.estruturada.matriz;
import java.util.Scanner;

public class Main2
{
	public static void main(String[] args) {
		String[][] mat = {
			{"email1@em.com", "senha123"},
			{"email2@em.com", "senha456"},
			{"email3@em.com", "senha678"},
			{"email4@em.com", "senha789"},
			{"email5@em.com", "senha435"},
			{"teste", "senha854"}
		};
		Scanner scan = new Scanner(System.in);
		String email, senha;
		int i = 0;
		
		while( i < 1) {
			System.out.println("Entre com o Email: ");
			email = scan.nextLine();
			System.out.println("Entre com a senha: ");
			senha = scan.nextLine();
			
			for(int i2 = 0; i2 < 6; i2++) {
				if(email.equals(mat[i2][0])) {
						if (senha.equals(mat[i2][1])) {
							i = 10;
							break;
						}
						else{
						    break;
						}
				}
			}
			if(i == 10) {
				System.out.println("Entrou!");
			}
			else {
				System.out.println("email ou senha errado");
			}
		}
		
		scan.close();
	}
}