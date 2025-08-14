import java.util.Scanner;

public class Main9
{
	public static void main(String[] args) {
	    String nomes[] = new String [5];
	    String nom;
	    int i = 0;
	    Scanner scan = new Scanner(System.in);
	    while (i < 5){
    	    System.out.print("Digite o " + (i+1) + "º nome: ");
	        nomes[i] = scan.nextLine();
	        i++;
	    }
	    System.out.print("Digite com o 6º nome: ");
	    nom = scan.nextLine();
	    i = 0;
	    for(i = 0; i < 5; i++){
	        if (nom.equals(nomes[i])){
	            System.out.println("Esse nome já foi informado!");
	        }
	        else{
	            if(i == 4)
	                i = 10;
	        }
	    }
	    if(i > 5)
	        System.out.println("OK!");
    }
}
