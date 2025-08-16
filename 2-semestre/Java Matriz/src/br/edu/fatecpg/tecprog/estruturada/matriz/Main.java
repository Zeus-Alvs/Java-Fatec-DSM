package br.edu.fatecpg.tecprog.estruturada.matriz;
import java.util.Random;

public class Main
{
	public static void main(String[] args) {
		int[][] mat1 = new int[3][3];
		int[][] mat2 = new int[3][3];
		int[][] mats = new int[3][3];
		int x = 0, y = 0;
		Random rand = new Random();
		
		System.out.println("Matriz 1: ");
		for (int i = 0; i < 9; i++){
		    if ((y%3)==0 && y != 0){
		        y = 0;
		        x++;
		        System.out.println();
		    }
		    mat1[x][y] = rand.nextInt(0,100);
		    System.out.print(mat1[x][y] + " | ");
		    y++;
		}
		x = 0;
		y = 0;
		System.out.println();
		System.out.println("Matriz 2: ");
		for (int i = 0; i < 9; i++){
		    if ((y%3)==0 && y != 0){
		        y = 0;
		        x++;
		        System.out.println();
		    }
		    mat2[x][y] = rand.nextInt(0,100);
		    System.out.print(mat2[x][y] + " | ");
		    y++;
		}
		
		x = 0;
		y = 0;
		System.out.println();
		System.out.println("Soma das Matrizes: ");
		for(int i = 0; i < 9; i++){
		    if ((y%3)==0 && y != 0){
		        y = 0;
		        x++;
		        System.out.println();
		    }
		    mats[x][y] = mat1[x][y] + mat2[x][y];
		    System.out.print(mats[x][y] + " | ");
		    y++;
		}
	}
}