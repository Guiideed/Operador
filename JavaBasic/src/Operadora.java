/*Programa que lê a quantidade de minutos que a pessoa consumiu, depois mostra o valor a ser paga*/
import java.util.Scanner;
import java.util.Locale;

public class Operadora {
	public static void main(String []args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		
		double conta = 50.00;
		if (min >100) {
			conta += (min-100)*2.0;
			System.out.printf("Valor = R$%.2f%n", conta);
		}else {
			System.out.println("Voce nao passou de 100 min então, a conta e de R$50.00");
		}
	}
	
	

}
