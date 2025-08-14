import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int num;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite o número: ");
	    num = scan.nextInt();
	    if(num>0){
	        System.out.println("Número positivo");
	    }
	    else{
	        System.out.println("Número negativo");
	    }
	}
}