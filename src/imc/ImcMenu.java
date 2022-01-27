package imc;

import java.util.Scanner;

public class ImcMenu {

	void executar() {
		//Declaração das variáveis (Refatoração)
		int pesoDoUsuario;
		double alturaDoUsuario, imc;
		
		//Ler o teclado do usuário
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Qual e o seu nome?");
		String nomeDoUsuario = leitor.nextLine();
		
		// Mostrar qual é o caractrete que está na posição 3
		// System.out.println(nomeDoUsuario.charAt(2));
		
		// Criando as variáveis para o cálculo
		System.out.print(nomeDoUsuario + " Digite eu peso: "); //Concatenar
		pesoDoUsuario = leitor.nextInt();
		System.out.print("\nDigite sua altura: ");
		alturaDoUsuario = leitor.nextDouble();
		
		leitor.close();
		
		//Executar Method
		Imc classimc = new Imc();
		double calculoImc = classimc.calcularImc(pesoDoUsuario,alturaDoUsuario);
		
		imc = calculoImc;
		
		System.out.println("");
		System.out.println(nomeDoUsuario + ", seu imc é " + imc);
		
		classimc.classificarImc(imc);
	}
	
}
