package br.edu.fatecpg.tecprog.estruturada.logica;
import java.util.Scanner;

public class Main7
{
	public static void main(String[] args) {
	    int num;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Digite a idade: ");
	    num = scan.nextInt();
	    if(num < 18)
	        System.out.println("Você é de menor!");
	    else if (num >= 60)
	       System.out.println("Você é idoso...");
	    else
	        System.out.println("Você é adulto.");
	    }
}
