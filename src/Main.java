import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int intX, intCount, intSoma, intIntervalo;


		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("");
			System.out.println("Exercicio de estruturas repetitivas");
			System.out.println("");
			System.out.println("1- While");
			System.out.println("");
			System.out.print("Digite um numero para ser usado como limite de intervalo para o teste : ");
			intIntervalo = sc.nextInt();
			System.out.println("");

			// gera numero dandomicamente
			Random ran = new Random();
			int intRan = ran.nextInt(intIntervalo); // atribuira um valor entre 0 e 9 , se colocar 20 atribuira um valor
													// entre 0 e 19

			System.out.printf("Digite um numero de 0 a %d : ", intIntervalo - 1);
			intX = sc.nextInt();
			intSoma = intX;
			intCount = 0;
			// System.out.println("");

			while (intX != intRan) {
				System.out.print("Vc ainda n�o acertou digite outro numero : ");
				intX = sc.nextInt();
				intSoma = intSoma + intX; // a soma tem que estar depois do sc.nextint para n�o perder o ultimo valor
				intCount = intCount + 1;
			}

			System.out.printf("Vc acertou o numero (%d) ! %n", intX);
			System.out.printf("Dos %d numeros possiveis vc tentou digitar %d ! %n", intIntervalo, intCount + 1);
			System.out.printf("e a soma dos numeros digitados � %d !%n", intSoma);
			// %d = numero inteiro
			

			int intXf, intf, intSomaf;


			System.out.println("");
			System.out.println("2- FOR ");
			System.out.println("");
			System.out.print("Digite um numero de repeti��es para o for: ");
			intf = sc.nextInt();


			
			// System.out.print("Digite o 1� valor : ");
			intSomaf = 0;// sc.nextInt();

			for (intXf = 0; intXf < intf; intXf++) {
				System.out.printf("Digite o %d� valor : ", intXf + 1);
				intSomaf = intSomaf + sc.nextInt();

			}
			

			
			System.out.println("A soma dos valores digitados � :" + intSomaf);

			System.out.println("");
			System.out.println("3- Do - While ");
			System.out.println("");
			


			Locale.setDefault(Locale.US);
			char resp;
			
			do {
				System.out.print("Digite a temperatura em Celsius: ");
				double C = sc.nextDouble();
				double F = 9.0 * C / 5.0 + 32.0;
				System.out.printf("Equivalente em Fahrenheit: %.1f%n", F);
				System.out.print("Deseja repetir (s/n)? ");
				resp = sc.next().charAt(0);
			} while (resp != 'n');

			sc.close();
		}

	}

}
