package br.edu.fatecpg.tecprog.estruturada.logica;
import java.util.Scanner;

public class Main10
{
	public static void main(String[] args) {
	    String senha, pass;
	    int i = 0;
	    senha = "java123";
	    Scanner scan = new Scanner(System.in);
	    while (i == 0){
    	    System.out.print("Entre com a senha: ");
	        pass = scan.nextLine();
	        if(pass.equals(senha)){
	            System.out.println("Senha correta, parabéns!");
	            i++;
	        }
	        else{
	            System.out.println("Senha incorreta, tente novamente!");
	        }
	    }
    }
}
