import java.util.Scanner;

public class Main4
{
	public static void main(String[] args) {
	    int num;
	    Scanner scan = new Scanner(System.in);
	    System.out.println("Entre com o número: ");
	    num = scan.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(num + " * " + i + " = " + (num*i));
        }
	}
}
