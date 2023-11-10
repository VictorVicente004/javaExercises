import java.io.InputStream;
import java.util.Scanner;

public class SomaDeInteiros {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
 				
		System.out.println("Digite o primeiro valor");
		int valor1 = sc.nextInt();
		System.out.println("Digite o segundo valor");
		int valor2 = sc.nextInt();
		
		int soma = valor1 + valor2;
				
		System.out.println("A soma dos dois numeros da " + soma);		
		
		sc.close();				
	}

	}


