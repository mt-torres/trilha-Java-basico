package application;

import java.util.Scanner;

public class Contador {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Por favor, informe o primeiro número: ");
		int parametroUm = sc.nextInt();
		System.out.println("Por favor, informe o segundo número: ");
		int parametroDois = sc.nextInt();
		
		try {
			
			contar(parametroUm,parametroDois );
			
		} catch(ParametrosInvalidosException e) {
			//e.printStackTrace();
			System.out.println("O segundo numero deve ser maior que o primeiro, tente novamente. ");
		}
		
		sc.close();
		
	}

	public static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if(parametroDois < parametroUm ) throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		
		for(int i = 1; i <= contagem; i ++) {
			System.out.println("Imprimindo o número: " +  i );
		}
		
	}
	
}
