package principal;

import java.util.Scanner;

import entidade.Calculadora;

public class Programa {

	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.print("Informe o valor #1:");
		double v1 = sc.nextDouble();
		System.out.print("Informe o valor #2:");
		double v2 = sc.nextDouble();
		
		System.out.println("----------------------");
		System.out.println("Resultado:");
		System.out.println("Soma: " + calc.somar(v1, v2));
		System.out.println("Subtra��o: " + calc.subtrair(v1, v2));
		System.out.println("Multiplica��o: " + calc.multiplicar(v1, v2));
		System.out.println("Divis�o sem formata��o: " + calc.dividir(v1, v2));
		System.out.println("Divis�o com formata��o: " + String.format("%.2f", calc.dividir(v1, v2)));
		
		sc.close();
		
	}
	
}
