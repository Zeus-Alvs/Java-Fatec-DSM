import java.util.Scanner;

public class Main6
{
	public static void main(String[] args) {
	    long num, i;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Digite o número: ");
	    num = scan.nextInt();
	    i = num - 1;
	    System.out.print("Fatorial de " + num + ": " + num + " * ");
	    
	    while (i > 1){
	        System.out.print(i + " * ");
	        num *= i;
	        i--;
	    }
	    System.out.print("1 = " + num);
	}
}
