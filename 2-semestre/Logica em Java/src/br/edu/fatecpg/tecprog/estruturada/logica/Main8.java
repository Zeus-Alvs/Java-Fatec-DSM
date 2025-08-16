package br.edu.fatecpg.tecprog.estruturada.logica;
import java.util.Scanner;

public class Main8
{
	public static void main(String[] args) {
	    int num, i = 1, x = 1, y = 1;
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Digite um número: ");
	    num = scan.nextInt();
	    System.out.print("1");
	    while (i < num){
	        x = x + 2;
	        y = y + x;
	        System.out.print(" + " + x);
	        i++;
	    }
	    System.out.print(" = " + y);
    }
}
