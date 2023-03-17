package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	
	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		 System.out.print("Sexo:");
	        char gender = sc.next().charAt(0);
	        System.out.print("Quantidade de cervejas:");
	        int beer = sc.nextInt();
	        System.out.print("Quantidade de refrigerantes:");
	        int softDrinks = sc.nextInt();
	        System.out.print("Quantidade de espetinhos:");
	        int barbecue = sc.nextInt();

	        Bill bill = new Bill(gender, beer, barbecue, softDrinks);

	        System.out.println("RELATÓRIO:");
	        System.out.printf("Consumo = R$ %.2f\n", bill.feeding());
	        if(bill.cover()==0) {
	        	System.out.println("Isento de Couvert");
	        }else {
	        		System.out.printf("couvert = R$ %.2f\n",bill.cover());
	        }
	        System.out.printf("Ingresso = R$ %.2f\n", bill.ticket());
	        System.out.println();
	        System.out.printf("Valor a pagar = R$ %.2f", bill.total());
	        
		
		sc.close();
	}
}
