package com;

import java.util.Scanner;

public class Calculadora {
	
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("insira o valor do primeiro numero:");
		a = scan.nextInt();
		System.out.println("insira o valor do primeiro numero:");
		b = scan.nextInt();
		System.out.println("Soma: " + soma(a, b));
		System.out.println("subtra��o: " + subtracao(a, b));
		System.out.println("divis�o: " + divisao(a, b));
		System.out.println("multiplica��o: " + multiplicacaoo(a, b));
	}
	
	public static int soma(int a, int b) {
		return a + b;
	}
	public static int subtracao(int a, int b) {
		return a - b;
	}
	public static int divisao(int a, int b) {
		return a / b;
	}
	public static int multiplicacaoo(int a, int b) {
		return a * b;
	}

}
