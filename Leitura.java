import java.util.Scanner;
import java.util.Locale;

public class Leitura {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US); // comando para ler os dados na forma americana
		Scanner sc = new Scanner(System.in); // Comando para chamar o scanner
		int y;
		String x;
		double z;
		char a;

		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		a = sc.next().charAt(0);

		System.out.println("Voce digitou: " + x);
		System.out.println("Voce escolheu: " + y);
		System.out.println("Voce escolheu: " + z);
		System.out.println("Voce digitou: " + a);
		sc.close();

	}

}
