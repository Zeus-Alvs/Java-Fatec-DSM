package br.edu.fatecpg.tecprog.estruturada.logica;
import java.util.Scanner;

public class Main2
{
	public static void main(String[] args) {
	    int num1, num2;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite o 1º número: ");
	    num1 = scan.nextInt();
	    System.out.println("Digite o 2º número: ");
	    num2 = scan.nextInt();
	    if(num1 != num2){
	        System.out.println("Os números são diferentes");
	        if (num1 > num2){
	            System.out.println("O 1º número é maior.");
	        }
	        else{
	            System.out.println("O 2º número é maior.");
	        }
	    }
	    else{
	        System.out.println("Os Números são iguais!");
	    }
	}
}
