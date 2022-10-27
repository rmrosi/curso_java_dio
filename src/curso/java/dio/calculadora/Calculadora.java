package curso.java.dio.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a, b;
		
		System.out.println("Informe o primeiro valor: ");
		a = entrada.nextDouble();
		System.out.println("Informe o segundo valor: ");
		b = entrada.nextDouble();
		
		double soma = soma(a,b);
		double subtracao = subtracao(a,b);
		double multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);

		System.out.println("Soma: "+soma);
		System.out.println(subtracao);
		System.out.println(multiplicacao);
		System.out.println(divisao);
		
		entrada.close();
	}

	public static double soma(double a, double b) {
		return a+b;
	}
	public static double subtracao(double a, double b) {
		return a-b;
	}
	public static double multiplicacao(double a, double b) {
		return a*b;
	}
	public static double divisao(double a, double b) {
		return a/b;
	}
}
