import java.util.Scanner;

public class Tempo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Que horas são?");
		int horas = sc.nextInt();

		if (horas < 1200) {
			System.out.println("Bom dia");
		} else if (horas < 1800) {
				System.out.println("Boa tarde");
		}
			else {
					System.out.println("Boa noite");
				
			}
			sc.close();

			}
		}
