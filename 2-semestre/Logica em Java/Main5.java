import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	    int num, x;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite o número: ");
	    num = scan.nextInt();
	    x = num % 2;
	    if(x == 0){
	        System.out.println("Número par");
	    }
	    else{
	        System.out.println("Número impar");
	    }
	}
}