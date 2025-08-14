import java.util.Scanner;

public class Main3
{
	public static void main(String[] args) {
	    int num;
	    double x, a;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("(1) Calcular área do quadrado ");
	    System.out.println("(2) Calcular área do círculo ");
	    num = scan.nextInt();
	    switch (num){
	        case 1:
	            System.out.println("Entre com um lado do quadrado: ");
                x = scan.nextInt();
                a = x*x;
                System.out.println("Área do quadrado é: " + a);
                break;
	        case 2:
	            System.out.println("Entre com o raio do circulo: ");
                x = scan.nextInt();
                a = 3.14 * (x*x);
                System.out.println("Área do círculo é: " + a);
                break;
	        default:
	            System.out.println("Número invalido");
	            break;
	   }
	}
}
